package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("E");

        printWordsOfLength(6);


        //test dine metoder ved at kalde dem her:

        printLongestWord();

        printFirstHalfOfEachWord();

        printMostFrequentLetter();

    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:


    private static void printLongestWord() {
        String longestWord = "";
        for (String s : text) {
            if (longestWord.length() < s.length()) {
                longestWord = s;
            }
        }
        System.out.println(longestWord);
    }
    private static void printFirstHalfOfEachWord() {
        for (String s : text) {
            String halfWord = s.substring(0, s.length()/2);
            System.out.println(halfWord);
        }
    }

    private static void printMostFrequentLetter() {
        char letters[] = new char[29];
        int letterAmount[] = new int[29];

        //Sets characters in letters array to the alphabet:
        int i = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            letters[i] = c;
            i++;
        }
        letters[26] = 'Æ';
        letters[27] = 'Ø';
        letters[28] = 'Å';

        // Converts all words to letters and counts the amount each letter
        for (String s : text) {
            for (char c : s.toUpperCase().toCharArray()) {
                for (int j = 0; j < letters.length; j++) {
                    if (c == letters[j]) {
                        letterAmount[j]++;
                        break;
                    }
                }
            }
        }

        // Finds the most frequent char and prints it and the amount too
        int numberIndex = 0;
        for (int j = 0; j < letterAmount.length; j++) {
            if (letterAmount[j] > letterAmount[numberIndex]) {
                numberIndex = j;
            }
        }
        System.out.println(letters[numberIndex] + " : " + letterAmount[numberIndex]);
    }

}


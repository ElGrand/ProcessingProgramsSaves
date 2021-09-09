//-----------TASK 7---------------------
int input = 20;

for (int i = 0; i <= input; i++) { // Negative = ">" "i--" "-20"
  if (abs(i) == 6) {
    println("six");
  } else if (i == input/2) {
    println("HALF");
  } else {
    println(i);
  }
}

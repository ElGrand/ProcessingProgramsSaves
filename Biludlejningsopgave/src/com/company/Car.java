package com.company;

public abstract class Car {
    private String regNr;
    private String brand;
    private String model;
    private int year;
    private int doorAmount;

    abstract void calculateGreenOwnershipTax();
}

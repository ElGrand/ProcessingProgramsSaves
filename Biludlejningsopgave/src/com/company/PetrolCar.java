package com.company;

public class PetrolCar extends Car {
    // Attributes
    private int octaneNr = 0;
    private int kmPrL = 0;

    // Constructor
    public PetrolCar (int octaneNr, int kmPrL) {
        this.setOctaneNr(octaneNr);
        this.setKmPrL(kmPrL);
    }

    public int getOctaneNr() {
        return octaneNr;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setOctaneNr(int octaneNr) {
        this.octaneNr = octaneNr;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public String toString() {
        String myString = octaneNr+"\n"+kmPrL;
        return myString;
    }

    @Override
    void calculateGreenOwnershipTax() {
        System.out.println("calculateGreen");
    }
}

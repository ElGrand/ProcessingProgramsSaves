package com.company;

public class DieselCar extends Car {
    // Attributes
    private boolean hasParticleFilter;
    private int kmPrL;

    // Constructor
    public DieselCar (boolean hasParticleFilter, int kmPrL) {
        this.setHasParticleFilter(hasParticleFilter);
        this.setKmPrL(kmPrL);
    }

    public boolean getHasParticleFilter() {
        return hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public String toString() {
        String myString = hasParticleFilter+"\n"+kmPrL;
        return myString;
    }

    @Override
    void calculateGreenOwnershipTax() {
        System.out.println("calculateGreenOwnershipTax");
    }
}

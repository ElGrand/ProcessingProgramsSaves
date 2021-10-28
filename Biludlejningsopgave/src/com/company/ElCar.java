package com.company;

public class ElCar extends Car {
    // Attributes
    private int batteryCapacityKWh;
    private int maxKm;
    private int whPrKm;

    // Constructor
    public ElCar (int batteryCapacityKWh, int maxKm, int whPrKm) {
        this.setBatteryCapacityKWh(batteryCapacityKWh);
        this.setMaxKm(maxKm);
        this.setWhPrKm(whPrKm);
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm (int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public String toString() {
        String myString = batteryCapacityKWh+"\n"+maxKm+"\n"+whPrKm;
        return myString;
    }

    @Override
    void calculateGreenOwnershipTax() {
        System.out.println("calculateGreenOwnershipTax");
    }
}

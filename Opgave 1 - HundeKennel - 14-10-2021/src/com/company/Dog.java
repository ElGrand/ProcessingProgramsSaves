package com.company;

import java.util.ArrayList;

public class Dog {
    private String name;
    private boolean isHungry;
    private boolean owner;
    private String ownerName;
    private ArrayList<String> offSpring;

    public void Dog (String name, boolean owner) {
        this.name = name;
        this.owner = owner;
        this.offSpring = new ArrayList<String>();
    }

    public String getOwner() {
        return ownerName;
    }
    public void setOwner(String ownerName) {
        this.ownerName = ownerName;
    }

    // Tager hensyn til om hunden er sulten
    public boolean feedDog (boolean isHungry) {
        this.isHungry = isHungry;
        if (isHungry == true) {
            isHungry = false;
        } else {
            isHungry = true;
        }
    }
}

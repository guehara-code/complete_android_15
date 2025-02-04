package com.example.dependencyapp;

public class Battery {
    int powerPercentage;

    public Battery(int powerPercentage) {
        this.powerPercentage = powerPercentage;
    }

    public int getPowerPercentage() {
        return powerPercentage;
    }
}

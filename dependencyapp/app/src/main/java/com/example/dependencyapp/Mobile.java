package com.example.dependencyapp;

import android.util.Log;

public class Mobile {
    Battery battery;
    MemoryCard memoryCard;
    CPU cpu;

    public Mobile(Battery battery, MemoryCard memoryCard, CPU cpu) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.cpu = cpu;
    }

    public void printMobileSpecs() {
        Log.v("MSG", "Battery: " + battery.getPowerPercentage() + " %" + " Memory: " + memoryCard.getSizeMemory() + " MB" +
                " Processor: " + cpu.processor.getProcessorType());
    }
}

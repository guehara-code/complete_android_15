package com.example.dependencyapp;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    Battery battery;
    MemoryCard memoryCard;
    CPU cpu;

    @Inject
    public Mobile(Battery battery, MemoryCard memoryCard, CPU cpu) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.cpu = cpu;
    }

//    public void printMobileSpecs() {
//        Log.v("MSG", "Battery: " + battery.getPowerPercentage() + " %" + " Memory: " + memoryCard.getSizeMemory() + " MB" +
//                " Processor: " + cpu.processor.getProcessorType());
//    }

    public void ringNow() {
        Log.v("MSG", "Ringing...");
    }
}

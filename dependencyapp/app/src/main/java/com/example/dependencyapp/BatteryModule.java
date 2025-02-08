package com.example.dependencyapp;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Battery provideBattery() {
        return new Battery();
    }

}

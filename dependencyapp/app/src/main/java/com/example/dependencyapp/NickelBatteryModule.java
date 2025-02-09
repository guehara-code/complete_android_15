package com.example.dependencyapp;

import dagger.Module;
import dagger.Provides;

@Module
public class NickelBatteryModule {

    @Provides
    Battery provideNickelBattery(NickelBattery nickelBattery) {
        nickelBattery.showType();
        return nickelBattery;
    }
}

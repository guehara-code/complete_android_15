package com.example.dependencyapp;

import dagger.Component;

@Component(modules = NickelBatteryModule.class)
public interface MobileComponent {
    Mobile getMobile();

}

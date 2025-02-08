package com.example.dependencyapp;

import dagger.Component;

@Component(modules = BatteryModule.class)
public interface MobileComponent {
    Mobile getMobile();

}

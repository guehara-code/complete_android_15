package com.example.kotlindiapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideEngine(): Engine {
        return Engine()
    }

    @Provides
    @Singleton
    fun provideCar(engine: Engine): Car {
        return  Car(engine)
    }
}
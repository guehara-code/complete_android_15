package com.example.kotlincontactsapp.di

import android.content.Context
import com.example.kotlincontactsapp.room.ContactDao
import com.example.kotlincontactsapp.room.ContactDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context):
            ContactDatabase {
        return ContactDatabase.getDatabase(context)
    }

    @Provides
    @Singleton
    fun provideContactDao(contatDatabase: ContactDatabase):
            ContactDao {
        return contatDatabase.contactDao()
    }
}
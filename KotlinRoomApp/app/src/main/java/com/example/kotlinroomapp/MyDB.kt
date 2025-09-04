package com.example.kotlinroomapp

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)
abstract class MyDB: RoomDatabase() {

    // Getting DAO instance
    abstract fun itemDAO(): ItemDao
    //Accessing the methods to create or get the Database
    companion object {
        // Singleton pattern
        @Volatile
        private var Instance: MyDB? = null

        fun getDatabase(context: Context): MyDB {
            return Instance?: synchronized(this) {
                androidx.room.Room.databaseBuilder(
                    context,
                    MyDB::class.java,
                    "time_database"
                ).allowMainThreadQueries().build()
                    .also { Instance = it }
            }
        }

    }


}
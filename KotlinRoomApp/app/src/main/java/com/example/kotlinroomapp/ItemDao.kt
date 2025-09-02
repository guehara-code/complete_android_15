package com.example.kotlinroomapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ItemDao {

    @Insert
    fun insertItem(item: Item)

    @Delete
    fun deleteItem(item: Item)

    @Update
    fun updateItem(item: Item)

    @Query("DELETE FROM Item")
    fun deleteAllItems()

    @Query("SELECT * FROM Item order by id desc")
    fun getAllItemsInDB(): LiveData<List<Item>>

}
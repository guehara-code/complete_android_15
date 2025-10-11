package com.example.kotlincontactsapp.repo

import androidx.lifecycle.LiveData
import com.example.kotlincontactsapp.room.Contact
import com.example.kotlincontactsapp.room.ContactDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactRepository @Inject constructor(private val contactDao: ContactDao) {

    val allContacts: LiveData<List<Contact>> =
        contactDao.getAllContacts()

    suspend fun insert(contact: Contact) {
        contactDao.insertContact(contact)
    }

    suspend fun delete(contact: Contact) {
        contactDao.deleteContact(contact)
    }

}
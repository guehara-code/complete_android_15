package com.example.kotlincontactsmanagerapp.viewmodel


import androidx.databinding.Observable
import androidx.lifecycle.ViewModel
import com.example.kotlincontactsmanagerapp.repository.ContactRepository
import com.example.kotlincontactsmanagerapp.room.Contact

class ContactViewModel (private val repository: ContactRepository): ViewModel(), Observable {

    val users = repository.contacts
    private var isUpdateOrDelete = false
    private lateinit var contactToUpdateOrDelete: Contact

}
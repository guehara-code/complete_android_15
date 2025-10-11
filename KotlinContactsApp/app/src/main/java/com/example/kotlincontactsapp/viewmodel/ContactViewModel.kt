package com.example.kotlincontactsapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlincontactsapp.repo.ContactRepository
import com.example.kotlincontactsapp.room.Contact
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(private val repository: ContactRepository): ViewModel() {

    val allContacts: LiveData<List<Contact>> = repository.allContacts

    fun insert(contact: Contact) {
        viewModelScope.launch {
            repository.insert(contact)
        }
    }

    fun delete(contact: Contact) {
        viewModelScope.launch {
            repository.delete(contact)
        }
    }

}
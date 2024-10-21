package com.example.contactsmanagerapp;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends AndroidViewModel {

    private Repository myRepository;

    private LiveData<List<Contacts>> allContacts;

    public MyViewModel(@NonNull Application application) {
        super(application);
        this.myRepository = new Repository(application);
    }

    public LiveData<List<Contacts>> getAllContacts() {
        Log.v("TAGY", "GETALLCONTACTS START");
        allContacts = myRepository.getAllContacts();
        Log.v("TAGY", "GETALLCONTACTS OK");
        return allContacts;
    }

    public void addNewContact(Contacts contact) {
        myRepository.addContact(contact);
    }

    public void deleteContact(Contacts contact) {
        myRepository.deleteContact(contact);
    }
}

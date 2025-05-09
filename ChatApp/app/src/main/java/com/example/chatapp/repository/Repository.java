package com.example.chatapp.repository;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.chatapp.model.ChatGroup;
import com.example.chatapp.views.GroupsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    // It acts as a bridge between the ViewModel and the data Source

    MutableLiveData<List<ChatGroup>> chatGroupMutableLiveData;

    FirebaseDatabase database;
    DatabaseReference reference;

    public Repository() {
        this.chatGroupMutableLiveData = new MutableLiveData<>();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();
    }

    public void firebaseAnonymousAuth(Context context) {
        Log.v("debug", "FirebaseAnonymousAuth init");
        FirebaseAuth.getInstance().signInAnonymously()
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.v("debug", "FirebaseAnonymousAuth successful");
                            Intent i  = new Intent(context, GroupsActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(i);
                        }
                    }
                });

    }

    // Getting Current User ID
    public String getCurrentUserId() {
        return FirebaseAuth.getInstance().getUid();
    }

    // SignOut Functionality
    public void signOut() {
        FirebaseAuth.getInstance().signOut();
    }

    // Getting Chat Groups available from Firebase realtime DB


    public MutableLiveData<List<ChatGroup>> getChatGroupMutableLiveData() {
        List<ChatGroup> groupsList = new ArrayList<>();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                groupsList.clear();

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ChatGroup group = new ChatGroup(dataSnapshot.getKey());
                    groupsList.add(group);
                }

                chatGroupMutableLiveData.postValue(groupsList);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return chatGroupMutableLiveData;
    }

    // Creating a new group
    public void createNewChatGroup(String groupName) {
        reference.setValue(groupName);
    }
}

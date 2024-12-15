package com.example.chatapp.repository;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.chatapp.views.GroupsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.List;

public class Repository {

    // It acts as a bridge between the ViewModel and the data Source

//    MutableLiveData<List<ChatGroup>> chatGroupMutableLiveData;


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


}

package com.example.chatapp.repository;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.example.chatapp.views.GroupsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Repository {

    // It acts as a bridge between the ViewModel and the data Source

    public void firebaseAnonymousAuth(Context context) {
        FirebaseAuth.getInstance().signInAnonymously()
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
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

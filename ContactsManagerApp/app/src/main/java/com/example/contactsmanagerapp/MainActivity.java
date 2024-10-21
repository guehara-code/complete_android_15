package com.example.contactsmanagerapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsmanagerapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ContactDatabase contactDatabase;
    private ArrayList<Contacts> contacts = new ArrayList<>();

    private MyAdapter myAdapter;

    private ActivityMainBinding mainBinding;
    private MainActivityClickHandlers handlers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        handlers = new MainActivityClickHandlers(this);

        mainBinding.setClickHandler(handlers);

        RecyclerView recyclerView = mainBinding.recyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        myAdapter = new MyAdapter(contacts);

        contactDatabase = ContactDatabase.getInstance(this);

        MyViewModel viewModel = new ViewModelProvider(this)
                .get(MyViewModel.class);

        Contacts c1 = new Contacts("Jack", "jack@gmail.com");
        viewModel.addNewContact(c1);

        viewModel.getAllContacts().observe(this,
                new Observer<List<Contacts>>() {
                    @Override
                    public void onChanged(List<Contacts> contacts) {
                        for(Contacts c : contacts) {
                            Log.v("TAGY", c.getName());
                        }
                    }
                });

        recyclerView.setAdapter(myAdapter);

    }
}
package com.lollem.reciclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.rvContact = findViewById(R.id.rclViewContact);
        this.rvContact.setLayoutManager(new LinearLayoutManager((getApplicationContext())));

        ContactAdapter contactAdapter = new ContactAdapter(getApplicationContext());
        this.rvContact.setAdapter(contactAdapter);

    }
}
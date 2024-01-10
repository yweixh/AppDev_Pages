package com.example.appdev_pages;

import static com.example.appdev_pages.MainActivity.openDrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appdev_pages.Adapter.ArchivedWordAdapter;
import com.example.appdev_pages.Model.ArchivedWord;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.Firebase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.List;

public class Archive extends AppCompatActivity {

    ArchivedWordAdapter adapter;
    RecyclerView recyclerView;
    ImageView bookmark, backButton;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive);

        bookmark = findViewById(R.id.bookmark);
        backButton = findViewById(R.id.backButton);

        recyclerView = findViewById(R.id.recycler_view);


        // Load archived words from Firestore

        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaved_Words();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }


    public void openSaved_Words(){
        Intent intent = new Intent(this, Saved_Words.class);
        startActivity(intent);
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
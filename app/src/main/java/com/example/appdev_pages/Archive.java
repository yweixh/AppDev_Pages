package com.example.appdev_pages;

import static com.example.appdev_pages.MainActivity.openDrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Archive extends AppCompatActivity {

    ImageView bookmark, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive);

        bookmark = findViewById(R.id.bookmark);
        backButton = findViewById(R.id.backButton);

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
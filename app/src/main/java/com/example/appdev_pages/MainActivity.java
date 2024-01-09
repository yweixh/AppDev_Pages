package com.example.appdev_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout gameplay, archive, history, profile, faqs, feedback, logout;
    Button singleBtn, multiBtn;
    boolean isButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu_icon);
        gameplay = findViewById(R.id.gameplay);
        archive = findViewById(R.id.archive);
        history = findViewById(R.id.history);
        profile = findViewById(R.id.profile);
        faqs = findViewById(R.id.faqs);
        feedback = findViewById(R.id.feedback);
        logout = findViewById(R.id.logout);

        singleBtn = findViewById(R.id.SingleBtn);
        multiBtn = findViewById(R.id.MultiBtn);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);

            }
        });
        gameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArchive();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFAQs();
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedback();
            }
        });

        singleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseDifficultyActivity.class);
                startActivity(intent);
            }
        });
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseDifficultyActivity.class);
                startActivity(intent);
            }
        });

    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openArchive(){
        Intent intent = new Intent(this,Archive.class);
        startActivity(intent);
    }
    public void openHistory(){
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void openFAQs(){
        Intent intent = new Intent(this, FAQs.class);
        startActivity(intent);
    }
    public void openFeedback(){
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
    }

}
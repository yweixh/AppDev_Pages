package com.example.appdev_pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseDifficultyActivity extends AppCompatActivity {

    Button easy, average, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_difficulty);

        easy = findViewById(R.id.EasyBtn);
        average = findViewById(R.id.AverageBtn);
        hard = findViewById(R.id.DiffBtn);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseDifficultyActivity.this, EasyGameplay.class);
                startActivity(i);
            }
        });
        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseDifficultyActivity.this, AverageGameplay.class);
                startActivity(i);
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseDifficultyActivity.this, HardGameplay.class);
                startActivity(i);
            }
        });
    }
}
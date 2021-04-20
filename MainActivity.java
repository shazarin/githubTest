package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button buttonHappy;
    Button buttonSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHappy = findViewById(R.id.btn_satisfied);
        buttonSad = findViewById(R.id.btn_dissatisfied);
        imageView = findViewById(R.id.imageView);

        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ic_baseline_sentiment_very_satisfied_96);
            }
        });
        buttonSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_96);
            }
        });
    }
}
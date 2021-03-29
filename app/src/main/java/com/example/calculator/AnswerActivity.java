package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        //Get the intent and extract the string
        Intent intent = getIntent();
        String answer = intent.getStringExtra("answer");

        TextView answerText = findViewById(R.id.answerLabel);
        answerText.setText(answer);
    }
}
package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {
    TextView textV1;
    RadioGroup radioGroup1Rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        handleInitViews();
        Intent intent = getIntent();
        String question = intent.getStringExtra("question1");
        String optionA = intent.getStringExtra("option1");
        String optionB = intent.getStringExtra("option2");
        String optionC = intent.getStringExtra("option3");
        String optionD = intent.getStringExtra("option4");
        textV1.setText(question);
        rb1.setText(optionA);
        rb2.setText(optionB);
        rb3.setText(optionC);
        rb4.setText(optionD);
    }

    private void handleInitViews() {
        textV1 = findViewById(R.id.textv1_tv);
        radioGroup1Rg = findViewById(R.id.radioGroup1_rg);
        rb1 = findViewById(R.id.rb_1);
        rb2 = findViewById(R.id.rb_2);
        rb3 = findViewById(R.id.rb_3);
        rb4 = findViewById(R.id.rb_4);
    }
}
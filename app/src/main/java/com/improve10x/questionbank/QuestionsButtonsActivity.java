package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class QuestionsButtonsActivity extends AppCompatActivity {
    Button question1Btn;
    Button question2Btn;
    Button question3Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_buttons);
        handleInitViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
    }
    private  void handleQuestion3Btn(){
        question3Btn.setOnClickListener(v -> {
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();

        });


    }
    private void handleQuestion2Btn(){
        question2Btn.setOnClickListener(view -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "A";
            String optionB = "B";
            String optionC = "C";
            String optionD = "D";
            navigateToQuestionActivity(question,optionA,optionB,optionC,optionD);

        });

    }
    private void handleQuestion1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How many plantes are there in solar system";
            String optionA = "A";
            String optionB = "B";
            String optionC = "C";
            String optionD = "D";
            navigateToQuestionActivity(question,optionA,optionB,optionC,optionD);

        });
    }

    private void handleInitViews() {
        question1Btn = findViewById(R.id.question_1_btn);
        question2Btn = findViewById(R.id.question_2_btn);
        question3Btn = findViewById(R.id.question_3_btn);
    }
    private void navigateToQuestionActivity(String question, String optionA , String optionB , String optionC , String optionD){
        Intent questionActivity = new Intent(this,QuestionsActivity.class);
        questionActivity.putExtra("question1",question);
        questionActivity.putExtra("option1",optionA);
        questionActivity.putExtra("option2",optionB);
        questionActivity.putExtra("option3",optionC);
        questionActivity.putExtra("option4",optionD);
        startActivity(questionActivity);

    }
}
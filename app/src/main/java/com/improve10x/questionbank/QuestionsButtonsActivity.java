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
        initViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
    }
    private  void handleQuestion3Btn(){
        question3Btn.setOnClickListener(v -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3.   It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true. ";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            navigateToQuestionActivity(question,optionA,optionB,optionC,optionD);


        });


    }
    private void handleQuestion2Btn(){
        question2Btn.setOnClickListener(view -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "True";
            String optionB = "False";
            String optionC = "All of the above";
            String optionD = "None of the above";
            navigateToQuestionActivity(question,optionA,optionB,optionC,optionD);

        });

    }
    private void handleQuestion1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How many plantes are there in solar system";
            String optionA = "10";
            String optionB = "8";
            String optionC = "12";
            String optionD = "9";
            navigateToQuestionActivity(question,optionA,optionB,optionC,optionD);

        });
    }

    private void initViews() {
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
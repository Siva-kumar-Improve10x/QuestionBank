package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity implements IQuestionActivity {
    TextView textV1;
    RadioGroup radioGroup1Rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button verifyBtn;

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        handleInitViews();
        getQuestion();
        displayData();
        handleSubmitBtn();

    }

    private void handleInitViews() {
        textV1 = findViewById(R.id.textv1_tv);
        radioGroup1Rg = findViewById(R.id.radioGroup1_rg);
        verifyBtn = findViewById(R.id.verify_Btn);
        rb1 = findViewById(R.id.rb_1);
        rb2 = findViewById(R.id.rb_2);
        rb3 = findViewById(R.id.rb_3);
        rb4 = findViewById(R.id.rb_4);
    }

    public void  handleSubmitBtn(){
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });

    }

    @Override
    public void getQuestion() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question1");
        optionA  = intent.getStringExtra("option1");
        optionB  = intent.getStringExtra("option2");
        optionC  = intent.getStringExtra("option3");
        optionD  = intent.getStringExtra("option4");
        answer   = intent.getStringExtra("answer");


    }

    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if(answer.equals(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer ):", Toast.LENGTH_SHORT).show();
        }
    }

    public  void  displayData(){
        textV1.setText(question);
        rb1.setText(optionA);
        rb2.setText(optionB);
        rb3.setText(optionC);
        rb4.setText(optionD);
    }

    @Override
    public String getSelectedOptions() {
        int selectedOption = radioGroup1Rg.getCheckedRadioButtonId();
        String result = "";
        if (selectedOption == R.id.rb_1){
            result = "a";
        }else if(selectedOption == R.id.rb_2){
            result = "b";
        }else if (selectedOption == R.id.rb_3){
            result = "c";
        }else if (selectedOption == R.id.rb_4){
            result = "d";
        }
        return result;
    }
}
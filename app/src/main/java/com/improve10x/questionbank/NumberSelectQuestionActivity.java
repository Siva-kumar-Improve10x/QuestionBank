package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IQuestionActivity {
    TextView numQuestionTxt;
    SeekBar seekbarSb;
    Button verifySeekbarBtn;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        initViews();
        getQuestion();
        displayData();
    }

    private void initViews() {
        numQuestionTxt = findViewById(R.id.numquestion_txt);
        seekbarSb = findViewById(R.id.seekbar_sb);
        verifySeekbarBtn = findViewById(R.id.verifyseekbar_btn);
    }

    @Override
    public void handleSubmitBtn() {
        verifySeekbarBtn.setOnClickListener(v -> {
        });

    }

    @Override
    public void getQuestion() {
        Intent intent = new Intent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");

    }

    @Override
    public void displayData() {
        numQuestionTxt.setText(question);



    }

    @Override
    public String getSelectedOptions() {
        return null;
    }

    @Override
    public void verifyAnswer() {

    }
}
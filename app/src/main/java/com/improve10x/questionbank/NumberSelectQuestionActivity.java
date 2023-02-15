package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

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
        handleSubmitBtn();
        getSelectedOptions();
    }

    private void initViews() {
        numQuestionTxt = findViewById(R.id.numquestion_txt);
        seekbarSb = findViewById(R.id.seekbar_sb);
        verifySeekbarBtn = findViewById(R.id.verifyseekbar_btn);
    }

    @Override
    public void handleSubmitBtn() {
        verifySeekbarBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    @Override
    public void getQuestion() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question2");
        answer = intent.getStringExtra("answer");
    }

    @Override
    public void displayData() {
        numQuestionTxt.setText(question);
    }

    @Override
    public String getSelectedOptions() {
        int process = seekbarSb.getProgress();
        return process + "";
    }

    @Override
    public void verifyAnswer() {
        String number = getSelectedOptions();
        if (answer.equalsIgnoreCase(number)) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }
}
package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextQuestionActivity extends AppCompatActivity implements IQuestionActivity {
    TextView tqTextviewTxt;
    EditText tqEdittextTxt;
    Button tqVerifyBtn;
    String answer;
    String question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
        initViews();
        getQuestion();
        displayData();
        handleSubmitBtn();
        getSelectedOptions();

    }

    private void initViews() {
        tqTextviewTxt = findViewById(R.id.tqtextview_txt);
        tqEdittextTxt = findViewById(R.id.tqedittext_txt);
        tqVerifyBtn = findViewById(R.id.tqverify_btn);
    }

    @Override
    public void handleSubmitBtn() {
        tqVerifyBtn.setOnClickListener(v -> {
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
        tqTextviewTxt.setText(question);

    }

    @Override
    public String getSelectedOptions() {
        String entredText = tqEdittextTxt.getText().toString();
        return entredText;
    }

    @Override
    public void verifyAnswer() {
        String Answer = getSelectedOptions();
        if (answer.equalsIgnoreCase(Answer)) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }

    }
}
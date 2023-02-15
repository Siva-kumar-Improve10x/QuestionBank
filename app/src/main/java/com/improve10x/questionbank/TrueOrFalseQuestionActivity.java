package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IQuestionActivity {
    TextView toFTextViewTxt;
    RadioGroup torFRg;
    RadioButton trueRb;
    RadioButton falseRb;
    Button torFVerifyBtn;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false_question);
        initViews();
        getQuestion();
        handleSubmitBtn();
        displayData();

    }

    private void initViews() {
        toFTextViewTxt = findViewById(R.id.torftextview_txt);
        torFRg = findViewById(R.id.TorF_rg);
        trueRb = findViewById(R.id.true_rb);
        falseRb = findViewById(R.id.false_rb);
        torFVerifyBtn = findViewById(R.id.torfverify_btn);
    }

    @Override
    public void handleSubmitBtn() {
        torFVerifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });

    }

    @Override
    public void getQuestion() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question1");
        answer   = intent.getStringExtra("answer");

    }

    @Override
    public void displayData() {
        toFTextViewTxt.setText(question);
    }

    @Override
    public String getSelectedOptions() {
        int SelectedId = torFRg.getCheckedRadioButtonId();
        RadioButton SelectedOptionRb = findViewById(SelectedId);
        String text = SelectedOptionRb.getText().toString();
        return text;

    }

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOptions();
        if(answer.equalsIgnoreCase(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer ):", Toast.LENGTH_SHORT).show();
        }
    }
}
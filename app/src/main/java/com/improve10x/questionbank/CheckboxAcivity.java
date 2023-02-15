package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CheckboxAcivity extends AppCompatActivity implements IQuestionActivity {
    TextView cbQuestionTxt;
    CheckBox optionACb;
    CheckBox optionBCb;
    CheckBox optionCCb;
    CheckBox optionDCb;
    Button checkboxVerifyBtn;

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chedkbox_acivity);
        inItViews();
        getQuestion();
        displayData();

    }

    private void inItViews() {
        cbQuestionTxt = findViewById(R.id.cbquestion_txt);
        optionACb = findViewById(R.id.OptionA_cb);
        optionBCb = findViewById(R.id.optionB_cb);
        optionCCb = findViewById(R.id.optionC_cb);
        optionDCb = findViewById(R.id.optionD_cb);
        checkboxVerifyBtn = findViewById(R.id.checkboxverify_Btn);

    }



    public void displayData() {
        cbQuestionTxt.setText(question);
        optionACb.setText(optionA);
        optionBCb.setText(optionB);
        optionCCb.setText(optionC);
        optionDCb.setText(optionD);
    }

    @Override
    public String getSelectedOptions() {

        return null;
    }

    public void handleSubmitBtn() {
        checkboxVerifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    @Override
    public void getQuestion() {
        Intent intent = new Intent();
        question = intent.getStringExtra("question1");
        optionA = intent.getStringExtra("option1");
        optionB = intent.getStringExtra("option2");
        optionC = intent.getStringExtra("option3");
        optionD = intent.getStringExtra("option4");
        answer = intent.getStringExtra("answer");
    }

    public void verifyAnswer() {
//        String selectedAnswer = d();
//        if (answer.equals(selectedAnswer)) {
//            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Wrong Answer ):", Toast.LENGTH_SHORT).show();
//        }
//    }

}
    }
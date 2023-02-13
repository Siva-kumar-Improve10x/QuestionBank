package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxAcivity extends AppCompatActivity {
    TextView cbQuestionTxt;
    CheckBox optionACb;
    CheckBox optionBCb;
    CheckBox optionCCb;
    CheckBox optionDCb;
    Button checkboxVerifyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chedkbox_acivity);
        inItViews();
    }

    private void inItViews() {
        cbQuestionTxt = findViewById(R.id.cbquestion_txt);
        optionACb = findViewById(R.id.OptionA_cb);
        optionBCb = findViewById(R.id.optionB_cb);
        optionCCb = findViewById(R.id.optionC_cb);
        optionDCb = findViewById(R.id.optionD_cb);
        checkboxVerifyBtn = findViewById(R.id.checkboxverify_Btn);

    }
}
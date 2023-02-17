package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TeacherAndStudentsActivity extends AppCompatActivity {
    TextView torSTextviewBtn;
    Button teacherBtn;
    Button studentsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_and_students);
        initView();
        handleImStudentsBtn();
    }

    private void handleImStudentsBtn() {
        studentsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,QuestionsButtonsActivity.class);
            startActivity(intent);

        });
    }

    private void initView() {
        torSTextviewBtn = findViewById(R.id.torstextview_btn);
        teacherBtn = findViewById(R.id.teacher_btn);
        studentsBtn = findViewById(R.id.student_btn);
    }
}
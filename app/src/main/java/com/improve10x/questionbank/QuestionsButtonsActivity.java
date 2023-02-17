package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionsButtonsActivity extends AppCompatActivity {
    Button question1Btn;
    Button question2Btn;
    Button question3Btn;
    Button question4Btn;
    Button question5Btn;
    Button question6Btn;
    Button question7Btn;
    Button question8Btn;
    Button question9Btn;
    Button question10Btn;
    Button question11btn;
    Button question12btn;
    Button question13btn;
    Button question14btn;
    Button question15btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_buttons);
        initViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleQuestion4CbBtn();
        handleQuestion5CbBtn();
        handleQuestion6CbBtn();
        handleQuestion7TorFBtn();
        handleQuestion8TorFBtn();
        handleQuestion9TorFBtn();
        handleQuestion10QueSelBtn();
        handleQuestion11QueSelBtn();
        handleQuestion12QueSelBtn();
        handleQuestion13TQBtn();
        handleQuestion14TQBtn();
        handleQuestion15TQBtn();

    }

    private void handleQuestion15TQBtn() {
        question15btn.setOnClickListener(v -> {
            String question = "_____________ component is used to suppoer vertical Scrolling";
            String answer = "Scrollview";
            String trimTXt = answer.trim();
            navigateToTextQuestionActivity(question,trimTXt);

        });
    }

    private void handleQuestion14TQBtn() {
        question14btn.setOnClickListener(v -> {
            String question = "Android is an ________";
            String answer = "Operating System";
            String trimTxt = answer.trim();
            navigateToTextQuestionActivity(question,trimTxt);
        });
    }

    private void handleQuestion13TQBtn() {
        question13btn.setOnClickListener(v -> {
            String question = "Java ______ can contain variables and methods";
            String answer = "Class";
            String trimTxt = answer.trim();
            navigateToTextQuestionActivity(question,trimTxt);
        });
    }

    private void handleQuestion12QueSelBtn() {
        question12btn.setOnClickListener(v -> {
            String question = " What is the size of \"double\" data type in bytes";
            String answer = "8";
            navigateToNumberSelectActivity(question, answer);
        });
    }

    private void handleQuestion11QueSelBtn() {
        question11btn.setOnClickListener(v -> {
            String question = "What is the size of \"long\" data type in bytes";
            String answer = "8";
            navigateToNumberSelectActivity(question, answer);
        });

    }

    private void handleQuestion10QueSelBtn() {
        question10Btn.setOnClickListener(v -> {
            String question = "What is the size of \"int\" data type in bytes";
            String answer = "4";
            navigateToNumberSelectActivity(question, answer);
        });
    }

    private void handleQuestion9TorFBtn() {
        question9Btn.setOnClickListener(v -> {
            String question = "Android emulator takes very less space";
            String answer = "False";
            navigateTrueOrFalseQuestionActivity(question, answer);

        });
    }

    private void handleQuestion8TorFBtn() {
        question8Btn.setOnClickListener(v -> {
            String question = "Android Studio supports Java programming language";
            String answer = "True";
            navigateTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void handleQuestion7TorFBtn() {
        question7Btn.setOnClickListener(v -> {
            String question = "Java is a programming language?";
            String answer = "True";
            navigateTrueOrFalseQuestionActivity(question, answer);

        });
    }

    private void handleQuestion6CbBtn() {
        question6Btn.setOnClickListener(v -> {
            String question = "Which of the following are planets";
            String optionA = "Mercury";
            String optionB = "Sun";
            String optionC = "Jupiter";
            String optionD = "Saturn";
            String answer = "acd";
            navigateToCheckBoxActvity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void handleQuestion5CbBtn() {
        question5Btn.setOnClickListener(v -> {
            String question = "Select activity lifecycle methods in Android";
            String optionA = "onCreate";
            String optionB = "onStop";
            String optionC = "onResume";
            String optionD = "onPause";
            String answer = "abcd";
            navigateToCheckBoxActvity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void handleQuestion4CbBtn() {
        question4Btn.setOnClickListener(v -> {
            String question = " Select all the parts of a computer";
            String optionA = "cat";
            String optionB = "Mouse";
            String optionC = "Monitor";
            String optionD = "keyboard";
            String answer = "bcd";
            navigateToCheckBoxActvity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion3Btn() {
        question3Btn.setOnClickListener(v -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3.   It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true. ";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            String answer = "a";
            navigateToQuestionActivity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void handleQuestion2Btn() {
        question2Btn.setOnClickListener(view -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "True";
            String optionB = "False";
            String optionC = "All of the above";
            String optionD = "None of the above";
            String answer = "a";
            navigateToQuestionActivity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void handleQuestion1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How many plantes are there in solar system";
            String optionA = "10";
            String optionB = "8";
            String optionC = "12";
            String optionD = "9";
            String answer = "b";
            navigateToQuestionActivity(question, optionA, optionB, optionC, optionD, answer);

        });
    }

    private void initViews() {
        question1Btn = findViewById(R.id.question_1_btn);
        question2Btn = findViewById(R.id.question_2_btn);
        question3Btn = findViewById(R.id.question_3_btn);
        question4Btn = findViewById(R.id.question_4_btn);
        question5Btn = findViewById(R.id.question_5_btn);
        question6Btn = findViewById(R.id.question_6_btn);
        question7Btn = findViewById(R.id.question_7_btn);
        question8Btn = findViewById(R.id.question_8_btn);
        question9Btn = findViewById(R.id.question_9_btn);
        question10Btn = findViewById(R.id.question_10_btn);
        question11btn = findViewById(R.id.question_11_btn);
        question12btn = findViewById(R.id.question_12_btn);
        question13btn = findViewById(R.id.question_13_btn);
        question14btn = findViewById(R.id.question_14_btn);
        question15btn = findViewById(R.id.question_15_btn);

    }

    private void navigateToQuestionActivity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent questionActivity = new Intent(this, QuestionsActivity.class);
        questionActivity.putExtra("question1", question);
        questionActivity.putExtra("option1", optionA);
        questionActivity.putExtra("option2", optionB);
        questionActivity.putExtra("option3", optionC);
        questionActivity.putExtra("option4", optionD);
        questionActivity.putExtra("answer", answer);
        startActivity(questionActivity);
    }

    private void navigateToCheckBoxActvity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent checkBoxActivity = new Intent(this, CheckboxAcivity.class);
        checkBoxActivity.putExtra("question1", question);
        checkBoxActivity.putExtra("option1", optionA);
        checkBoxActivity.putExtra("option2", optionB);
        checkBoxActivity.putExtra("option3", optionC);
        checkBoxActivity.putExtra("option4", optionD);
        checkBoxActivity.putExtra("answer", answer);
        startActivity(checkBoxActivity);
    }

    private void navigateTrueOrFalseQuestionActivity(String question, String answer) {
        Intent trueOrFalseQuestion = new Intent(this, TrueOrFalseQuestionActivity.class);
        trueOrFalseQuestion.putExtra("question1", question);
        trueOrFalseQuestion.putExtra("answer", answer);
        startActivity(trueOrFalseQuestion);
    }

    private void navigateToNumberSelectActivity(String question, String answer) {
        Intent numberSelectQuestionActivity = new Intent(this, NumberSelectQuestionActivity.class);
        numberSelectQuestionActivity.putExtra("question2", question);
        numberSelectQuestionActivity.putExtra("answer", answer);
        startActivity(numberSelectQuestionActivity);
    }

    private void navigateToTextQuestionActivity(String question, String answer) {
        Intent textQuestionActivity = new Intent(this, TextQuestionActivity.class);
        textQuestionActivity.putExtra("question2", question);
        textQuestionActivity.putExtra("answer", answer);
        startActivity(textQuestionActivity);
    }
}
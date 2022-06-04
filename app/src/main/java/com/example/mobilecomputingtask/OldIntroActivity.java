package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OldIntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button lesson,quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_intro);

        lesson = findViewById(R.id.lesson);
        quiz = findViewById(R.id.quiz);

        lesson.setOnClickListener(this);
        quiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.lesson:
                intent = new Intent(this, OldLessonsActivity.class);
                break;
            case R.id.quiz:
                intent = new Intent(this, OldQuizAnswerActivity.class);
                break;
        }
        startActivity(intent);
    }
}
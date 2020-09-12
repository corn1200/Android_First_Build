package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // 이 활동을 시작한 Intent 를 가져오고 문자열을 추출한다.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // 레이아웃의 TextView 를 캡처하고 문자열을 텍스트로 설정한다.
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
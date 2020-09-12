package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     유저가 send 버튼을 누를 때 호출 됨
    public void sendMessage(View view) {
        // Intent 생성자는 두 매개변수 Context 와 Class 를 사용한다.
        // 이 경우 시스템에서 intent 를 전달하는 앱 구성요소의 Class 매개변수는 시작할 활동이다.
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Intent 는 개별 구성요소 간에 런타임 바인딩을 제공하는 객체이다.
        // Intent 는 어떤 작업을 하려는 앱의 의도를 나타내고 매우 다양한 작업에 사용할 수 있다.
        // 이 과정에서 Intent 는 다른 활동을 시작한다.

        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString(); // editText 에 입력한 문자를 가져온다.

        // putExtra() 메서드는 EditText 값을 Intent 에 추가한다.
        // Intent 는 데이터 유형을 extras 라는 키-값 쌍으로 전달할 수 있다.
        intent.putExtra(EXTRA_MESSAGE, message);
        // 다음 활동에서 키를 사용하여 텍스트 값을 검색하기 때문에 키는 공개 상수 EXTRA_MESSAGE 이다.
        // 앱의 패키지 이름을 접두사로 사용해 Intent extras 의 키를 정의하는 것이 좋다.
        // 그러면 앱이 다른 앱과 상호작용하는 경우 키가 고유하게 유지된다.

        // startActivity() 메소드는 Intent 로 지정된 DisplayMessageActivity 의 인스턴스를 시작한다.
        startActivity(intent);
    }
}
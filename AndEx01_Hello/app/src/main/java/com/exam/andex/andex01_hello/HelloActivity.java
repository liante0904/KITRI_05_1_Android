package com.exam.andex.andex01_hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void click01(View v){
        Toast.makeText(getApplicationContext(),"클릭 이벤트 확인 !!!", Toast.LENGTH_SHORT).show();
    }


}

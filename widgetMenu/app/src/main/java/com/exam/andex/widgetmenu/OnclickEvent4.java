package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-14.
 */
public class OnclickEvent4 extends Activity {
    class MyListenerClass implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onclickevent4);
        Button button = (Button) findViewById(R.id.onclickEvent4_bt);

        MyListenerClass buttonListener = new MyListenerClass();
        button.setOnClickListener(buttonListener);
    }
}

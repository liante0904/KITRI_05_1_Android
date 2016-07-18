package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-15.
 */
public class TouchListener01 extends Activity{
    Button clickBtn, touchBtn;
    TextView clickNum, touchNum;
    int mCount, mCount2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener01);
        clickBtn= (Button) findViewById(R.id.onclickBtn);
        touchBtn= (Button) findViewById(R.id.ontouchBtn);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount++;
                clickNum.setText(String.valueOf(mCount));
            }
        });

        touchBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int status = event.getAction();
                mCount2++;
                touchNum.setText(String.valueOf(mCount2));

                if (status == MotionEvent.ACTION_UP){
                    touchNum.setText(String.valueOf(mCount2));
                }
                return false;
            }
        });
        clickNum= (TextView) findViewById(R.id.onclickNum);
        touchNum= (TextView) findViewById(R.id.ontouchNum);
    }

}

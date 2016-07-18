package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-15.
 */
public class TouchListener02 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener02);
        final ImageView dragImg= (ImageView) findViewById(R.id.dragImg);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.touch02_lineLay1);
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_MOVE:
                        Toast.makeText(getApplicationContext(),String.valueOf(event.getX()) +","+String.valueOf(event.getY()),Toast.LENGTH_SHORT).show();
                        dragImg.setX(event.getX());
                        dragImg.setY(event.getY());
                }
                return true;
            }
        });
    }
}

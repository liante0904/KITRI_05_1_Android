package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */

public class PaintEx01 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintEx01V makeLayout = new PaintEx01V(this);
        setContentView(makeLayout);
    }



    class PaintEx01V extends View{
        int x = 100, y =100;
        public PaintEx01V(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            paint.setTextSize(100f);
            //canvas.drawRect(x-100, y-100, x+100, y+100, paint);
            canvas.drawCircle(x-20f, y-20f, 500f, paint);

            canvas.drawText("Nice", 0, 300, paint);

        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction()){
                case MotionEvent.ACTION_DOWN:
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_UP:
                    x = (int)event.getX();
                    y = (int)event.getY();
                    invalidate();
            }
                 return true;
//            return super.onTouchEvent(event);
        }
    }


}

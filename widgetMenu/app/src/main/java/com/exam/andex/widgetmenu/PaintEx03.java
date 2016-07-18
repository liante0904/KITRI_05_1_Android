package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016-07-18.
 */
public class PaintEx03 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintEx03V makeLayout = new PaintEx03V(this);
        setContentView(makeLayout);
    }

    class PaintEx03V extends View{
        public PaintEx03V(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.BLACK);
            int k = 1500;

            for (int i = 0; i < 10; i++){
                paint.setStrokeWidth(7f);
                canvas.drawLine(200, k, 1000, k,paint);
                k = k - 100;
            } // 가로 10줄
            canvas.drawLine(200,1500,200,400, paint);

            paint.setTextSize(45f);
            int thisY = 1420;
            int cnt = 10;
            while (cnt <=100){
                String print ="";
                print = String.valueOf(cnt);
                canvas.drawText(print, 100, thisY, paint);
                cnt = cnt+10;
                thisY = thisY - 89;
            }

            canvas.drawText("국어", 300, 1550, paint);
            canvas.drawText("영어", 600, 1550, paint);
            canvas.drawText("수학", 900, 1550, paint);



        }
    }
}

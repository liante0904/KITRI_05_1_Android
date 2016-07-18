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
public class PaintEx02 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintEx02V makeLayout = new PaintEx02V(this);
        setContentView(makeLayout);
    }

    class PaintEx02V extends View{
        public PaintEx02V(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            canvas.drawRect(300, 500, 800, 700, paint);

            paint.setColor(Color.rgb(255,225,168));
            canvas.drawCircle(550,350,150,paint);

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(10f);
            canvas.drawLine(550, 330, 550,380,paint); // 코
            canvas.drawLine(450, 330, 500,330,paint);  // <-
            canvas.drawLine(600, 330, 650,330,paint);  // ->

            paint.setColor(Color.RED);
            paint.setStrokeWidth(10f);
            canvas.drawLine(500,430,600,430,paint);

            paint.setColor(Color.RED);
            paint.setStrokeWidth(550f);

            canvas.drawRect(350,700,450,1000,paint);

            paint.setColor(Color.RED);
            paint.setStrokeWidth(550f);

            canvas.drawRect(650,700,750,1000,paint);

        }
    }
}

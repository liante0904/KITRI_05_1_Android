package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-18.
 */
public class Inflate03_SungJukGraph extends Activity{
    LayoutInflater inflater;
    LinearLayout container;


    int sugId[] = {R.id.edit_Kor,R.id.edit_Eng,R.id.edit_Math};
    EditText sungEdt[] = new EditText[sugId.length];
    Button sungButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inflate03_sungjukgraphic);

        for (int i = 0; i<sugId.length; i++){
            sungEdt[i] = (EditText) findViewById(sugId[i]);
        }
        sungButton = (Button) findViewById(R.id.sungBtn);
        LinearLayout container = (LinearLayout) findViewById(R.id.containerInflater3);
        SungJukGraphV view = new SungJukGraphV(this);
        container.addView(view);


        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.lotto,container,true);
    }

    class SungJukGraphV extends View implements View.OnClickListener{
        int korX = 250, korY=0;
        int engX = 550, engY=0;
        int mathX= 850, mathY=0;

        Inflate03_SungJukGraph context;

        public SungJukGraphV(Context context){
            super(context);
            this.context = (Inflate03_SungJukGraph) context;
            this.context.sungButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            korY = Integer.parseInt(context.sungEdt[0].getText().toString());
            engY = Integer.parseInt(context.sungEdt[1].getText().toString());
            mathY = Integer.parseInt(context.sungEdt[2].getText().toString());
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setTextSize(100f);
            canvas.drawRect(korX, 1200-(korY*10), korX+100, 1200,paint);
            canvas.drawRect(engX, 1200-(engY*10), engX+100, 1200,paint);
            canvas.drawRect(mathX, 1200-(mathY*10), mathX+100, 1200,paint);



            paint.setColor(Color.BLACK);
            int k = 1200;

            for (int i = 0; i < 11; i++){
                paint.setStrokeWidth(7f);
                canvas.drawLine(100, k, 1000, k,paint);
                k = k - 100;
            } // 가로 10줄
            canvas.drawLine(100,1200,100,100, paint);

            paint.setTextSize(45f);
            int thisY = 1100;
            int cnt = 10;
            while (cnt <=100){
                String print ="";
                print = String.valueOf(cnt);
                canvas.drawText(print, 20, thisY, paint);
                cnt = cnt+10;
                thisY = thisY - 100;
            } //숫자

            canvas.drawText("국어", 250, 1250, paint);
            canvas.drawText("영어", 550, 1250, paint);
            canvas.drawText("수학", 850, 1250, paint);
        }
    }

}

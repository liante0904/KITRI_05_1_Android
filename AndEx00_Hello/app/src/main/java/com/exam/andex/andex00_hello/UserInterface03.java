package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-11.
 */
public class UserInterface03 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout02 = new LinearLayout(this);
        layout02.setOrientation(LinearLayout.VERTICAL);


        Button btn01 = new Button(this);
        btn01.setText("버튼 01");
        btn01.setTextSize(20);
        btn01.setTextColor(Color.BLUE);
        layout02.addView(btn01);

        final ImageButton imgBtn = new ImageButton(this);
        imgBtn.setImageResource(R.drawable.emo1);
        layout02.addView(imgBtn);


                imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Drawable tempImg = imgBtn.getDrawable(); // emo1
                Drawable tempRes = UserInterface03.this.getResources().getDrawable(R.drawable.emo1);
                 Bitmap tmpBitmap = ((BitmapDrawable)tempImg).getBitmap();
                 Bitmap tmpBitmapRes = ((BitmapDrawable)tempRes).getBitmap();


                if (tmpBitmap == tmpBitmapRes)
                    imgBtn.setImageResource(R.drawable.emo2);
                else{
                    imgBtn.setImageResource(R.drawable.emo1);
            }
            }
        });

        Button btn02 = new Button(this);
        btn02.setText("버튼 02");
        btn02.setTextSize(20);
        btn02.setTextColor(Color.rgb(0,255,0));
        layout02.addView(btn02);

        btn01.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"kkk",Toast.LENGTH_SHORT).show();
        }});

        setContentView(layout02);
    }
}

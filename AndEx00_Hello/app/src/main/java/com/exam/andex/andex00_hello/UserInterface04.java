package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-11.
 */
public class UserInterface04 extends Activity {


    private int img[] = {R.drawable.emo1,R.drawable.emo2,R.drawable.emo3,R.drawable.emo4, R.drawable.emo5};
    private ImageButton img_v[] = new ImageButton[img.length];

    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout01 = new LinearLayout(this);
        LinearLayout layout02 = new LinearLayout(this);
        LinearLayout layout03 = new LinearLayout(this);



        layout03.setOrientation(LinearLayout.VERTICAL);

        final ImageView iv = new ImageView(this);
        layout02.setGravity(Gravity.CENTER);



        Button btn01 = new Button(this);
        btn01.setText("버튼 01");
        btn01.setTextSize(20);
        btn01.setTextColor(Color.BLUE);

        final TextView txt = new TextView(this);
        txt.setTextSize(20);
        txt.setGravity(Gravity.CENTER);
        layout02.addView(iv);
        for (int i = 0; i<img.length; i++){
            img_v[i] = new ImageButton(this);
            img_v[i].setImageResource(img[i]);
            img_v[i].setTag(i);
            img_v[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            img_v[i].setLayoutParams(new LinearLayout.LayoutParams(300, 300, 1));

            layout01.addView(img_v[i]);
            img_v[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   iv.setImageResource(img[(Integer)v.getTag()]);
                    txt.setText(((Integer)v.getTag()+1)+"번째 이미지");

                }
            });

        }

        layout03.addView(txt, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0 ,(float)0.5));
        layout03.addView(layout01, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0 ,1));

        layout03.addView(layout02, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0 ,5));

        setContentView(layout03);





    }

}


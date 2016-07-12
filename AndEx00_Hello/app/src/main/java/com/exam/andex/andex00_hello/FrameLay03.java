package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-12.
 */

public class FrameLay03 extends Activity implements View.OnClickListener{

    int Img_top[] = {R.id.lay03_ImageButton01,R.id.lay03_ImageButton02,R.id.lay03_ImageButton03};
    int Img[] = {R.id.lay03_Imageview01,R.id.lay03_Imageview02,R.id.lay03_Imageview03};

    ImageView Img_View[] = new ImageView[Img.length];
    ImageButton Img_Btn[] = new ImageButton[Img_top.length];
    ImageButton Img_Button[] = new ImageButton[Img_Btn.length];

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_lay03);

        btn = (Button) findViewById(R.id.lay03_Button01);
        btn.setOnClickListener(this);

        for (int i=0; i<Img.length; i++){
            Img_View[i] = (ImageView) findViewById(Img[i]);
            Img_View[i].setVisibility(ImageView.INVISIBLE);
            Img_Button[i] = (ImageButton) findViewById(Img_top[i]);
            Img_Button[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        for (int i = 0;i<Img_Button.length;i++){
            if (v.getId() == Img_top[i]){
                    Img_View[i].setVisibility(ImageView.VISIBLE);
                }else{
                Img_View[i].setVisibility(ImageView.INVISIBLE);
            }
            }

        }
    }



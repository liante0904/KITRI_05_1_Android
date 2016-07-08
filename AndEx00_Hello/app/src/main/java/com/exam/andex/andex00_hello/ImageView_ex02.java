package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-07.
 */
public class ImageView_ex02 extends Activity implements View.OnClickListener {


    private ImageButton vsrc2;
    private Button vcngimgbt; //
    private TextView vlayoutText;

    int[] btns = {R.id.vimg1, R.id.vimg2, R.id.vimg3};
    int[] btns2 = {R.drawable.kaka01, R.drawable.kaka02, R.drawable.kaka03};
    ImageButton[] btn = new ImageButton[btns.length];
    int imgcnt = btn.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view_ex02);
        vlayoutText = (TextView) findViewById(R.id.vlayoutText);
        vsrc2 = (ImageButton) findViewById(R.id.vsrc2);
        vcngimgbt = (Button) findViewById(R.id.vcngimgbt);
        vsrc2.setOnClickListener(this);
        vcngimgbt.setOnClickListener(this);


        for (int i = 0; i < btns.length; i++) {
            btn[i] = (ImageButton) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }

    }


    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.vcngimgbt){     // 이미지 버튼을 눌렀을때 (vcgimgbt)

            if (imgcnt % 3  ==0){
                vsrc2.setImageResource(R.drawable.kaka01);
                vlayoutText.setText("image01");
                imgcnt++;

            }else if(imgcnt % 3  ==1){
                vsrc2.setImageResource(R.drawable.kaka02);
                vlayoutText.setText("image02");
                imgcnt++;
            }else if(imgcnt % 3  ==2) {
                vsrc2.setImageResource(R.drawable.kaka03);
                vlayoutText.setText("image03");
                imgcnt++;
            }

        // 이미지를 눌렀을때(btns[i)]
        for (int i = 0; i < btns.length; i++) {
            if (v.getId() == btns[i]) {
                if (v.getId() == btns[i])
                    vsrc2.setImageResource(btns2[i]);
                vlayoutText.setText("image0" + (i+1));
                break;
            }


            }
        }
    }
}



/*
                if (imgcnt % 3  ==0){
                    vsrc2.setImageResource(R.drawable.kaka01);
                    vlayoutText.setText("image01");
                }else if(imgcnt % 3  ==1){
                    vsrc2.setImageResource(R.drawable.kaka02);
                    vlayoutText.setText("image02");
                }else if(imgcnt % 3  ==2){
                    vsrc2.setImageResource(R.drawable.kaka03);
                    vlayoutText.setText("image03");
                    */

                   /*  if (v.getId() != R.id.vcngimgbt) {
            for (int i = 0; i < btns.length; i++) {
                if (v.getId() == btns[i]) {
                    vsrc2.setImageResource(btns2[i]);
                    vlayoutText.setText("image0" + i);
                    break;*/





              /*  if (v.getId()== R.id.vimg1){
                    vsrc2.setImageResource(R.drawable.kaka01);
                    vlayoutText.setText("image01");
                }else if (v.getId()== R.id.vimg2){
                    vsrc2.setImageResource(R.drawable.kaka02);
                    vlayoutText.setText("image02");
                }else if (v.getId()== R.id.vimg3){
                    vsrc2.setImageResource(R.drawable.kaka03);
                    vlayoutText.setText("image03");
                */


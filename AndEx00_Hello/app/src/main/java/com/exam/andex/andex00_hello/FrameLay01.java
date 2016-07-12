package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-12.
 */
public class FrameLay01 extends Activity {
    ImageView imgV01;
    int sw = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_lay01);

        imgV01 = (ImageView) findViewById(R.id.ImageView01);
    }
    public void chkImg(View v){

        if (sw ==0){
            imgV01.setVisibility(ImageView.INVISIBLE);
            sw = 1;
        }else {
            imgV01.setVisibility(ImageView.VISIBLE);
            sw=0;

        }
    }
}

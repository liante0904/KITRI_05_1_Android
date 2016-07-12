package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016-07-12.
 */
public class FrameLay02 extends Activity {
    ImageView imgV01,imgV02 ;
    int chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_lay02);

        imgV01 = (ImageView) findViewById(R.id.lay02_ImageView01);
        imgV02 = (ImageView) findViewById(R.id.lay02_ImageView02);
        imgV01.setVisibility(ImageView.INVISIBLE);
        imgV02.setVisibility(ImageView.INVISIBLE);

    }

    public void chkImg(View v){
        imgV01.setVisibility(ImageView.INVISIBLE);
        imgV02.setVisibility(ImageView.INVISIBLE);
        if (chk == 0){ // 1번이 보임
            imgV01.setVisibility(ImageView.VISIBLE);
            imgV02.setVisibility(ImageView.INVISIBLE);
            chk=1;
        }else {
            imgV02.setVisibility(ImageView.VISIBLE);
            imgV01.setVisibility(ImageView.INVISIBLE);
            chk=0;
        }
    }
}

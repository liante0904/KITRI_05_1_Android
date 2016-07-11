package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016-07-07.
 */
public class ImageView_ex01 extends Activity implements View.OnClickListener{

    int sw = 0;
    private ImageButton vsrc;
    private ImageButton backbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.image_view_ex01);

        vsrc = (ImageButton)findViewById(R.id.vsrc);
        backbt = (ImageButton)findViewById(R.id.Vimage_back);
        backbt.setOnClickListener(this);
        vsrc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Vimage_back) {
            finish();
        } else if (sw ==0){
            vsrc.setImageResource(R.drawable.kaka01);
            sw = 1;
        } else if(sw ==1){
            vsrc.setImageResource(R.drawable.kaka02);
            sw = 0;
        }
    }
}

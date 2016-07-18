package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-18.
 */
public class InflaterEx01 extends Activity{
    int sw =0;
    ImageButton imgBtn;
    EditText edit;
    LayoutInflater inflater;
    LinearLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inflater01);
        container =(LinearLayout) findViewById(R.id.containerInflater2);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.lotto,container,true);
    /*    imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sw ==0){
                    imgBtn.setImageResource(R.drawable.kaka02);
                    sw = 1;
                }else if (sw ==1){
                    imgBtn.setImageResource(R.drawable.kaka01);
                    sw = 0;
                }
            }
        });*/


    }

}

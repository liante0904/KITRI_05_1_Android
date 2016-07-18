package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-14.
 */
public class LayoutByCode02 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LinearLayout linearLayout1= new LinearLayout(this);
        linearLayout1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);

        final Button btn1 = new Button(this);
        btn1.setText("horizotal");


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (linearLayout1.getOrientation() == LinearLayout.HORIZONTAL){
                    linearLayout1.setOrientation(LinearLayout.VERTICAL);
                    btn1.setText("vertical");
                }else {
                    linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
                    btn1.setText("horizontal");

                }
            }
        });


        Button btn2 = new Button(this);
        btn2.setText("버튼1");
        Button btn3 = new Button(this);
        btn3.setText("버튼2");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        linearLayout1.addView(btn1, params);
        linearLayout1.addView(btn2, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout1.addView(btn3, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));


        setContentView(linearLayout1);
    }
}
/*
    public void cngLay(View v){

        if (chg ==0){
            linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
            chg =1;
        }else if (chg ==1){
            linearLayout1.setOrientation(LinearLayout.VERTICAL);
            chg =0;
        }
*/



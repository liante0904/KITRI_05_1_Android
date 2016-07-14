package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016-07-14.
 */
public class LayoutByCode01 extends Activity {

    int chg;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_by_code01);
         linearLayout = (LinearLayout) findViewById(R.id.layout01_Manager);

        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
    }
    public void cngLay(View v){

        if (chg ==0){
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            chg =1;
        }else if (chg ==1){
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            chg =0;
        }
    }
}

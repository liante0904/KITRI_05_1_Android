package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Administrator on 2016-07-20.
 */
public class CalcActivity  extends Activity {

    Bundle extra;
    EditText edt1, edt2;
    String num1 , num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcactivity);
        edt1 = (EditText) findViewById(R.id.calc_input1);
        edt2 = (EditText) findViewById(R.id.calc_input2);
    }

    public void Gobt(View view){
        int temp1  = Integer.parseInt(edt1.getText()+"");
        int temp2 = Integer.parseInt(edt2.getText()+"");
       Intent intent = new Intent(getApplicationContext(), CalcResult.class);

        intent.putExtra("num1", temp1);
        intent.putExtra("num2", temp2);
        startActivity(intent);

    }

}

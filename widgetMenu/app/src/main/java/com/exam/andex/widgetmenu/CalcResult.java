package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-20.
 */
public class CalcResult extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcresult);
        Intent intent = getIntent();
        int num1 = intent.getIntExtra("num1",0);
        int num2 = intent.getIntExtra("num2",0);

        int result = num1 + num2;
        TextView result_input = (TextView) findViewById(R.id.calc_result);
        Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_LONG).show();
        result_input.setText("합계:"+String.valueOf(result));
    }

}

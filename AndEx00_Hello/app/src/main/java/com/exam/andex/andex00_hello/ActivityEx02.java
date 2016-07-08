package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-08.
 */
public class ActivityEx02 extends Activity implements View.OnClickListener {

    private Button act_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);
        act_btn2 = (Button)findViewById(R.id.act_btn2);
        act_btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.act_btn2){
            Toast.makeText(getApplicationContext(), "ㅠㅠ", Toast.LENGTH_SHORT).show();

        }
    }
}

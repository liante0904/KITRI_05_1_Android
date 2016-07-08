package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-08.
 */
public class ActivityEx01 extends Activity implements View.OnClickListener {

    private Button act_btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);

        act_btn1 = (Button)findViewById(R.id.act_btn1);
        act_btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.act_btn1){
            Toast.makeText(getApplicationContext(), "ㅠㅠ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), ActivityEx02.class);
            startActivity(intent);
            finish();
        }
    }
}

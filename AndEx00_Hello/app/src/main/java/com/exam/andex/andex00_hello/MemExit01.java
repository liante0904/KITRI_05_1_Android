package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-06.
 */
public class MemExit01 extends Activity {

    private EditText vid;
    private EditText vpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text01);
        vid = (EditText) findViewById(R.id.vid);
        findViewById(R.id.vpwd);
        vpwd = (EditText) findViewById(R.id.vpwd);


    }

    public void memResult(View v){
        Toast.makeText(getApplicationContext(), "회원확인", Toast.LENGTH_LONG);
    }

}

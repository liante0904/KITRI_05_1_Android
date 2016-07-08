package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-06.
 */
public class MemExit01 extends Activity implements View.OnClickListener {


    private EditText vid;
    private EditText vpwd;
    private Button memBtn;
    String msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text01);
        vid = (EditText) findViewById(R.id.vid);
        vpwd = (EditText) findViewById(R.id.vpwd);
        memBtn  = (Button) findViewById(R.id.memBtn);

        vid.setOnClickListener(this);
        vpwd.setOnClickListener(this);
        memBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.memBtn)
            // vid, vpwd, memBtn이 모두 있으므로, 그중 memBtn 일때만 해당 메소드가 실행된다.
        Toast.makeText(this, "이벤트확인", Toast.LENGTH_LONG).show();
    }

    public void memResult(View v){

        vid = (EditText) findViewById(R.id.vid);
        vpwd = (EditText) findViewById(R.id.vpwd);
        msg = "아이디: "+ vid.getText().toString() + "패스워드: "+ vpwd.getText().toString();
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

}


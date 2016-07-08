package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-06.
 */

public class GuGuDan01 extends Activity implements View.OnClickListener {

    String msg;
    private EditText vinput;
    private TextView voutput;
    private Button guBtn, guretBtn;


    int btns[] = {R.id.guBtn, R.id.guretBtn}; // 버튼이 담긴 배열
    Button btn[] = new Button[btns.length];     // 버튼 타입의 배열 생성


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gugudan01);
        vinput = (EditText)findViewById(R.id.vinput);
        guBtn = (Button) findViewById(R.id.guBtn); // 구구단 버튼
        guretBtn = (Button) findViewById(R.id.guretBtn); // 리셋버튼


        // 버튼이 담긴배열을 버튼타입의 배열만큼 담는 반복문
        for (int i=0; i<btns.length; i++ ){
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }


/*
        guBtn.setOnClickListener(this);
        guretBtn.setOnClickListener(this);*/

    }
    public void guResult(View v){

        Log.i("GuGuguResult", vinput.getText().toString());
        vinput = (EditText)findViewById(R.id.vinput);

     /*   guBtn = (Button) findViewById(R.id.guBtn);
        guretBtn = (Button) findViewById(R.id.guretBtn);
*/
        int jinput = Integer.parseInt(vinput.getText().toString());

        msg = "결과\n";
        int i = 0;
         for( i = 1; i<10; i++){
            msg += jinput + "*" + i + "=" + jinput * i+"\n";
        }
        voutput = (TextView)findViewById(R.id.voutput);
        voutput.setText(msg);

    }

    @Override
    public void onClick(View v) {
        Log.i("GuGuguResult", vinput.getText().toString());
        if (v.getId() == R.id.guBtn){
        vinput = (EditText)findViewById(R.id.vinput);
        guBtn = (Button) findViewById(R.id.guBtn);
        int jinput = Integer.parseInt(vinput.getText().toString());

        msg = "결과\n";
        int i = 0;
        for( i = 1; i<10; i++){
            msg += jinput + "*" + i + "=" + jinput * i+"\n";
        }
        voutput = (TextView)findViewById(R.id.voutput);
        voutput.setText(msg);
        }else if(v.getId() == R.id.guretBtn){
            vinput = (EditText)findViewById(R.id.vinput);
            vinput.setText("");
        }
    }

    public void guReset(View v){

        vinput = (EditText)findViewById(R.id.vinput);
        vinput.setText("");

    }
}

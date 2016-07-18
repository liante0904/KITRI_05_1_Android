package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016-07-06.
 */
public class Calculator01 extends Activity implements View.OnClickListener {



    int btns[] = {R.id.vCancelbt, R.id.vBackbt, R.id.vEQbt, R.id.v1bt,R.id.v2bt,R.id.v3bt,
            R.id.v4bt,R.id.v5bt,R.id.v6bt,R.id.v7bt,R.id.v8bt,R.id.v9bt,
            R.id.v0bt,R.id.vdotbt,R.id.vsubtractbt,R.id.vDivibt,R.id.vMulitbt,R.id.vPlusbt};


    Button btn[] = new Button[btns.length];

    private ImageButton backbt;

    private EditText edt;
    float num1 =0.0f, num2 = 0.0f, result =0.0f;
    int opp = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator01);

        backbt = (ImageButton) findViewById(R.id.Vcalcul_back);
        backbt.setOnClickListener(this);

        //버튼 처리
        for (int i =0; i<btns.length; i++){
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
    }



    @Override
    public void onClick(View v) {
        edt = (EditText) findViewById(R.id.edt);
        if (v.getId() == R.id.vMulitbt || v.getId() == R.id.vDivibt || v.getId() == R.id.vPlusbt || v.getId() == R.id.vsubtractbt) {
            //사칙연산 판별
            opp = v.getId();
            num1 = Float.parseFloat(edt.getText().toString());
            int test1 = Integer.parseInt(edt.getText().toString());

            edt.setText("");

        } else if (v.getId() == R.id.vCancelbt) { // C버튼 일경우
            edt.setText("");
        } else if (v.getId() == R.id.vBackbt) { // 지우기버튼
            edt.setText(edt.getText().subSequence(0,edt.length()-1));

        } else if (v.getId() == R.id.vEQbt) { // 연산버튼
            num2 = Float.parseFloat(edt.getText().toString());
            if (opp == R.id.vPlusbt){
                result = num1 + num2;
            }else if (opp==R.id.vsubtractbt){
                result = num1 - num2;
            }else if (opp == R.id.vMulitbt){
                result = num1 * num2;
            }else if (opp == R.id.vDivibt){
                result = num1 / num2;
            }
            edt.setText(Float.toString(result));
        } else if (v.getId() == R.id.vdotbt) { // 소수점버튼
            edt.setText(edt.getText()+".");
        } else if(v.getId() == R.id.Vcalcul_back){
            finish();
        }else { //숫자 입력
            Button b = (Button) findViewById(v.getId());
            edt.setText(edt.getText().toString()+b.getText().toString());


        }

       /* for (int i = 0; i<btns.length; i++) {

            if (v.getId() == btns[i]) {
                Toast.makeText(getApplicationContext(), btn[i].getText(),Toast.LENGTH_SHORT).show();

            }*/
    }
}


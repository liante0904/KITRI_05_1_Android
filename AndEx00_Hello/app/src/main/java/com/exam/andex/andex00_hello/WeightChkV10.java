package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-11.
 */
public class WeightChkV10 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.Vweightchk_backActivity,R.id.Vweightchk_0BT,R.id.Vweightchk_1BT,R.id.Vweightchk_2BT,R.id.Vweightchk_3BT,R.id.Vweightchk_4BT,R.id.Vweightchk_5BT,
            R.id.Vweightchk_6BT,R.id.Vweightchk_7BT,R.id.Vweightchk_8BT,R.id.Vweightchk_9BT,R.id.Vweightchk_0BT, R.id.Vweightchk_dotBT,R.id.Vweightchk_goBT
    };

    Button btn[] = new Button[btns.length];


    float weight = 0.0F, length = 0.0F, result = 0.0F;
    private EditText weight_input, length_input;
    private TextView result_view;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weightchk_v10);

        for (int i =0; i<btns.length; i++){
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View v) {
        weight_input = (EditText) findViewById(R.id.Vweightchk_weight);
        length_input = (EditText) findViewById(R.id.Vweightchk_length);
        result_view = (TextView) findViewById(R.id.Vweightchk_resultView);
        flag = v.getId();

        if (v.getId() == R.id.Vweightchk_backActivity){
            finish();
        }else{

            if (v.getId() == R.id.Vweightchk_length || v.getId() == R.id.Vweightchk_weight){  // 숫자 더하기
                int user_intput;
                Button b = (Button) findViewById(v.getId());

                if (v.getId()== R.id.Vweightchk_length){
                    length_input.setText(length_input.getText().toString()+b.getText().toString());
                }else if (v.getId()== R.id.Vweightchk_weight){
                    weight_input.setText(weight_input.getText().toString()+b.getText().toString());
                }

            }else if (v.getId() == R.id.Vweightchk_dotBT){
                if (v.getId() == R.id.Vweightchk_weight){
                    weight_input.setText(weight_input.getText()+".");
                }else if (v.getId() == R.id.Vweightchk_length){
                    length_input.setText(length_input.getText()+".");
                }

            }else if (v.getId() == R.id.Vweightchk_escape){
                if (v.getId() == R.id.Vweightchk_weight){
                    weight_input.setText(weight_input.getText().subSequence(0,weight_input.length()-1));
                }else if (v.getId() == R.id.Vweightchk_length){
                    length_input.setText(length_input.getText().subSequence(0,length_input.length()-1));
                }
            }else if (v.getId() == R.id.Vweightchk_goBT){
                weight = Float.parseFloat(String.valueOf(weight_input.getText()));
                length = Float.parseFloat(String.valueOf(length_input.getText())); // 입력값 받아오기

                result= (float) ((weight - 100.0)* 0.9); // 표준체중 구하기

                String output_result = ""; // 계산값 판별하게 결과값 반환
                if (result >= 5){ // 표준체중 5kg 이상 초과

                    output_result = "똥개";
                    result_view.setText(output_result.toString());

                }else { // 표준체중 5kg 미만 초과
                    output_result = "돼지";
                    result_view.setText(output_result.toString());

                }
            }else { //숫자 입력부
                Button b = (Button) findViewById(v.getId());
                if (flag == R.id.Vweightchk_length){
                    length_input.setText(length_input.getText().toString()+b.getText().toString());

                }else if (flag == R.id.Vweightchk_weight){
                    weight_input.setText(weight_input.getText().toString()+b.getText().toString());

                }

            }
        }


    }
}

package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-11.
 */
public class WeightChkV10 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.Vweightchk_backActivity, R.id.Vweightchk_0BT, R.id.Vweightchk_1BT, R.id.Vweightchk_2BT, R.id.Vweightchk_3BT, R.id.Vweightchk_4BT, R.id.Vweightchk_5BT,
            R.id.Vweightchk_6BT, R.id.Vweightchk_7BT, R.id.Vweightchk_8BT, R.id.Vweightchk_9BT, R.id.Vweightchk_dotBT, R.id.Vweightchk_goBT
    };

    Button btn[] = new Button[btns.length];


    float weight = 0.0F, length = 0.0F, result = 0.0F;
    private EditText weight_input, length_input;
    private TextView result_view;
    private InputMethodManager imm;

    int flag;
    int chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.weightchk_v10);

        weight_input = (EditText) findViewById(R.id.Vweightchk_weight);
        length_input = (EditText) findViewById(R.id.Vweightchk_length);
        length_input.setFocusable(true);
        result_view = (TextView) findViewById(R.id.Vweightchk_resultView);


        for (int i = 0; i < btns.length; i++) {
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
    }

    private void hideKeyboard(){

        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

    }

    @Override
    public void onClick(View v) {
        Button b = (Button) findViewById(v.getId());


        if (v.getId() == R.id.Vweightchk_backActivity) {
            finish();
        } else {
            flag = v.getId();
            if (v.getId() == R.id.Vweightchk_length || v.getId() == R.id.Vweightchk_weight) {  // 숫자 더하기
                int user_intput;


                if (v.getId() == R.id.Vweightchk_length) {
                    Toast.makeText(getApplicationContext(), "111", Toast.LENGTH_SHORT).show();
                    length_input.setText(length_input.getText().toString() + b.getText().toString());
                } else if (v.getId() == R.id.Vweightchk_weight) {
                    Toast.makeText(getApplicationContext(), "222", Toast.LENGTH_SHORT).show();
                    weight_input.setText(weight_input.getText().toString() + b.getText().toString());
                }

            } else if (v.getId() == R.id.Vweightchk_dotBT) {
                if (v.getId() == R.id.Vweightchk_weight) {
                    weight_input.setText(weight_input.getText() + ".");
                } else if (v.getId() == R.id.Vweightchk_length) {
                    length_input.setText(length_input.getText() + ".");
                }

            } else if (v.getId() == R.id.Vweightchk_escape) {
                if (v.getId() == R.id.Vweightchk_weight) {
                    weight_input.setText(weight_input.getText().subSequence(0, weight_input.length() - 1));
                } else if (v.getId() == R.id.Vweightchk_length) {
                    length_input.setText(length_input.getText().subSequence(0, length_input.length() - 1));
                }
            } else if (v.getId() == R.id.Vweightchk_goBT) {
                weight = Float.parseFloat(String.valueOf(weight_input.getText()));
                length = Float.parseFloat(String.valueOf(length_input.getText())); // 입력값 받아오기

                result = (float) ((weight - 100.0) * 0.9); // 표준체중 구하기

                String output_result = ""; // 계산값 판별하게 결과값 반환
                if (result >= 5) { // 표준체중 5kg 이상 초과

                    output_result = "똥개";
                    result_view.setText(output_result.toString());

                } else { // 표준체중 5kg 미만 초과
                    output_result = "돼지";
                    result_view.setText(output_result.toString());

                }
            } else { //숫자 입력부
                imm.hideSoftInputFromInputMethod(length_input.getWindowToken(), 0);
                imm.hideSoftInputFromInputMethod(weight_input.getWindowToken(), 0);
                if (chk == 0) {
                    for (int i = 0; i < btns.length; i++) {
                        if (v.getId() == btns[i]) {
                            length_input.setFocusable(true);
                            length_input.setText(length_input.getText().toString() + b.getText().toString());
                        } else if (length_input.getText().toString().length() == 3) {
                            chk = 1;

                        }
                    }

                } else if (chk == 1) {
                    for (int i = 0; i < btns.length; i++) {
                        if (v.getId() == btns[i]) {
                            weight_input.setFocusable(true);
                            weight_input.setText(weight_input.getText().toString() + b.getText().toString());

                        }
                    }

                }
            }


        }
    }
}

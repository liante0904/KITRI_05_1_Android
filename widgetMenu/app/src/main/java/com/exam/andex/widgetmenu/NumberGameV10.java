package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-21.
 */
public class NumberGameV10 extends Activity {

    int result;
    int[] radio = {R.id.numbergame_radio1,R.id.numbergame_radio2,R.id.numbergame_radio3,R.id.numbergame_radio4,R.id.numbergame_radio5};
    int[] radio_unchk = {R.id.numbergame_radio_unchk1,R.id.numbergame_radio_unchk2,R.id.numbergame_radio_unchk3,R.id.numbergame_radio_unchk4,R.id.numbergame_radio_unchk5};
    int[] key_value = {1,2,4,8,16};
    int[] Radiogroup = {R.id.numbergame_radioGroup1,R.id.numbergame_radioGroup2,R.id.numbergame_radioGroup3,R.id.numbergame_radioGroup4,R.id.numbergame_radioGroup5};
    RadioButton[] radios = new RadioButton[radio.length];
    RadioButton[] radios_unchk = new RadioButton[radio_unchk.length];
    RadioGroup[] radioGroups = new RadioGroup[Radiogroup.length];
    TextView result_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbergame_v10);

        Button gobt,clearbt;
         result_view =(TextView) findViewById(R.id.numbergame_result_view);
        gobt = (Button) findViewById(R.id.numbergame_goBT);
        clearbt = (Button) findViewById(R.id.numbergame_clearBT);

        for (int i = 0 ; i < radio.length ; i++){
            radios[i] = (RadioButton) findViewById(radio[i]);
            radios_unchk[i] = (RadioButton) findViewById(radio_unchk[i]);
            radioGroups[i] = (RadioGroup) findViewById(Radiogroup[i]);

        }
        gobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0 ; i < radio.length ; i++){

                    if (radios[i].isChecked() == true){

                        result += key_value[i];
                    }
                }
                result_view.setText("생각하고 있는 숫자는 "+result + "입니다. \n 자동으로 초기화 되어 새로 시작하실수 있습니다.");
                result = 0;
                for (int i = 0 ; i < radio.length ; i++){

                    radioGroups[i].clearCheck();
                }

            }
        });



        clearbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0 ; i < radio.length ; i++){

                    radioGroups[i].clearCheck();
                }

            }
        });
    }

}


package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-14.
 */
public class RadioBtn02 extends Activity {
    int[] selectchar = {R.id.radio02_select01,R.id.radio02_select02,R.id.radio02_select03,R.id.radio02_select04,R.id.radio02_select05,R.id.radio02_select06,R.id.radio02_select07,R.id.radio02_select08};
    int[] Draw_selectchar = {R.drawable.kaka01,R.drawable.kaka02,R.drawable.kaka03,R.drawable.kaka04,R.drawable.kaka05,R.drawable.kaka06,R.drawable.kaka07,R.drawable.kaka08};
    RadioButton selectchars[] =  new RadioButton[selectchar.length];
    ImageView radio02_resultImg;
    TextView radio02_resultText;

    int chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_btn02);
        for (int i=0; i<selectchar.length;i++){
            selectchars[i] =(RadioButton) findViewById(selectchar[i]);
        }
        radio02_resultImg = (ImageView) findViewById(R.id.radio02_resultImg);
        radio02_resultText = (TextView) findViewById(R.id.radio02_resultText);
        Button goBT= new Button(this);
        goBT = (Button) findViewById(R.id.radio02_goBT);
        goBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultText;
                for (int i = 0; i < selectchar.length; i++) {

                    if (selectchars[i].isChecked() == true) {

                        radio02_resultImg.setImageResource(Draw_selectchar[i]);
                        resultText = (i + 1) + "번째 아바타가 저장되었습니다.";
                        radio02_resultText.setText(resultText);
                    }

                }
            }
        });
    }



    public void onRadioButtonClicked(View v){
        RadioButton radioButton = new RadioButton(this);
        boolean checked = radioButton.isChecked();


    }
}


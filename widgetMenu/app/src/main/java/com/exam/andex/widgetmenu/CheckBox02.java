package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-14.
 */
public class CheckBox02 extends Activity {

    int[] chkbox = {R.id.checkbox2_select1,R.id.checkbox2_select2,R.id.checkbox2_select3,R.id.checkbox2_select4,R.id.checkbox2_select5,R.id.checkbox2_select6,
            R.id.checkbox2_all};
    CheckBox[] chkboxs = new CheckBox[chkbox.length]; //체크된 항목

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox02);
        for (int i=0; i<chkbox.length;i++){
                chkboxs[i]= (CheckBox) findViewById(chkbox[i]);
                chkboxs[i].setChecked(false);
        }

        final TextView result =(TextView) findViewById(R.id.checkbox2_result);
        Button checkbox2_chkBT;
        checkbox2_chkBT = (Button) findViewById(R.id.checkbox2_chkBT);

        Button checkbox2_initBT = new Button(this);
        checkbox2_initBT =  (Button) findViewById(R.id.checkbox2_initBT);

        checkbox2_chkBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            boolean chkchk = false;
            String resultText = "";

                for(int i=0; i<chkbox.length;i++) {

                    if (chkboxs[i].isChecked() == true){
                        chkchk= true;
                         resultText += chkboxs[i].getText().toString() + " ";
                    }
                }
                    resultText += "\n 가 체크 되었습니다.";
                if (chkchk == false){
                    resultText= ("체크된것이 없습니다.");
                }
                result.setText(resultText);
            }
        });

        checkbox2_initBT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                for (int i=0; i<chkboxs.length; i++){
                    chkboxs[i].setChecked(false);
                }
                result.setText("초기화 되었습니다. 다시 체크해주세요.");
            }
        });
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        if (view.getId() == R.id.checkbox2_all){
            for (int i=0;i<chkboxs.length;i++ ){
                chkboxs[i].setChecked(checked);
            }
        }
    }
}

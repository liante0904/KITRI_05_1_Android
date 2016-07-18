package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by Administrator on 2016-07-14.
 */
public class CheckBoxExam01 extends Activity implements View.OnClickListener {

    int[][] chkbox = {{R.id.checkbox3_select1_1,R.id.checkbox3_select1_2,R.id.checkbox3_select1_3},{R.id.checkbox3_select2_1,R.id.checkbox3_select2_2,R.id.checkbox3_select2_3},
            {R.id.checkbox3_select3_1,R.id.checkbox3_select3_2,R.id.checkbox3_select3_3},{R.id.checkbox3_select4_1,R.id.checkbox3_select4_2,R.id.checkbox3_select4_3}, {R.id.checkbox3_select5_1,R.id.checkbox3_select5_2,R.id.checkbox3_select5_3}};
    CheckBox[][] chkboxs = new CheckBox[chkbox.length][chkbox[0].length];
    int selectrow ;
    int selectcul ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box_exam01);

        for (int i = 0; i < chkbox.length; i++) { // 5
            for (int k = 0; k < chkbox[i].length; k++) { //3
                chkboxs[i][k] = (CheckBox) findViewById(chkbox[i][k]);
                chkboxs[i][k].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        for (int i = 0; i < chkbox.length; i++) { // 5
            for (int k = 0; k < chkbox[i].length; k++) { //3
                if (v.getId() == chkbox[i][k]){
                    selectrow = i;
                }

            }
        }

        for (int i = 0; i <chkboxs[i].length; i++) { // 3
            chkboxs[selectrow][i].setChecked(false);
        }

        ((CheckBox)v).setChecked(true);



    }


    public void onCheckboxClicked(View v){
        boolean checked = ((CheckBox) v).isChecked();
    }
}

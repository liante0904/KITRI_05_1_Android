package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-20.
 */
public class Alert_Dialog05 extends Activity {

    AlertDialog.Builder builder;
    final String msg[] = {"여행", "운동", "영화", "요리", "음악"};
    final boolean msg_chk[] = new boolean[msg.length];

    final int msgs[] = {Color.RED,Color.BLUE,Color.YELLOW};
    TextView textView;
    String result ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog05);
        textView = (TextView) findViewById(R.id.alert_dialog5_textView);
        builder = new AlertDialog.Builder(this);
        builder.create();



    }

    public void alertClick(View view){

        builder.setTitle("Color:");
        builder.setMultiChoiceItems(msg, msg_chk, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "선택한 취미는" + msg[which] + "체크 여부" + msg_chk[which],Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "나머지 체크여부 확인" + msg_chk[0] + "," + msg_chk[1] + "," + msg_chk[2] + "," + msg_chk[3] + "," + msg_chk[4] + "," ,Toast.LENGTH_LONG).show();

                result += msg[which]+ "하기, ";
                textView.setText(result);

            }
        });

       // textView.setText(result);
        builder.show();

    }

}

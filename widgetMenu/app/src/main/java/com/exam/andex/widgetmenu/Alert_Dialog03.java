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
public class Alert_Dialog03 extends Activity {

    AlertDialog.Builder builder;
    final String msg[] = {"Red","Blue","Yellow"};
    final int msgs[] = {Color.RED,Color.BLUE,Color.YELLOW};
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog03);
        textView = (TextView) findViewById(R.id.alert_dialog3_textView);
        builder = new AlertDialog.Builder(this);
        builder.create();
        /*builder.setTitle("배고픕니다.");
        builder.setMessage("기부해주세요.");
        builder.setIcon(R.drawable.android_icon);
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "너무합니다", Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "기부되었습니다.", Toast.LENGTH_LONG).show();
            }
        });*/


    }

    public void alertClick(View view){
        builder.setItems(msg, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), msg[which] + " 컬러 버튼 확인", Toast.LENGTH_LONG).show();
                textView.setBackgroundColor(msgs[which]);
            }
        });

        builder.show();
    }

}

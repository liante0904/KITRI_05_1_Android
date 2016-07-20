package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-20.
 */
public class Alert_Dialog01 extends Activity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog01);
        builder = new AlertDialog.Builder(this);
    }

    public void alertClick(View view){

        builder.create();
        builder.setTitle("배고픕니다.");
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
        });
        builder.show();
    }

}

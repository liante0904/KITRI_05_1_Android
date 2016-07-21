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
public class Alert_Dialog04 extends Activity {

    AlertDialog.Builder builder;
    final String msg[] = {"군필", "미필"};
    final int msgs[] = {Color.RED,Color.BLUE,Color.YELLOW};
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog04);
        textView = (TextView) findViewById(R.id.alert_dialog4_textView);
        builder = new AlertDialog.Builder(this);
        builder.create();



    }

    public void alertClick(View view){

        builder.setTitle("Color:");
        builder.setSingleChoiceItems(msg, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), msg[which]+"확인!", Toast.LENGTH_LONG).show();
                String result= msg[which];
                textView.setText(result);
                dialog.cancel();
            }
        });
        builder.show();
    }

}

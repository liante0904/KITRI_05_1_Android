package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-20.
 */
public class ResultActivity01 extends Activity {
    Intent intent;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity01);
    }

    public void resultBT(View view){
        intent = new Intent(getApplicationContext(), ResultActivity01.class);
        startActivityForResult(intent, 400);
        editText = (EditText)findViewById(R.id.result1_edt);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 400){
            Toast.makeText(getApplicationContext(), "request code:" + resultCode + "\nresult Code: " + resultCode + "\nIntent data : " + data.getExtras().getString("data"), Toast.LENGTH_LONG).show();
            editText.setText(String.valueOf("request code: " + requestCode));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}

package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Administrator on 2016-07-12.
 */
public class SawonLogin extends Activity{


    EditText edt_id, edt_pw;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawonlogin);
        edt_id = (EditText) findViewById(R.id.sawon_login_edt_id);
        edt_pw = (EditText) findViewById(R.id.sawon_login_edt_pw);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void LoginBT(View view){
        intent = new Intent(getApplicationContext(), SawonCertify.class);

        intent.putExtra("input_id", edt_id.getText().toString());
        intent.putExtra("input_pw", edt_pw.getText().toString());
        startActivity(intent);
    }
    public void RegistBT(View view){

    }
}

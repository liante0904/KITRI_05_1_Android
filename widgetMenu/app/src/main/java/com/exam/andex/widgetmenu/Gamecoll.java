package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016-07-18.
 */
public class Gamecoll extends Activity implements View.OnClickListener {

    int[] actBtn = {R.id.Gamecoll_bt1,R.id.Gamecoll_bt2,R.id.Gamecoll_bt3,R.id.Gamecoll_bt4,R.id.Gamecoll_bt5,R.id.Gamecoll_bt6,R.id.Gamecoll_bt7,R.id.Gamecoll_bt8,
            R.id.Gamecoll_bt9};
    Button[] actBtns = new Button[actBtn.length];
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamecoll);

        for (int i=0; i<actBtn.length; i++){
            actBtns[i] = (Button) findViewById(actBtn[i]);
            actBtns[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {


        if (v.getId()== actBtn[0]){
             intent = new Intent(getApplicationContext(), GuGuDan01.class);
        }else if (v.getId() == actBtn[1]){
             intent = new Intent(getApplicationContext(), Calculator01.class);
        }else if (v.getId() == actBtn[2]) {
             intent = new Intent(getApplicationContext(), ImageView_ex02.class);
        }
        startActivity(intent);
        finish();

        }
}

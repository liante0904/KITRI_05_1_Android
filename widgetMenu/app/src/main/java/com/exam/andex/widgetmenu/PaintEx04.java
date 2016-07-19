package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-19.
 */
public class PaintEx04 extends Activity implements View.OnClickListener{


    int btnSel[] = {R.id.paint_ex04_redBT,R.id.paint_ex04_blueBT,R.id.paint_ex04_orangeBT,R.id.paint_ex04_thinBT,R.id.paint_ex04_thickBT,R.id.paint_ex04_resetBT};
    Button btns[] = new Button[btnSel.length];
    int cols[] = {Color.BLUE,Color.RED,Color.rgb(255,187,0)};
    final int THICK = 3, THIN = 4, RESET=5;
    PaintView paintView;
    Context context;
    AttributeSet attrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_ex04);

        paintView = (PaintView) findViewById(R.id.paintView);
        for (int i = 0; i<btnSel.length; i++){
            btns[i] = (Button) findViewById(btnSel[i]);
            btns[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        for (int i=0; i<cols.length;i++){
            if (v.getId() == btnSel[i]){
                Toast.makeText(getApplicationContext(),"setColor()확인",Toast.LENGTH_SHORT).show();
            }
        }

        if (v.getId() == btnSel[0]){
            paintView.setColor(cols[1]);
            Toast.makeText(getApplicationContext(),"setOrange()확인",Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == btnSel[1]){
            paintView.setColor(cols[0]);
            Toast.makeText(getApplicationContext(),"setOrange()확인",Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == btnSel[2]){
            paintView.setColor(cols[2]);
            Toast.makeText(getApplicationContext(),"setOrange()확인",Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == btnSel[3]){
            paintView.setThin();
            Toast.makeText(getApplicationContext(),"setThin()확인",Toast.LENGTH_SHORT).show();
        }


        if (v.getId() == btnSel[4]){
            paintView.setThick();
            Toast.makeText(getApplicationContext(),"setThick()확인",Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == btnSel[5]){
            paintView.setReset();
            Toast.makeText(getApplicationContext(),"setThick()확인",Toast.LENGTH_SHORT).show();
        }

    }


}

package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016-07-11.
 */
public class OutlineEx01 extends Activity implements View.OnClickListener{


    int btns[] = {R.id.Voutline_calculBT, R.id.Voutline_gawibawiBT, R.id.Voutline_gugudanBT, R.id.Voutline_imageBT,
                    R.id.Voutline_taroBT};

    Button btn[] = new Button[btns.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outlinev01);

        for (int i=0; i<btns.length; i++){
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Voutline_taroBT){
            Intent intent = new Intent(getApplicationContext(), TarotV01.class);
            startActivity(intent);
        }else if (v.getId() == R.id.Voutline_imageBT){
            Intent intent = new Intent(getApplicationContext(), ImageView_ex01.class);
            startActivity(intent);
        }else if (v.getId() == R.id.Voutline_calculBT){
            Intent intent = new Intent(getApplicationContext(), Calculator01.class);
            startActivity(intent);
        }else if (v.getId() == R.id.Voutline_gawibawiBT){
            Intent intent = new Intent(getApplicationContext(), GaWiBaWiBoV01.class);
            startActivity(intent);
        }else if (v.getId() == R.id.Voutline_gugudanBT){
            Intent intent = new Intent(getApplicationContext(), GuGuDan01.class);
            startActivity(intent);

        }

    }
}

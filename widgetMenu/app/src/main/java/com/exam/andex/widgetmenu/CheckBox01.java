package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-14.
 */
public class CheckBox01 extends Activity {
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkbox1_meat:
                if (checked)
                    Toast.makeText(getApplicationContext(), "고기 선택", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "고기 선택 해제", Toast.LENGTH_SHORT).show();
                    break;

            case R.id.checkbox1_cheese:
                if (checked)
                    Toast.makeText(getApplicationContext(), "치즈 선택", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "치즈 선택 해제", Toast.LENGTH_SHORT).show();
                break;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox01);
    }
}

package com.exam.andex.widgetmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Option_Menu03_JavaVer extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu02);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("구구단"); menu.add("계산기"); menu.add("이미지변경"); menu.add("타로");menu.add("로또");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getTitle().equals("계산기")){
            intent = new Intent(getApplicationContext(), Calculator01.class);
        }
        if (item.getTitle().equals("구구단")){
            intent = new Intent(getApplicationContext(), GuGuDan01.class);
        }
        if (item.getTitle().equals("이미지변경")){
            intent = new Intent(getApplicationContext(), ImageView_ex02.class);
        }
        if (item.getTitle().equals("로또")){
            intent = new Intent(getApplicationContext(), Lotto.class);
        }
        if (item.getTitle().equals("타로")){
            intent = new Intent(getApplicationContext(), TarotV01.class);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}

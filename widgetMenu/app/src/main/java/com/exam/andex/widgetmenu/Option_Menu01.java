package com.exam.andex.widgetmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Option_Menu01 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu01);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.apple){
            Toast.makeText(getApplicationContext(), item.getTitle().toString() +" : 옹졸한 회사입니다.",Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.amazon){
            Toast.makeText(getApplicationContext(), item.getTitle().toString() +": 대인배 회사입니다.",Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.google){
            Toast.makeText(getApplicationContext(), item.getTitle().toString() +": 우주정복 회사입니다.",Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.ms){
            Toast.makeText(getApplicationContext(), "마이크로 소프트 : 지독한 개발 회사입니다.",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

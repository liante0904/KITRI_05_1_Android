package com.exam.andex.widgetmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Option_Menu02 extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu02);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.optionmenu2_calculator){
            intent = new Intent(getApplicationContext(), Calculator01.class);
        }
        if (item.getItemId() == R.id.optionmenu2_gugudan){
            intent = new Intent(getApplicationContext(), GuGuDan01.class);
        }
        if (item.getItemId() == R.id.optionmenu2_img_charger){
            intent = new Intent(getApplicationContext(), ImageView_ex02.class);
        }
        if (item.getItemId() == R.id.optionmenu2_lotto){
            intent = new Intent(getApplicationContext(), Lotto.class);
        }
        if (item.getItemId() == R.id.optionmenu2_taro){
            intent = new Intent(getApplicationContext(), TarotV01.class);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}

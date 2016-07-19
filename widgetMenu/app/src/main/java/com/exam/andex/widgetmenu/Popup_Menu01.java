package com.exam.andex.widgetmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Popup_Menu01 extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_menu01);
    }

public void popClick(View view){

    final PopupMenu popupMenu = new PopupMenu(getApplicationContext(), view);
    popupMenu.getMenuInflater().inflate(R.menu.popup_menu01, popupMenu.getMenu());
    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            Toast.makeText(getApplicationContext(),item.getTitle().toString(),Toast.LENGTH_SHORT).show();
            return false;
        }
    });
    popupMenu.show();
}


}

package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Context_Menu01 extends Activity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context_menu01);
        text = (TextView) findViewById(R.id.contextmenu_menu01);
        registerForContextMenu(text);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("It's context menu");
        menu.add(0, 1, 0, "Background : RED" );
        menu.add(0, 2, 0, "Background : Green" );
        menu.add(0, 3, 0, "Background : Blue" );

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

 /*       if (item.getItemId() == 1){
            text.setBackgroundColor(Color.RED);
        }

        if (item.getItemId() == 2){
            text.setBackgroundColor(Color.GREEN);
        }

        if (item.getItemId() == 3){
            text.setBackgroundColor(Color.BLUE);
        }*/

        switch (item.getItemId()){
            case 1:
                text.setBackgroundColor(Color.RED);
                break;
            case 2:
                text.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                text.setBackgroundColor(Color.BLUE);
                break;

        }

        return super.onContextItemSelected(item);
    }
}

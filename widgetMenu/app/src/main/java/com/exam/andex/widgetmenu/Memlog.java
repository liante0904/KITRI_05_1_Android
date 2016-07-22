package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

/**
 * Created by Administrator on 2016-07-13.
 */
public class Memlog extends Activity {

    SQLiteDatabase db;
    SQLiteOpenHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_log);
    }

}

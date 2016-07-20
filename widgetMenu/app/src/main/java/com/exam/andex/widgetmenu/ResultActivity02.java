package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Administrator on 2016-07-20.
 */
public class ResultActivity02 extends Activity {
    Bundle extra;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity02);
        extra = new Bundle();
        intent = new Intent();
        extra.putString("data", "액티비티2에서 넣은 데이터");
        intent.putExtras(extra);
        this.setResult(400, intent);
        this.finish();
    }

}
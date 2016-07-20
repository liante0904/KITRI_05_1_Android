package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-20.
 */
public class Revenue_Activity extends Activity {
    Intent intent;
    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_activity);
        welcome = (TextView) findViewById(R.id.sawon_revenue_welcome);
        intent = getIntent();
        welcome.setText(intent.getStringExtra("select_view"));
    }


}

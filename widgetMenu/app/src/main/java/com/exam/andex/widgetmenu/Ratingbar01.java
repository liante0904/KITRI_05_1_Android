package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;

/**
 * Created by Administrator on 2016-07-15.
 */
public class Ratingbar01 extends Activity{

    int ratingbar[] = {R.id.rating1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar01);

        RatingBar ratingbars = new RatingBar(this);
        ratingbars = (RatingBar) findViewById(ratingbar[0]);
        ratingbars.setRating((float) 2.5);

    }

}


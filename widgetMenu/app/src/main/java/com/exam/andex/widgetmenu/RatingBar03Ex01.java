package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-14.
 */
public class RatingBar03Ex01 extends Activity implements View.OnClickListener {

    int[][] chkbox = {{R.id.checkbox3_select1_1,R.id.checkbox3_select1_2,R.id.checkbox3_select1_3},{R.id.checkbox3_select2_1,R.id.checkbox3_select2_2,R.id.checkbox3_select2_3},
            {R.id.checkbox3_select3_1,R.id.checkbox3_select3_2,R.id.checkbox3_select3_3},{R.id.checkbox3_select4_1,R.id.checkbox3_select4_2,R.id.checkbox3_select4_3}, {R.id.checkbox3_select5_1,R.id.checkbox3_select5_2,R.id.checkbox3_select5_3}};
    CheckBox[][] chkboxs = new CheckBox[chkbox.length][chkbox[0].length];
    Float[] score = {1.0F, 0.5F, 0.0F};

    int selectrow ;
    int selectcul ;
    int firstkey;
    Float total_score;

    int rating = R.id.rating_bar01_rating1;
    RatingBar ratings;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating_bar01_ex01);

        total_score = 0F;
        ratings = new RatingBar(this);
        ratings = (RatingBar) findViewById(rating);
        ratings.setIsIndicator(false);
        ratings.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            }
        });

        for (int i = 0; i < chkbox.length; i++) { // 5
            for (int k = 0; k < chkbox[i].length; k++) { //3
                chkboxs[i][k] = (CheckBox) findViewById(chkbox[i][k]);
                chkboxs[i][k].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        for (int i = 0; i < chkbox.length; i++) { // 5
            for (int k = 0; k < chkbox[i].length; k++) { //3
                if (v.getId() == chkbox[i][k]){
                    selectrow = i;
                    selectcul = k;
                    Toast.makeText(getApplicationContext(), String.valueOf(score[selectcul]),Toast.LENGTH_SHORT).show();
                    total_score += score[selectcul];
                    ratings.setRating(total_score);

                }
            }
        }

        for (int i = 0; i <chkboxs[i].length; i++) { // 3
            if (chkboxs[selectrow][i].isChecked() == true){
                if (i ==0){
//                 total_score -= 1.0F;
             }else if (i ==1){
//                 total_score -= 0.5F;
             }
                chkboxs[selectrow][i].setChecked(false);
            }
        }
        ((CheckBox)v).setChecked(true);
        ratings.setRating(total_score);
    }


    public void onCheckboxClicked(View v){
        boolean checked = ((CheckBox) v).isChecked();
    }
}

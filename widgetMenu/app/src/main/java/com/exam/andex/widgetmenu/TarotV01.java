package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-08.
 */
public class TarotV01 extends Activity implements View.OnClickListener {

    int[] imgsrc = {R.drawable.tarot1, R.drawable.tarot2,R.drawable.tarot3, R.drawable.tarot4, R.drawable.tarot5, R.drawable.tarot6,
            R.drawable.tarot7, R.drawable.tarot8, R.drawable.tarot9, R.drawable.tarot10,};

    String[] textsrc = new String[imgsrc.length+1];

    private ImageView MainImgView;
    private TextView MainTextView;
    private ImageButton backbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarotv01);
        MainImgView = (ImageView) findViewById(R.id.MainImgView);
        MainTextView = (TextView) findViewById(R.id.MainTextView);
        backbt = (ImageButton) findViewById(R.id.Vtaro_back);
        backbt.setOnClickListener(this);
        MainImgView.setOnClickListener(this);
        MainTextView.setOnClickListener(this);

        for (int i = 0; i<imgsrc.length+1; i++){ // 이미지 갯수만큼
        textsrc[i] = i+"번 타로카드입니다. "; // 텍스트 배열

        }



    }

    @Override
    public void onClick(View v) {

        int taro = UserObj.getRandom(imgsrc.length)-1; // 1~10반환
        MainImgView.setImageResource(imgsrc[taro]);
        MainTextView.setText(textsrc[taro]);
        if (v.getId() == R.id.Vtaro_back){
            finish();
        }
    }
}

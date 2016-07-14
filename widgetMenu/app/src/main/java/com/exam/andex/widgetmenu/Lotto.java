package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016-07-13.
 */
public class Lotto extends Activity implements View.OnClickListener {



    int[] result_num_layout = {R.id.lotto_result1,R.id.lotto_result2,R.id.lotto_result3,R.id.lotto_result4,R.id.lotto_result5,R.id.lotto_result6};
    int[] img_num = {R.drawable.b01,R.drawable.b02,R.drawable.b03,R.drawable.b04,R.drawable.b05,R.drawable.b06,R.drawable.b07,R.drawable.b08,
            R.drawable.b09,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,R.drawable.b14,R.drawable.b15,R.drawable.b16,R.drawable.b17,
            R.drawable.b18,R.drawable.b19,R.drawable.b20,R.drawable.b21,R.drawable.b22,R.drawable.b23,R.drawable.b24,R.drawable.b25,R.drawable.b26,
            R.drawable.b27,R.drawable.b28,R.drawable.b29,R.drawable.b30,R.drawable.b31,R.drawable.b32,R.drawable.b33,R.drawable.b34,R.drawable.b35,
            R.drawable.b36,R.drawable.b37,R.drawable.b38,R.drawable.b39,R.drawable.b40,R.drawable.b41,R.drawable.b42,R.drawable.b43,R.drawable.b44,R.drawable.b45};

    ImageView[] imgviw_result = new ImageView[result_num_layout.length];

    int[] lottoNum = new int[result_num_layout.length];


    private ImageButton gobtn;
    ArrayList<Integer> result_num = new ArrayList<Integer>();
    int chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotto);
        gobtn =(ImageButton) findViewById(R.id.lotto_go);
        gobtn.setOnClickListener(this);


        for (int i =0; i<result_num_layout.length; i++){
            imgviw_result[i] =(ImageView) findViewById(result_num_layout[i]);

           }

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.lotto_go){




           for (int p =0; p<6; p++){


               for (int i=0; i<lottoNum.length; i++){

                   lottoNum[i] = UserObj.getRandom(45);
                   for (int k=0; k<i; k++){
                       if (lottoNum[i] == lottoNum[k]){
                           i = k-1;
                           break;
                       }
                   }
               }
               imgviw_result[p].setImageResource(img_num[lottoNum[p]-1]);

           /*     chk = UserObj.getRandom(45)-1;
               if (!result_num.contains(chk) == true){
                   result_num.add(i, chk);
               }
               imgviw_result[i].setImageResource(img_num[result_num.get(i)-1]);
           */
           }
        }


    }
}

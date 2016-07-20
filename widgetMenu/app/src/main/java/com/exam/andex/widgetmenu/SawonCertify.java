package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-12.
 */
public class SawonCertify extends Activity{

    int btn[] = {R.id.sawon_certify_1BT_customer,R.id.sawon_certify_2BT_product, R.id.sawon_certify_3BT_revenue};
    Button[] btns = new Button[btn.length];
    String[] btn_name = {"고객관리", "상품관리", "매출관리"};

    TextView welcome_result;
    TextView select_view_result;
    Intent intent1;

    int chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawoncertify);

        select_view_result = (TextView) findViewById(R.id.sawon_certify_select_view_result);
        for (int i = 0 ; i < btn.length; i++){
            btns[i] = (Button) findViewById(btn[i]);
        }
        welcome_result = (TextView) findViewById(R.id.sawon_certify_welcome);
        Intent intent = getIntent(); // intent 받아오기
        welcome_result.setText( intent.getStringExtra("input_id")+ "님 환영합니다.");


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100){
            select_view_result.setText("선택된 화면:"+ "고객 관리 ");
        }else if (requestCode == 200){
            select_view_result.setText("선택된 화면:"+ "상품 관리 ");
        }else if (requestCode == 300){
            select_view_result.setText("선택된 화면:"+ "매출 관리 ");
        }
    }

    public void customerBT(View view){

        intent1 = new Intent(getApplicationContext(), Customer_Activity.class);
        intent1.putExtra("select_view", btn_name[0].toString());
        startActivityForResult(intent1, 100);
        chk = 1;

    }

    public void productBT(View view){


        intent1 = new Intent(getApplicationContext(), Customer_Activity.class);
        intent1.putExtra("select_view", btn_name[1]);
        startActivityForResult(intent1, 200);
        chk = 1;
    }

    public void revenueBT(View view){

        intent1 = new Intent(getApplicationContext(), Customer_Activity.class);
        intent1.putExtra("select_view", btn_name[2]);
        startActivityForResult(intent1 , 300);
        chk = 1;
    }

}

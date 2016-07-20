package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-07-19.
 */
public class Baseball_Game_V01 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.baseball_game_backActivity, R.id.baseball_game_escape, R.id.baseball_game_0BT, R.id.baseball_game_1BT, R.id.baseball_game_2BT, R.id.baseball_game_3BT, R.id.baseball_game_4BT, R.id.baseball_game_5BT,
            R.id.baseball_game_6BT, R.id.baseball_game_7BT, R.id.baseball_game_8BT, R.id.baseball_game_9BT, R.id.baseball_game_dotBT, R.id.baseball_game_goBT};

    Button btn[] = new Button[btns.length];


    int length;

    int strike, ball =0;
    int[] baseball_game_inputs = {R.id.baseball_game_input1, R.id.baseball_game_input2, R.id.baseball_game_input3};
    private EditText[] baseball_game_input = new EditText[baseball_game_inputs.length];
    private TextView result_view;

    String answer[] = new String[3];
    String user_guess[] = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baseball_game_v01);
        for (int i = 0; i < baseball_game_inputs.length; i++) {
            baseball_game_input[i] = (EditText) findViewById(baseball_game_inputs[i]);

        }


        result_view = (TextView) findViewById(R.id.baseball_game_resultView);


        for (int p = 0; p < 3; p++) { // 3개의 난수


            for (int i = 0; i < 3; i++) { // 난수의 중복체크

                answer[i] = String.valueOf(UserObj.getRandom(9));
                for (int k = 0; k < i; k++) {
                    if (answer[i] == answer[k]) {
                        i = k - 1;
                        break;
                    }
                }
            }
            // 0~9 난수


            for (int i = 0; i < btns.length; i++) {
                btn[i] = (Button) findViewById(btns[i]);
                btn[i].setOnClickListener(this);
            }
        }
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"정답:"+answer[0]+answer[1]+answer[2],Toast.LENGTH_LONG).show();
        Button b = (Button) findViewById(v.getId());


        if (v.getId() == R.id.baseball_game_backActivity) { //뒤로 가기 버튼
            finish();
        } else {
            if (v.getId() == R.id.baseball_game_dotBT) { // 점찍기 (duplicate)

                Toast.makeText(getApplicationContext(), "필요하지 않습니다", Toast.LENGTH_LONG).show();

            } else if (v.getId() == R.id.baseball_game_escape) { // 숫자 지우기

                for (int i= baseball_game_input.length-1; i>=0 ; i--){
                    if (baseball_game_input[i].getText().length()==1){
                        baseball_game_input[i].setText("");

                    }

                }

            }
            if (v.getId() == R.id.baseball_game_goBT) { // 계산 버튼

                for (int i = 0 ; i < user_guess.length; i++){
                    user_guess[i] =  baseball_game_input[i].getText().toString(); // String
                } // 입력값 가져오기
                Toast.makeText(getApplicationContext(),"사용자 입력:"+ user_guess[0] + user_guess[1]+ user_guess[2],Toast.LENGTH_LONG).show();
                    if (user_guess[0].equals(answer[0]) && user_guess[1].equals(answer[1]) && user_guess[2].equals(answer[2]) ){ // 정답일때

                        Toast.makeText(getApplicationContext(),"정답입니다.",Toast.LENGTH_LONG).show();

                    }else {// 오답일때

                        for (int a1 =0; a1<user_guess.length; a1++){ //ball 판정
                            for (int a2 =0; a2<user_guess.length; a2++){

                                if (answer[a1].equals(user_guess[a2])){
                                    ball++;
                                }

                            }

                        }

                        for (int b1 = 0 ; b1<user_guess.length; b1++){

                            if (answer[b1].equals(user_guess[b1])){
                                strike++;
                            }
                            }
                        Toast.makeText(getApplicationContext(),"오답입니다." + String.valueOf(ball) + String.valueOf(strike) ,Toast.LENGTH_LONG ).show();

                    }
                 // 입력값 가져오기
            } else { //숫자 입력부


                for (int i = 0; i < baseball_game_inputs.length; i++) {
                    if (baseball_game_input[i].getText().length() == 0) {
                        baseball_game_input[i].setText(b.getText().toString());
                    }
                }
            }
        }
    }
}





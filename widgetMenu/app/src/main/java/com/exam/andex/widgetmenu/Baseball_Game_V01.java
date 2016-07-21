package com.exam.andex.widgetmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
    AlertDialog.Builder builder;


    int length;

    int strike, ball =0, cnt = 1;
    int[] baseball_game_inputs = {R.id.baseball_game_input1, R.id.baseball_game_input2, R.id.baseball_game_input3};
    private EditText[] baseball_game_input = new EditText[baseball_game_inputs.length];
    private TextView result_view;

    String answer[] = new String[3];
    String user_guess[] = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baseball_game_v01);
        builder = new AlertDialog.Builder(this);
        for (int i = 0; i < baseball_game_inputs.length; i++) {
            baseball_game_input[i] = (EditText) findViewById(baseball_game_inputs[i]);

        }
        result_view = (TextView) findViewById(R.id.baseball_game_resultView);
        getRandom(); // 0~9 중복없는 난수



        for (int i = 0; i < btns.length; i++) {
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
    }


    public void getRandom(){
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
        }
    }

    public void baseball_game_todo(View view){


        builder.create();
        builder.setTitle("숫자 야구게임 규칙입니다.");
        builder.setMessage("해당 게임은 숫자 3자리를 맞추는 게임입니다. \n\n 1. 숫자 3개를 맞추는 게임입니다. \n\n 2. 숫자를 맞췄으나,  해당 자리수가 아니라면 Ball입니다. \n\n 3. 숫자가 그 자리에 알맞다면 Strike입니다. \n\n 행운을 빕니다. ");
        builder.setIcon(R.drawable.android_icon);
        builder.setPositiveButton("게임하러 가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "게임이 시작되었습니다.", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
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
                    result_view.setText("정답 : " + answer[0]+", " + answer[1]+", " + answer[2]+", \n" + cnt  +" 번째로 정답을 맞추셨습니다.. \n  자동으로 게임이 초기화 됩니다.  \n 새로운 3자리 숫자를 입력하세요.");
                    getRandom();
                    strike = 0; ball =0;

                }else {// 오답일때

                cnt++;
                    for (int b1 = 0 ; b1<user_guess.length; b1++){ // strike 판정 (인덱스를 기준으로 같은숫자가 있을떄
                        if (answer[b1].equals(user_guess[b1])){
                            strike++;
                        }
                    }
                    if (answer[0].equals(user_guess[1]) || answer[0].equals(user_guess[2])){
                        ball++;
                    }

                    if (answer[1].equals(user_guess[0]) || answer[1].equals(user_guess[2])){
                        ball++;
                    }

                    if (answer[2].equals(user_guess[0]) || answer[2].equals(user_guess[1])){
                        ball++;
                    }

        /*            for (int a1 =0; a1<user_guess.length; a1++){ // ball 판정
                            for (int a2 =0; a2<user_guess.length; a2++){

                                if (answer[a1].equals(user_guess[a2])){
                                    ball++;
                                }
                            }
                        }*/
                    Toast.makeText(getApplicationContext(), String.valueOf(ball) +"볼"+ String.valueOf(strike) +"스트라이크"+ "\n 오답입니다." ,Toast.LENGTH_LONG ).show();
                    result_view.setText("틀렸습니다!!!   " + cnt + "번째 시도중입니다. \n"  +  String.valueOf(ball) +"볼,   "+ String.valueOf(strike) +"스트라이크, 입니다. \n 잘 생각해보세요.");
                    strike =0;  ball = 0;
                }
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





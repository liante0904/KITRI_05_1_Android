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
public class GuessGameV01 extends Activity implements View.OnClickListener {

    int btns[] = {R.id.guessgame_backActivity,R.id.guessgame_escape, R.id.guessgame_0BT, R.id.guessgame_1BT, R.id.guessgame_2BT, R.id.guessgame_3BT, R.id.guessgame_4BT, R.id.guessgame_5BT,
            R.id.guessgame_6BT, R.id.guessgame_7BT, R.id.guessgame_8BT, R.id.guessgame_9BT, R.id.guessgame_dotBT, R.id.guessgame_goBT};

    Button btn[] = new Button[btns.length];


    int  length, result;
    private EditText guessgame_input;
    private TextView result_view;

    int flag, try_cnt = 1, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guessgame_v01);
        guessgame_input = (EditText) findViewById(R.id.guessgame_input);
        result_view = (TextView) findViewById(R.id.guessgame_resultView);
        answer = UserObj.getRandom(30); // 0~30 난수

        guessgame_input.setText("");
        for (int i =0; i<btns.length;i++){
            btn[i] = (Button) findViewById(btns[i]);
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        Button b = (Button) findViewById(v.getId());


        if (v.getId() == R.id.guessgame_backActivity) { //뒤로 가기 버튼
            finish();
        } else {
            flag = v.getId();
            if (v.getId() == R.id.guessgame_input) {  // 숫자 더하기

                Toast.makeText(getApplicationContext(), "111", Toast.LENGTH_SHORT).show();
                guessgame_input.setText(guessgame_input.getText().toString() + b.getText().toString());

            } else if (v.getId() == R.id.guessgame_dotBT) { // 점찍기 (duplicate)

                if (v.getId() == R.id.guessgame_input) {
                    guessgame_input.setText(guessgame_input.getText() + ".");
                }

            } else if (v.getId() == R.id.guessgame_escape) { // 숫자 지우기

                if (guessgame_input.getText().length() ==0){
                    guessgame_input.setText("");
                }else{

                    guessgame_input.setText(guessgame_input.getText().subSequence(0, guessgame_input.length() - 1));
                }

            } else if (v.getId() == R.id.guessgame_goBT) { // 계산 버튼

                int  user_input =  Integer.parseInt(String.valueOf(guessgame_input.getText())); // 입력값 받아오기

                if (user_input > 30 && try_cnt==0|| user_input ==0 && try_cnt==0){
                    if (user_input > 30){
                        Toast.makeText(getApplicationContext(), "30보다 큰수 입니다. 다시 입력해주세요.", Toast.LENGTH_SHORT).show();
                        guessgame_input.setText("");
                        result_view.setText("다시 입력해주세요!");
                    }else if (user_input ==0){
                        Toast.makeText(getApplicationContext(), "숫자가 너무 작습니다. 큰 수를 입력해주세요.", Toast.LENGTH_SHORT).show();
                        guessgame_input.setText("");
                        result_view.setText("다시 입력해주세요!");
                    }

                }else { // 사용자가 유효한 값을 입력했을때

                    if (answer == user_input){ // 맞췄을 경우
                        if (try_cnt ==1){
                            result_view.setText(try_cnt + "번 시도  " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n 운이 좋군요. 로또를 사러 가세요!");
                        }else if (try_cnt==2){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 굉장힌 실력자 군요?");
                        }else if (try_cnt==2){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 굉장힌 실력자 군요?");
                        }else if (try_cnt==3){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 실력을 조금 더 키우면 1번째에 가능할듯 합니다.");
                        }else if (try_cnt==4){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 대한민국 평균");
                        }else if (try_cnt==5){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 운이 별로 안좋으신듯욬ㅋㅋㅋㅋ");
                        }else if (try_cnt==6){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 게임을 못하시는 듯합니다.");
                        }else if (try_cnt==7){
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 이쯤되면 포기하실때도 됫는데.. 근성에 박수를..");
                        }else {
                            result_view.setText(try_cnt + "번 시도 " + "정답 : " + answer + "를 맞추셨습니다. 축하합니다! \n" +
                                    " 그냥 게임을 지우십시요. ㄷㄷㄷ;");
                        }

                    }else {  // 틀렸을 경우

                        if (answer > user_input){ //입력값보다 답이 클경우
                            result_view.setText(try_cnt + "번 시도 " + "틀렸습니다. \n" +
                                    "정답은 입력하신 " + user_input + "보다 더 큰 숫자입니다. ");
                        }else { // 답이 더 작을 경우

                            result_view.setText(try_cnt + "번 시도 " + "틀렸습니다. \n" +
                                    "정답은 입력하신 " + user_input + "보다 더 작은 숫자입니다. ");
                        }
                        try_cnt = try_cnt +1;

                    }
                }

            } else { //숫자 입력부

                    for (int i = 0; i < btns.length; i++) {
                        if (v.getId() == btns[i]) {
                            if (v.getId() == R.id.guessgame_0BT){
                                guessgame_input.setText(guessgame_input.getText().toString() + b.getText().toString());

                            }else {
                                guessgame_input.setText(guessgame_input.getText().toString() + b.getText().toString());
                            }

                        }
                    }
            }
        }
    }
}



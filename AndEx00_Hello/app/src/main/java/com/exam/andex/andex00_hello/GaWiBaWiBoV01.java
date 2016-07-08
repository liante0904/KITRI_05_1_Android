package com.exam.andex.andex00_hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-08.
 */

public class GaWiBaWiBoV01 extends Activity implements View.OnClickListener{

    private Button vResult;
    private Button vStop;

    private ImageView pcImgButton, userImgButton;
    private TextView pcScore, userScore, vTextresult;

    int pcScore_num, userScore_num, drawScore_num;

    int userInput; // 사용자가 선택한 flag (가위바위보)
    int pcInput; // 사용자가 선택한 flag


    int[] gameimgs = {R.id.g_a_cy, R.id.g_b_ro, R.id.g_c_pa};
    int[] gameimgs2 = {R.drawable.g_a_cy, R.drawable.g_b_ro, R.drawable.g_c_pa};
    // 사용자가 입력할 이미지 버튼 메모리주소
    ImageButton[] gameimg = new ImageButton[gameimgs.length];
    // 사용자가 입력할 이미지 버튼 배열


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gawibawibov01);



        vResult = (Button) findViewById(R.id.vResult);
        vResult.setOnClickListener(this);

        /*
        vStop = (Button) findViewById(R.id.vStop);
        vStop.setOnClickListener(this);
*/


        pcImgButton = (ImageView) findViewById(R.id.pcImgButton);
        userImgButton = (ImageView) findViewById(R.id.userImgButton);

        pcScore = (TextView) findViewById(R.id.pcScore);
        userScore =(TextView) findViewById(R.id.userScore);
        vTextresult =(TextView) findViewById(R.id.vTextresult);


        for (int i=0; i<gameimgs.length; i++){
            System.out.print(i);
            gameimg[i] = (ImageButton) findViewById(gameimgs[i]);
            gameimg[i].setOnClickListener(this);
        }

        int pcScore_num = 0, userScore_num = 0; // 스코어 초기화
    }

    @Override
    public void onClick(View v) {

        // 가위 = 0
        // 바위 = 1
        // 보 = 2
        // 숫자가 같다면 비긴다.
        if (v.getId()== R.id.vResult){

            userScore.setText(String.valueOf(userScore_num));
            pcScore.setText(String.valueOf(pcScore_num));
            String result = "컴퓨터 : " + pcScore_num + " 사용자:" + userScore_num +", 무승부:" + drawScore_num + "\n";
            if (pcScore_num> userScore_num){
                result += "컴퓨터가 이기고 있습니다.";
            }else if(pcScore_num < userScore_num){
                result += "사용자가가 이기고 있습니다.";
            }else if(pcScore_num == userScore_num){
                result += "현재 무승부 중입니다.";
            }

            vTextresult.setText(result);
        } else {

            userInput = v.getId();
            pcInput = UserObj.getRandom(gameimgs.length) - 1;

            //사용자 flag 판별부
            if (userInput == R.id.g_a_cy) { // 사용자가 가위를 냈을 경우
                userInput = 0;
            } else if (userInput == R.id.g_b_ro) {// 사용자가 바위를 냈을 경우
                userInput = 1;
            } else if (userInput == R.id.g_c_pa) { // 사용자가 보를 냈을 경우
                userInput = 2;
            } else
                System.out.print(userInput);
            userImgButton.setImageResource(gameimgs2[userInput]); // 사용자가 결정한 flag 이미지 전송
            pcImgButton.setImageResource(gameimgs2[pcInput]); // 컴퓨터가 결정한 flag 이미지 전송


            // 사용자와 컴퓨터 승부 판별부
            if (userInput == pcInput) { // 서로 같을경우 (draw처리)
                drawScore_num += 1;
            } else if (userInput == 0 && pcInput == 2 || userInput == 1 && pcInput == 0 || userInput == 2 && pcInput == 1) { // 사용자가 이겼을 경우
                userScore_num += 1;
            } else { //사용자가 졌을 경우
                pcScore_num += 1;
            }
        }

    }
}

package com.exam.andex.andex00_hello;

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

        textsrc[0] = "마법사는 영혼의 세계와 인간 세계와의 다리 역할을 하는 존재이다. 오른 손에는 하늘로 높이 올려진 지팡이가 있으며, 왼손은 땅을 가리킨다. 영적인 힘의 전달자이며 신과 인간의 중재자이기도 하다.\n" +
                " \n" +
                "머리에는 영원의 상징이 있으며, 허리에는 자신의 꼬리를 물고 있는 뱀이 있다(또다른 영원의 상징). 마법의 책상에는 모두 4벌의 타로가 있으며 각각은 연금술사의 근본적인 요소(地․風․火․水)를 상징하고 있다. 그의 예복(禮服)은 희며(광대에게서 발견된 순수함과 천진난만함), 소매없는 외투는 붉다(세속적인 경험과 지식을 나타냄).";

        textsrc[1] = "이 카드는 대립물들의 결합이다. 마법사와는 달리( 하늘과 땅의 사이에서 그 간격의 다리 역할을 함) 그녀 속에는 이중성을 내포하고 있다. 그래서 그녀는 두 줄의 사이(하나는 희고 하나는 검은)에 서 있다. 그녀는 우리 모두의 마음 속에 있는 내부적인 영혼의 길잡이다.\n" +
                " \n" +
                "그녀의 뒤에는, 비옥함과 풍요로움을 나타내는 많은 씨를 가진 석류나무로 뒤덮힌 장막이 있다. 그녀의 다리에는 초승달이 있으며, 처녀이면서도 어머니였던 여성의 역설(逆說), 바로 예수의 어머니 마리아를 떠오르게 하는 흰 예복(禮服)과 푸른 겉옷이 함께 있다.\n" +
                " \n";

        textsrc[2] = "여제는 전형적인 대지(大地:만물의 생명의 근원으로서), 남성의 억제된 여성적 특징, 여성의 원리이다. 그녀는 무성한 푸른 나뭇잎과 잘 익은 밀밭으로 둘려 쌓여져 있으며, 아마도 임신한 듯한 모습이기도 하다. 그녀의 침상아래에는 심장 모습의 베게(비너스의 심볼로 꾸며진)가 있다. 그녀의 늘어진 겉옷은 비옥을 상징하는 석류나무로 장식되어져 있다. 그녀의 뒤에서는 숲속에서 강물이 자유스럽게 흘러간다(물은 생명의 상징). 그녀의 치켜든 손에는 이 땅에서의 모든 만물위에 군림하는 그녀의 권능과 권위를 나타내주는 권장(權杖:지팡이)가 들려져 있다.";
        textsrc[3] = "황제는 여제(女帝)에 대한 보완이다. 그는 남성적인 원리, 여성의 억제된 남성적 특징, 가장(家長) 등이다. 권력과 권위를 나타내며 그의 엄격한 태도는 여제의 육감적인 아름다움으로부터 완전히 이탈된 것이다. 그의 왕좌(王座) 뒤에는 메마른 산(山= 당당한 지배자의 상징)이 있다. 왕좌는 4개의 양(羊)의 머리[= 지적(知的)인 극치․ 높고 험한 바위산을 오를 수 있는 확실한 발이 있음의 상징]로 장식되어 있다. 그의 오른손은 앙크 십자(고리달린 T자형 십자로서 이집트의 생명의 상징)를 잡고 있다.";
        textsrc[4] = "이 카드는 우리 자신과 신(神)의 사이를 연결하는 면에서 마법사와 비슷하다. 전통적으로 교황의 역할은 신과 인류의 중재이다. 그러한 것으로서, 교황은 신과 만나려할 때 우리를 돕는 영혼의 스승을 나타낸다. 단순히 방향을 제시하는 마법사와는 달리, 교황은 신뢰받고 있는 안내자이며 우리들을 직접 인도하여 정신적인 목표점으로 이끌어 줄 것이다. 그는 또한 전통․정통파․영성(靈性)을 향상시키기 위한 조직화된 방법 등을 나타낸다. 이 카드는 당신 종교의 배경이 무엇인가에 무관하게, 당신이 어린 시절부터 가르침을 받아왔던 정신적인 숭고함, 그리고 당신이 대대로 물려받은 것으로서의 종교적인 전통 등을 나타낸다.";
        textsrc[5] = "이 카드는 우리 삶에 있어서의 대인관계 - 특히 친밀성 그리고(또는) 성적(性的)인 관계를 나타낸다. 우리 생활에 있어서의 사랑이 기본적으로 어디에서 중요한 것인가의 상황을 나타내며, 그 당시의 대인관계의 상황 등을 반영한다. 연인들은 그들 위에 있는 구름 속의 천사들에 의하여 축복받고 보호받는다. 또한 태양은 그들의 머리위에서 따뜻함과 안전을 선사하면서 밝게 빛난다. 그들이 딛고 있는 땅은 인생이 즐거운 것을 상징하듯이 푸르고 비옥하다. 그러나 모든 다른 카드와 마찬가지로, 연인에게도 부정적인 면이 존재하고 있다.\n" +
                " \n";
        textsrc[9] = "이 카드는 힘(개인의 행위․행동을 가능하게 하는), 결심 그리고 전차 카드와 비슷한 방식으로서의 힘(능력의 일반적인 의미)을 나타낸다. 그러나 일견(一見)하여 그 차이점들은 분명하다. 강렬하고 집중된 전사(戰士)대신에, 우리들은 온화(溫和)한 여인을 만난다. 그녀는 비무장이며 갑옷의 보호장구도 갖추지 않았다. 그녀는 오직 자신스스로의 내부로부터 나올 수 있는 조용한 힘으로 사자(獅子)를 압도한다.";
        textsrc[7] = "은둔자는 현명한 마음의 소유자이다. 그는 마치 ‘광대 카드’와 같이 메마른 산꼭대기의 절벽끝에 서 있다. 그러나 조심없이 그 발끝을 내디디는 천진하고 경험이 없는 광대와는 달리 은둔자는 한 손에 지혜의 지휘봉을 쥐고 있다. 다른 손에는 길을 모르는 사람에게 방향을 가르쳐 줄 수 있는 빛을 가지고 있다.\n" +
                " \n" +
                "은둔자는 집단적의 무의식의 존재를 통하여 우리 속에 살고 있는 고대의 인물이며, 그의 빛나는 빛으로 어둠을 꿰뚫고 우리들을 인도(引導)하는 우주적인 정신이다. 은둔자는 우리 자신들의 깊숙한 부분 (결정의 순간에 무엇을 해야하는 지를 아는 것․세상과 그의 도전에 대하여 반응하는 올바른 길을 알고 있는 것)을 나타낸다.";
        textsrc[8] = "아마 다른 어떠한 카드보다도 강렬한 이 카드는 밝음과 어둠, 선(善)과 악(惡)의 이중적인 면을 가진다. 이 카드는, 돌아 다니는 것은 다시 돌아온다는 문구(文句)에서 나타내어지는 것과 같이, 시간의 순환적인 속성을 나타낸다. 우리의 인생은 상승과 하락으로 가득차 있으며, 어려움과 번영의 시기가 항상 지속되는 것은 없다. 우리의 삶은 항상 변화하며 우리들은 우리삶에 있어서의 변화에 적응하는 것을 배워야 한다. 그렇지 않으면(이 세상이 우리들 없이 움직이는 것과 같이) 우리는 뒤편에 머물게 될 것이다.\n" +
                " ";
        textsrc[6] = "이 카드는 균형과 조화를 나타낸다. 모든 카드를 통하여,\n" +
                "우리가 인생의 긍정적․부정적인 측면을 만났을 때,\n" +
                "우리는 반드시 옳고 그름․어둠과 밝음의 사이에서 선택을 해야한다.\n" +
                "이 카드는, 건전하고 성취한 인생을 살기 위하여 우리들이 반드시 창조해야 할 균형을 나타낸다.\n" +
                " \n" ;


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

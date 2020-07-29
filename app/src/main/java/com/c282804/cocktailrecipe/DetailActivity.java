package com.c282804.cocktailrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        findViewById(R.id.iv);


        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        int imgID = intent.getIntExtra("msg", R.drawable.milk);

        //제목줄의 제목 변경
        getSupportActionBar().setTitle(name);



        //선택된 name에 따라 다른 화면의 값으로 변경
        if (name.equals("데낄라선라이즈")) {
            setContentView(R.layout.sunrise);
        } else if (name.equals("럼콕")) {
            setContentView(R.layout.rumcock);
        } else if (name.equals("말리부오렌지")) {
            setContentView(R.layout.marlibuorange);
        } else if (name.equals("미도리샤워")) {
            setContentView(R.layout.midori);
        } else if (name.equals("보드카오렌지")) {
            setContentView(R.layout.vodkaorange);
        } else if (name.equals("블랙러시안")) {
            setContentView(R.layout.blackrussian);
        } else if (name.equals("블루하와이")) {
            setContentView(R.layout.bluehawaii);
        } else if (name.equals("오르가즘")) {
            setContentView(R.layout.orgasm);
        } else if (name.equals("진토닉")) {
            setContentView(R.layout.jintonic);
        } else if (name.equals("롱아일랜드아이스티")) {
            setContentView(R.layout.longtee);
        } else if (name.equals("레몬드랍")) {
            setContentView(R.layout.lemondrop);
        } else if (name.equals("블루사파이어")) {
            setContentView(R.layout.bluesapphire);
        } else if (name.equals("섹스온더비치")) {
            setContentView(R.layout.sexonthebeach);
        } else if (name.equals("잭콕")) {
            setContentView(R.layout.jackcoke);
        } else if (name.equals("준벅")) {
            setContentView(R.layout.junebug);
        } else if (name.equals("감바스")) {
            setContentView(R.layout.rkaqktm);
        } else if (name.equals("오일파스타")) {
            setContentView(R.layout.dhdlfvktmxk);
        } else if (name.equals("토마토카프레제")) {
            setContentView(R.layout.xhakxhzkvmfpwp);
        } else if (name.equals("치즈나쵸")) {
            setContentView(R.layout.clwmskcy);
        } else if (name.equals("소세지구이")) {
            setContentView(R.layout.thtpwlrndl);
        } else if (name.equals("닭가슴살샐러드")) {
            setContentView(R.layout.ekfrrktmatkftoffjem);
        } else if (name.equals("참치카나페")) {
            setContentView(R.layout.ckaclzkskvp);
        } else if (name.equals("베이컨에그롤")) {
            setContentView(R.layout.qpdlzjsdprmfhf);
        } else if (name.equals("바톤 럼")){
            setContentView(R.layout.rumbottle);
        }else  if (name.equals("바톤 진")){
            setContentView(R.layout.jinbottle);
        }else  if (name.equals("바톤 보드카")){
            setContentView(R.layout.vodkabottle);
        }else  if (name.equals("듀랑고 골드")){
            setContentView(R.layout.durangobottle);
        }else  if (name.equals("론디아즈")){
            setContentView(R.layout.londiazbottle);
        }else if (name.equals("잭다니엘")){
            setContentView(R.layout.jackbottle);
        }else if (name.equals("지룩스(석류)")){
            setContentView(R.layout.girouxredbottle);
        }else if (name.equals("말리부")) {
            setContentView(R.layout.malibubottle);
        }else if (name.equals("애플퍼커")) {
            setContentView(R.layout.applepuckerbottle);
        }else if (name.equals("지룩스(라임)")) {
            setContentView(R.layout.girouxlimebottle);
        }else if (name.equals("깔루아")) {
            setContentView(R.layout.kahluabottle);
        }else if (name.equals("미도리")) {
            setContentView(R.layout.midoribottle);
        }else if (name.equals("블루큐라소")) {
            setContentView(R.layout.bluebottle);
        }else if (name.equals("아마레또")) {
            setContentView(R.layout.amrettobottle);
        }else if (name.equals("카시스리큐르")) {
            setContentView(R.layout.cassisbottle);
        }else if (name.equals("피치리큐르")){
            setContentView(R.layout.peachbottle);
        }else if (name.equals("샤워믹스")) {
            setContentView(R.layout.sourmixbottle);
        }else if (name.equals("트리플섹")){
            setContentView(R.layout.triplesecbottle);
        }


    }
}

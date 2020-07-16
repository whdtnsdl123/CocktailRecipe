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
        } else if (name.equals("치킨너겟")) {
            setContentView(R.layout.clzlssjrpt);
        } else if (name.equals("꿀토마토")) {
            setContentView(R.layout.rnfxhakxh);
        } else if (name.equals("치즈나쵸")) {
            setContentView(R.layout.clwmskcy);
        } else if (name.equals("소세지구이")) {
            setContentView(R.layout.thtpwlrndl);
        } else if (name.equals("닭가슴살샐러드")) {
            setContentView(R.layout.ekfrrktmatkftoffjem);
        } else if (name.equals("참치카나페")) {
            setContentView(R.layout.ckaclzkskvp);
        } else if (name.equals("브라운치즈토스트")) {
            setContentView(R.layout.qmfkdnsclwmxhtmxm);
        }


    }
}

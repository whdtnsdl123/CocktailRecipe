package com.c282804.cocktailrecipe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        findViewById(R.id.iv);




        Intent intent =getIntent();
        String name =intent.getStringExtra("Name");
        int imgID =intent.getIntExtra("msg",R.drawable.milk);

        //제목줄의 제목 변경
        getSupportActionBar().setTitle(name);


        //선택된 name에 따라 다른 화면의 값으로 변경
        if( name.equals("데낄라선라이즈")){
            setContentView(R.layout.sunrise);
        }else if( name.equals("럼콕")){
            setContentView(R.layout.rumcock);
        }else if(name.equals("말리부오렌지")){
            setContentView(R.layout.marlibuorange);
        }else if(name.equals("미도리샤워")){
            setContentView(R.layout.midori);
        }else if(name.equals("보드카오렌지")){
            setContentView(R.layout.vodkaorange);
        }else if(name.equals("블랙러시안")){
            setContentView(R.layout.blackrussian);
        }else if (name.equals("블루하와이")){
            setContentView(R.layout.bluehawaii);
        }else if (name.equals("오르가즘")){
            setContentView(R.layout.orgasm);
        }else if (name.equals("진토닉")){
            setContentView(R.layout.jintonic);
        }









    }


}

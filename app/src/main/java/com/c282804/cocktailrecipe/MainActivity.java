package com.c282804.cocktailrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FragmentManager fragmentManager;

    Fragment[] fragments = new Fragment[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Easy Cocktail");


        fragmentManager=getSupportFragmentManager();


        fragments[0] = new Fragment();
        fragments[1] = new Fragment();
        fragments[2] = new Fragment();
        fragments[3] = new Fragment();

        FragmentTransaction tran = fragmentManager.beginTransaction();
        tran.add(R.id.recycler,fragments[0]);
        tran.commit();

        bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                FragmentTransaction tran = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){


                    case R.id.Easy_:
                        tran.replace(R.id.recycler,fragments[0]);
                        break;

                    case R.id.Normal_:
                        tran.replace(R.id.recycler,fragments[1]);

                    case R.id.Food_:
                        tran.replace(R.id.recycler,fragments[2]);

                    case R.id.Bottle_:
                        tran.replace(R.id.recycler,fragments[3]);
                }

                tran.commit();


                return true;
            }
        });



    }
}

package com.c282804.cocktailrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;





import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FragmentManager fragmentManager;

    Fragment[] fragments = new Fragment[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager=getSupportFragmentManager();


        fragments[0] = new EasyFragment();
        fragments[1] = new NormalFragment();
        fragments[2] = new FoodFragment();
        fragments[3] = new BottleFragment();

        FragmentTransaction tran = fragmentManager.beginTransaction();
        tran.add(R.id.container,fragments[0]);
        tran.commit();

        bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                FragmentTransaction tran = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){


                    case R.id.Easy_:
                        tran.replace(R.id.container,fragments[0]);
                        getSupportActionBar().setTitle("Easy Cocktail");
                        break;

                    case R.id.Normal_:
                        tran.replace(R.id.container,fragments[1]);
                        getSupportActionBar().setTitle("Normal Cocktail");
                        break;

                    case R.id.Food_:
                        tran.replace(R.id.container,fragments[2]);
                        getSupportActionBar().setTitle("Food Recipe");
                        break;

                    case R.id.Bottle_:
                        tran.replace(R.id.container,fragments[3]);
                        getSupportActionBar().setTitle("Bottle Information");
                        break;
                }

                tran.commit();


                return true;
            }
        });



    }
}

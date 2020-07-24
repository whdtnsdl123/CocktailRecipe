package com.c282804.cocktailrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NormalFragment extends Fragment {

    MyAdapter adapter;

    RecyclerView recyclerView;

    ArrayList<Item> items= new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        items.add(new Item("롱아일랜드아이스티",R.drawable.longtee,"https://media.istockphoto.com/photos/long-island-iced-tea-picture-id180888927?k=6&m=180888927&s=170667a&w=0&h=EWPsZHys_ISiIJcSDWMBjRyT18R7M2u0SYwTHcNRwnU="));
        items.add(new Item("미도리샤워",R.drawable.shower,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/de34bbe5-8bdd-4149-960b-edae43cb1943.jpg"));
        items.add(new Item("블루사파이어",R.drawable.bluesapphire,"https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F235507495243A5CB24"));
        items.add(new Item("섹스온더비치",R.drawable.sexonthebeach,"https://lh3.googleusercontent.com/proxy/4w3XTGeErZw4nhRxGAD6wKrO58Ukaz-83o6AtgHsWegNIiCmGfBwavky7rhOm5CJESzBptm0RIbhZbWifUN8q7mz4GKVnMuYBvopSHT4jEBzzIIs2rQNWYuh1xboCPlfAJqt48KLwbQMjAqEI3l14UN5k6wGwYeVC9nCEjcWFcMV66Plxx8"));
        items.add(new Item("블루하와이",R.drawable.hawaii,"https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile2.uf.tistory.com%2Fimage%2F276BF537524A70990DF889"));
        items.add(new Item("준벅",R.drawable.junebug,"https://cphoto.asiae.co.kr/listimglink/1/2020022113351772164_1582259717.png"));


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.easyfragment,container,false);


        adapter=new MyAdapter(getActivity(),items);
        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        return view;





    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.option,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option:


                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

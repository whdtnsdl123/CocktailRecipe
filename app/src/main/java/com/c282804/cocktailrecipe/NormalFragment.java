package com.c282804.cocktailrecipe;

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
        items.add(new Item("레몬 드랍",R.drawable.lemondrop,"https://lh3.googleusercontent.com/proxy/VJUafPjlgJDcbXo0GRQ97kg8RRLhjtLmXD6yx7EuZ86HTiB-jFJDSPbdT3k5Kcu4F0-iwNXthel0G8RAP4KhC-vH358i9K_ryrDyi903LRS9vJow2iZQa5Ra5eMcT4TsiMSgcrIYIbQ34EOBjPFYUSa-UHP9jdHDg4_wIy0cfURoscpvbOG9xy8z-8Rivj1Q4sSj-hxbyth_Dsnmq9LkPjMAAWkDFYHomb301aaHNPpHbzw0ufz1X-q2Qo_FnVfNYeGkGxM-SXOUe3BUdka-684uMLOzy4d3hvyWqgrHD0bLDXivkDdrjpVbYgob1C5DkX3P2U6iCIO6sIBODc13Ww"));
        items.add(new Item("블루사파이어",R.drawable.bluesapphire,"https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F235507495243A5CB24"));
        items.add(new Item("섹스온더비치",R.drawable.maribu,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/9162c6d4-4df8-417c-a108-290dd9ccdb69.jpg"));
        items.add(new Item("잭콕",R.drawable.shower,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/de34bbe5-8bdd-4149-960b-edae43cb1943.jpg"));
        items.add(new Item("준벅",R.drawable.vodkaorange,"https://w.namu.la/s/4135731d63daca9e71fb0f280fe4b25e697411015ec2429f3dca1514405d0137992d2ccc48bde4e3bf7632756e36ec340ef295ca1ccc3fa312a9f9f4db5c6c6733abe51a8ab1d8ba79a65a1e2ab6b7f1285e3a6b57fd3d88241da87b977d5cc9"));


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

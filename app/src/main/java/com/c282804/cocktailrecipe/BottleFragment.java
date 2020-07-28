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

public class BottleFragment extends Fragment {

    BottleAdapter adapter;

    RecyclerView recyclerView;

    ArrayList<Item> items= new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        items.add(new Item("바톤 럼",R.drawable.bartonrum,"http://blogfiles.naver.net/MjAxOTAxMjBfNDYg/MDAxNTQ3OTU5NTUzNjgx.3zeAVfnqLARnajZpTc3SyOyUb2eeDG3yyXf_v9X5RlMg.kyZxOpyxYsKLZaJB85m8cWy7f5HgccLXTml4Q5HtBYsg.JPEG.tjsxorud/%B4%D9%BF%EE%B7%CE%B5%E5.jpg"));
        items.add(new Item("바톤 진",R.drawable.bartonjin,"https://lh3.googleusercontent.com/proxy/vLWR8YZC83SvtddTuHKWXZfYbXewvJ0Q-VE1mHyYrkwRAed9ezVVQl4-eB3KkTTS9slJZRF93XsRu6savlh_spBMdniLR5TLONTE_9qCZXrIwGeovH0ynjIqrlkonR-io9Q3_v5OpeVDayIF_FR1qAPc5DfTrG4cgoho9CypyEPiIlnSUycI2R0X5Odz1NCOGsOoLiKrWdAPvjOnohj9zCVNwogdj0FTjjOFJmBLAW6jiamcbCosJBnUur-e8KagwohoLFnAAFD9Ozmv9mIZRzqn4sGL7Rdv5ztljpzJfYeec92glaKDBJMgb5K8NfVwVHwcluj_f21Vw3TZinCPiHl9wH4CWR6XTxAK6bh3KmYQFAYOSNMvwN6pPUw1"));
        items.add(new Item("바톤 보드카",R.drawable.bartonvodka,"https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F212C3342526088E908703E"));
        items.add(new Item("듀랑고 골드",R.drawable.durango,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/9162c6d4-4df8-417c-a108-290dd9ccdb69.jpg"));
        items.add(new Item("론디아즈",R.drawable.lonedi,"https://lh3.googleusercontent.com/proxy/VJUafPjlgJDcbXo0GRQ97kg8RRLhjtLmXD6yx7EuZ86HTiB-jFJDSPbdT3k5Kcu4F0-iwNXthel0G8RAP4KhC-vH358i9K_ryrDyi903LRS9vJow2iZQa5Ra5eMcT4TsiMSgcrIYIbQ34EOBjPFYUSa-UHP9jdHDg4_wIy0cfURoscpvbOG9xy8z-8Rivj1Q4sSj-hxbyth_Dsnmq9LkPjMAAWkDFYHomb301aaHNPpHbzw0ufz1X-q2Qo_FnVfNYeGkGxM-SXOUe3BUdka-684uMLOzy4d3hvyWqgrHD0bLDXivkDdrjpVbYgob1C5DkX3P2U6iCIO6sIBODc13Ww"));
        items.add(new Item("잭다니엘",R.drawable.jack,"https://w.namu.la/s/4135731d63daca9e71fb0f280fe4b25e697411015ec2429f3dca1514405d0137992d2ccc48bde4e3bf7632756e36ec340ef295ca1ccc3fa312a9f9f4db5c6c6733abe51a8ab1d8ba79a65a1e2ab6b7f1285e3a6b57fd3d88241da87b977d5cc9"));
        items.add(new Item("지룩스(석류)",R.drawable.giroux1,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/5daa98d9-11d8-400d-aa8a-d6a4eb2fedc2.jpg"));
        items.add(new Item("말리부",R.drawable.marlibu1,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("애플퍼커",R.drawable.applepucker,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("지룩스(라임)",R.drawable.giroux,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("깔루아",R.drawable.kahlua,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("미도리",R.drawable.midorib,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("블루큐라소",R.drawable.bluecu,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("아마레또",R.drawable.amartto,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("카시스리큐르",R.drawable.cassis,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("피치리큐르",R.drawable.peach,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("샤워믹스",R.drawable.sourmix,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("트리플섹",R.drawable.triplesec,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottlefragment,container,false);


        adapter=new BottleAdapter(getActivity(),items);
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
                Intent intent = new Intent(getActivity(),MapActivity.class);
                startActivity(intent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}



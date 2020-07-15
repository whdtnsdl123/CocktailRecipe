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

        items.add(new Item("롱아일랜드아이스티",R.drawable.milk,"http://blogfiles.naver.net/MjAxOTAxMjBfNDYg/MDAxNTQ3OTU5NTUzNjgx.3zeAVfnqLARnajZpTc3SyOyUb2eeDG3yyXf_v9X5RlMg.kyZxOpyxYsKLZaJB85m8cWy7f5HgccLXTml4Q5HtBYsg.JPEG.tjsxorud/%B4%D9%BF%EE%B7%CE%B5%E5.jpg"));
        items.add(new Item("버번콕",R.drawable.rise,"https://lh3.googleusercontent.com/proxy/vLWR8YZC83SvtddTuHKWXZfYbXewvJ0Q-VE1mHyYrkwRAed9ezVVQl4-eB3KkTTS9slJZRF93XsRu6savlh_spBMdniLR5TLONTE_9qCZXrIwGeovH0ynjIqrlkonR-io9Q3_v5OpeVDayIF_FR1qAPc5DfTrG4cgoho9CypyEPiIlnSUycI2R0X5Odz1NCOGsOoLiKrWdAPvjOnohj9zCVNwogdj0FTjjOFJmBLAW6jiamcbCosJBnUur-e8KagwohoLFnAAFD9Ozmv9mIZRzqn4sGL7Rdv5ztljpzJfYeec92glaKDBJMgb5K8NfVwVHwcluj_f21Vw3TZinCPiHl9wH4CWR6XTxAK6bh3KmYQFAYOSNMvwN6pPUw1"));
        items.add(new Item("블루사파이어",R.drawable.rum,"https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F212C3342526088E908703E"));
        items.add(new Item("섹스온더비치",R.drawable.maribu,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/9162c6d4-4df8-417c-a108-290dd9ccdb69.jpg"));
        items.add(new Item("잭콕",R.drawable.shower,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/de34bbe5-8bdd-4149-960b-edae43cb1943.jpg"));
        items.add(new Item("준벅",R.drawable.vodkaorange,"https://w.namu.la/s/4135731d63daca9e71fb0f280fe4b25e697411015ec2429f3dca1514405d0137992d2ccc48bde4e3bf7632756e36ec340ef295ca1ccc3fa312a9f9f4db5c6c6733abe51a8ab1d8ba79a65a1e2ab6b7f1285e3a6b57fd3d88241da87b977d5cc9"));
//

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

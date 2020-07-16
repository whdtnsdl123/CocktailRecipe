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

public class EasyFragment extends Fragment {

    MyAdapter adapter;

    RecyclerView recyclerView;

    ArrayList<Item> items= new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        items.add(new Item("깔루아밀크",R.drawable.milk,"http://blogfiles.naver.net/MjAxOTAxMjBfNDYg/MDAxNTQ3OTU5NTUzNjgx.3zeAVfnqLARnajZpTc3SyOyUb2eeDG3yyXf_v9X5RlMg.kyZxOpyxYsKLZaJB85m8cWy7f5HgccLXTml4Q5HtBYsg.JPEG.tjsxorud/%B4%D9%BF%EE%B7%CE%B5%E5.jpg"));
        items.add(new Item("데낄라선라이즈",R.drawable.rise,"https://lh3.googleusercontent.com/proxy/vLWR8YZC83SvtddTuHKWXZfYbXewvJ0Q-VE1mHyYrkwRAed9ezVVQl4-eB3KkTTS9slJZRF93XsRu6savlh_spBMdniLR5TLONTE_9qCZXrIwGeovH0ynjIqrlkonR-io9Q3_v5OpeVDayIF_FR1qAPc5DfTrG4cgoho9CypyEPiIlnSUycI2R0X5Odz1NCOGsOoLiKrWdAPvjOnohj9zCVNwogdj0FTjjOFJmBLAW6jiamcbCosJBnUur-e8KagwohoLFnAAFD9Ozmv9mIZRzqn4sGL7Rdv5ztljpzJfYeec92glaKDBJMgb5K8NfVwVHwcluj_f21Vw3TZinCPiHl9wH4CWR6XTxAK6bh3KmYQFAYOSNMvwN6pPUw1"));
        items.add(new Item("럼콕",R.drawable.rum,"https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F212C3342526088E908703E"));
        items.add(new Item("말리부오렌지",R.drawable.maribu,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/9162c6d4-4df8-417c-a108-290dd9ccdb69.jpg"));
        items.add(new Item("레몬드랍",R.drawable.lemondrop,"https://lh3.googleusercontent.com/proxy/VJUafPjlgJDcbXo0GRQ97kg8RRLhjtLmXD6yx7EuZ86HTiB-jFJDSPbdT3k5Kcu4F0-iwNXthel0G8RAP4KhC-vH358i9K_ryrDyi903LRS9vJow2iZQa5Ra5eMcT4TsiMSgcrIYIbQ34EOBjPFYUSa-UHP9jdHDg4_wIy0cfURoscpvbOG9xy8z-8Rivj1Q4sSj-hxbyth_Dsnmq9LkPjMAAWkDFYHomb301aaHNPpHbzw0ufz1X-q2Qo_FnVfNYeGkGxM-SXOUe3BUdka-684uMLOzy4d3hvyWqgrHD0bLDXivkDdrjpVbYgob1C5DkX3P2U6iCIO6sIBODc13Ww"));
        items.add(new Item("보드카오렌지",R.drawable.vodkaorange,"https://w.namu.la/s/4135731d63daca9e71fb0f280fe4b25e697411015ec2429f3dca1514405d0137992d2ccc48bde4e3bf7632756e36ec340ef295ca1ccc3fa312a9f9f4db5c6c6733abe51a8ab1d8ba79a65a1e2ab6b7f1285e3a6b57fd3d88241da87b977d5cc9"));
        items.add(new Item("블랙러시안",R.drawable.russian,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/5daa98d9-11d8-400d-aa8a-d6a4eb2fedc2.jpg"));
        items.add(new Item("잭콕",R.drawable.jackcoke,"https://dailyshotassets.s3-accelerate.amazonaws.com/media/cocktails/%25Y/%25m/%25d/8e98f160-0b99-4c63-969e-7d5a71a5836c.jpg"));
        items.add(new Item("오르가즘",R.drawable.oorgasm,"https://mblogthumb-phinf.pstatic.net/20131122_278/kr_cordina_1385094607443vsg5J_JPEG/%25EC%2598%25A4%25EB%25A5%25B4%25EA%25B0%2580%25EC%25A6%2598%25EC%25B9%25B5%25ED%2585%258C%25EC%259D%25BC.jpg?type=w800"));
        items.add(new Item("진토닉",R.drawable.jin1,"https://57fa8560-a-62cb3a1a-s-sites.googlegroups.com/site/lsiu0216/mn/jintonig/%EC%A7%84%ED%86%A0%EB%8B%89.jpg?attachauth=ANoY7cp52cKUh4x4d74GT7mIzIVcK6xxFzE05zDlMVEC9OSR-dRfgY51L2r1ZN48wAYMxadtcDlHzHu2UZRSQLPg3pSjrgz00j3pAwR2ZR6s9__nchspt6zLyQe6NA8l6HKFLgBAAtXZR35EXonZwZCknziNSrmzDvw1jIdwAHQIJ-v2-Pf7WDVLYdESr__faoum0dGunjI90HupAe4JhTc_voflRgrzFP9UrJH-wb_zlTkeZDcrsCDNcNdQV75x2bpWPsl1ham8&attredirects=0"));


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



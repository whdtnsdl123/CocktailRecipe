package com.c282804.cocktailrecipe;


import android.content.Context;
import android.media.tv.TvContentRating;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class IconAdapter implements GoogleMap.InfoWindowAdapter {

    Context context;

    public IconAdapter(Context context) {
        this.context = context;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.icon_item, null);

        switch ( marker.getTitle() ){
            case "부쉬윅":
                TextView tv= view.findViewById(R.id.tv);
                TextView tv_place= view.findViewById(R.id.tv_place);
                TextView tv_adress=view.findViewById(R.id.tv_adress);

                tv_adress.setText("서울시 강남구 신사동 647-23 지하1층");
                ImageView iv = view.findViewById(R.id.iv);
                tv_place.setText("Lounge");
                tv.setText("부쉬윅");

                iv.setImageResource(R.drawable.bushwick);

                break;

            case "카사코로나":
                TextView tv2= view.findViewById(R.id.tv);
                ImageView iv2 = view.findViewById(R.id.iv);
                TextView tv_place1= view.findViewById(R.id.tv_place);
                TextView tv_adress1=view.findViewById(R.id.tv_adress);

                tv_adress1.setText("서울시 용산구 한남동 127-15 4층 ");
                tv2.setText("카사코로나");
                tv_place1.setText("Pub (Rooftop)");
                iv2.setImageResource(R.drawable.casa);
                break;

            case "디코이":
                TextView tv3= view.findViewById(R.id.tv);
                ImageView iv3 = view.findViewById(R.id.iv);
                TextView tv_place2= view.findViewById(R.id.tv_place);
                TextView tv_adress2=view.findViewById(R.id.tv_adress);

                tv_adress2.setText("서울 용산구 한남동 736-8 지하1층");
                tv3.setText("디코이");
                tv_place2.setText("Club");
                iv3.setImageResource(R.drawable.decoy);
                break;



            case "싱크홀":
                TextView tv4= view.findViewById(R.id.tv);
                ImageView iv4 = view.findViewById(R.id.iv);
                TextView tv_place3= view.findViewById(R.id.tv_place);
                TextView tv_adress3=view.findViewById(R.id.tv_adress);

                tv_adress3.setText("서울시 마포구 서교동 363-1 지하1층");
                tv4.setText("싱크홀");
                tv_place3.setText("Club");
                iv4.setImageResource(R.drawable.sinkhole);
                break;

            case "솔트코크&1675":
                TextView tv5= view.findViewById(R.id.tv);
                ImageView iv5= view.findViewById(R.id.iv);
                TextView tv_place4= view.findViewById(R.id.tv_place);
                TextView tv_adress4=view.findViewById(R.id.tv_adress);

                tv_adress4.setText("서울 광진구 화양동 8-99 지하1층");
                tv5.setText("솔트코크&1675");
                tv_place4.setText("Lounge&Club");
                iv5.setImageResource(R.drawable.soltcoke);
                break;

            case "언더그라운드":
                TextView tv6= view.findViewById(R.id.tv);
                ImageView iv6 = view.findViewById(R.id.iv);
                TextView tv_place5= view.findViewById(R.id.tv_place);
                TextView tv_adress5=view.findViewById(R.id.tv_adress);

                tv_adress5.setText("서울시 마포구 서교동 409-7 지하1층");
                tv6.setText("언더그라운드");
                tv_place5.setText("Lounge");
                iv6.setImageResource(R.drawable.underground2);
                break;

            case "아울":
                TextView tv7= view.findViewById(R.id.tv);
                ImageView iv7 = view.findViewById(R.id.iv);
                TextView tv_place6= view.findViewById(R.id.tv_place);
                TextView tv_adress6=view.findViewById(R.id.tv_adress);

                tv_adress6.setText("서울 용산구 이태원동 123-5 지하1층");
                tv7.setText("아울");
                tv_place6.setText("Club");
                iv7.setImageResource(R.drawable.owl);
                break;

        }

        return view;
    }
}

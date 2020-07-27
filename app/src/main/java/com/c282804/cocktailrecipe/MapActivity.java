package com.c282804.cocktailrecipe;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity {



    GoogleMap GMap;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        FragmentManager fragmentManager = getSupportFragmentManager();
        final SupportMapFragment mapFragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.map);

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                GMap = googleMap;

                LatLng bush = new LatLng(37.5246325,127.0344706);

                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(bush);
                markerOptions.title("부쉬윅");
                markerOptions.snippet("라운지 바");
                markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));

                GMap.addMarker(markerOptions);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bush,12));

                LatLng corona = new LatLng(37.5340433,126.992328);


                MarkerOptions markerOptions1 = new MarkerOptions();
                markerOptions1.position(corona);
                markerOptions1.title("카사코로나");
                markerOptions1.snippet("라운지 바");
                markerOptions1.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));

                GMap.addMarker(markerOptions1);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(corona,12));




                //지도의 정보창을 클릭했을때 반응하기
                GMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        String title= marker.getTitle();

                        if(title.equals("부쉬윅")){
                            //교육원 홈페이지로 이동(웹브라우저 실행)
                            Intent intent= new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri= Uri.parse("https://store.naver.com/restaurants/detail?id=1514939124");
                            intent.setData(uri);

                            startActivity(intent);
                        }else if (title.equals("카사코로나")){
                            Intent intent= new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri= Uri.parse("https://store.naver.com/restaurants/detail?entry=plt&id=1343118509&query=%EC%B9%B4%EC%82%AC%20%EC%BD%94%EB%A1%9C%EB%82%98");
                            intent.setData(uri);
                        }

                    }
                });





            }
        });

    }
}

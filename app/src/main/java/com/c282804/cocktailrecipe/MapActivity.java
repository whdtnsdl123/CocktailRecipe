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
import com.google.android.gms.maps.UiSettings;
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
        getSupportActionBar().setTitle("Hot Place");

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

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bush,13));

                LatLng corona = new LatLng(37.5340433,126.992328);


                MarkerOptions markerOptions1 = new MarkerOptions();
                markerOptions1.position(corona);
                markerOptions1.title("카사코로나");
                markerOptions1.snippet("라운지 바");
                markerOptions1.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));

                GMap.addMarker(markerOptions1);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(corona,13));


                LatLng decoy = new LatLng(37.5345026,126.9976321);

                MarkerOptions markerOptions2 = new MarkerOptions();
                markerOptions2.position(decoy);
                markerOptions2.title("디코이");
                markerOptions2.snippet("클럽");
                markerOptions2.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));


                GMap.addMarker(markerOptions2);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(decoy,13));


                LatLng owl = new LatLng( 37.5349274,126.9925628);

                MarkerOptions markerOptions3 = new MarkerOptions();
                markerOptions3.position(owl);
                markerOptions3.title("아울");
                markerOptions3.snippet("클럽");
                markerOptions3.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));


                GMap.addMarker(markerOptions3);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(owl,13));

                LatLng sinkhole = new LatLng( 37.551541,126.9196622);

                MarkerOptions markerOptions4 = new MarkerOptions();
                markerOptions4.position(sinkhole);
                markerOptions4.title("싱크홀");
                markerOptions4.snippet("라운지바");
                markerOptions4.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));


                GMap.addMarker(markerOptions4);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sinkhole,13));

                LatLng saltcoke = new LatLng( 37.5407494,127.0684089);

                MarkerOptions markerOptions5 = new MarkerOptions();
                markerOptions5.position(saltcoke);
                markerOptions5.title("솔트코크&1675");
                markerOptions5.snippet("라운지&클럽");
                markerOptions5.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));


                GMap.addMarker(markerOptions5);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(saltcoke,13));

                LatLng underground = new LatLng( 37.5488221,126.9204434);

                MarkerOptions markerOptions6 = new MarkerOptions();
                markerOptions6.position(underground);
                markerOptions6.title("언더그라운드");
                markerOptions6.snippet("라운지바");
                markerOptions6.icon(BitmapDescriptorFactory.fromResource(R.drawable.button_blue));


                GMap.addMarker(markerOptions6);

                GMap.animateCamera(CameraUpdateFactory.newLatLngZoom(underground,13));





                //지도의 정보창을 클릭했을때 반응하기
                GMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        String title = marker.getTitle();

                        if (title.equals("부쉬윅")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://store.naver.com/restaurants/detail?id=1514939124");
                            intent.setData(uri);

                            startActivity(intent);
                        } else if (title.equals("카사코로나")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://store.naver.com/restaurants/detail?entry=plt&id=1343118509&query=%EC%B9%B4%EC%82%AC%20%EC%BD%94%EB%A1%9C%EB%82%98");
                            intent.setData(uri);

                            startActivity(intent);
                        } else if (title.equals("디코이")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://decoyloung.modoo.at/");
                            intent.setData(uri);

                            startActivity(intent);
                        } else if (title.equals("아울")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://www.facebook.com/%EC%9D%B4%ED%83%9C%EC%9B%90-%EC%95%84%EC%9A%B8%EB%9D%BC%EC%9A%B4%EC%A7%80-Owl-Lounge-Itaewon-512845245898425");
                            intent.setData(uri);

                            startActivity(intent);
                        }else if (title.equals("싱크홀")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://map.naver.com/v5/entry/place/1483190827?c=14128794.6802027,4516176.1181515,17,0,0,0,dh");
                            intent.setData(uri);

                            startActivity(intent);
                        }else if (title.equals("솔트코크&1675")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://store.naver.com/restaurants/detail?id=20030529");
                            intent.setData(uri);

                            startActivity(intent);
                        }else if (title.equals("언더그라운드")) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            Uri uri = Uri.parse("https://store.naver.com/restaurants/detail?entry=plt&id=37161958&query=%EC%96%B8%EB%8D%94%EA%B7%B8%EB%9D%BC%EC%9A%B4%EB%93%9C");
                            intent.setData(uri);

                            startActivity(intent);


                        }



                    }


                });


                IconAdapter adapter= new IconAdapter(MapActivity.this);
                GMap.setInfoWindowAdapter(adapter);

                UiSettings settings= GMap.getUiSettings();
                settings.setZoomControlsEnabled(true);




            }





        });
    }
}


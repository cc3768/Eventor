package com.example.ds121.eventor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ds121.eventor.R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, "pk.eyJ1IjoiY2MzNzY4IiwiYSI6ImNqNHZ0ZDl6MDB6cHkycWswcnJjY3dpcHMifQ.Y2R7kGySeKCIxyE-_YCeLg");
        //setContentView(R.layout.starting);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
    }

    //functions
    public map(){

    }
    //-----------------All Button----------------------------
    public void fsignin(View v){
        setContentView(R.layout.signin);
    }
    public void fsignup(View v){
        setContentView(R.layout.signup);
    }
    public void FSUNextPage(View v) {setContentView(R.layout.activity_layout);}
    public void FSINextPage(View v) {setContentView(R.layout.activity_layout);}
    //-------------------Micro Button-------------------------
    @Override
    public void onStart() {
        super.onStart();
        setContentView(R.layout.starting);
        //mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        //mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        //mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        //mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        //mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //mapView.onSaveInstanceState(outState);
    }
}
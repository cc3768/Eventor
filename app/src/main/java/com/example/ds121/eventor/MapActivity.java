package com.example.ds121.eventor;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ds121.eventor.util.LocationServices;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;

/**
 * Created by Alexander on 7/10/2017.
 */

public class MapActivity extends AppCompatActivity {
    private MapView mapView;
    private boolean hasPerms;
    LocationListener locationListener = new LocationServices();
    Criteria criteria = new Criteria();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LocationManager locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);
        final Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            hasPerms = false;
            //return;
        }else {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, locationListener);
            hasPerms = true;
        }
        Mapbox.getInstance(getApplicationContext(), "pk.eyJ1IjoiZmFuZ3NoYWRvdyIsImEiOiJjajR2d3pkNW4weXpvMzNucmRpd2NyNDRuIn0.rozqsxOiJL6SNaXK4K5i3A");
        setContentView(R.layout.activity_layout);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                if(location != null){
                    Log.d("LOCATION","Latitude: "+ location.getLatitude() + " Longitude: " + location.getLongitude());
                    if(hasPerms) {
                        CameraPosition pos = new CameraPosition.Builder()
                            .target(new LatLng(location.getLatitude(), location.getLongitude()))
                            .build();
                        mapboxMap.setCameraPosition(pos);
                    }
                }
                Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.mappin);
                mapboxMap.addImage("mappin", icon);

                SymbolLayer symbolLayer = new SymbolLayer("layer-id", "source-id");
                symbolLayer.setProperties(
                        PropertyFactory.iconImage("mappin")
                );

                mapboxMap.addLayer(symbolLayer);
            }
        });
    }

}

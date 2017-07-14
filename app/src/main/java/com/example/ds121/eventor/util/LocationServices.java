package com.example.ds121.eventor.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

import com.example.ds121.eventor.MapActivity;

/**
 * Created by Alexander on 7/10/2017.
 */

public class LocationServices implements LocationListener {


    @Override
    public void onLocationChanged(Location loc){
        Log.d("LOCATION","LocServ Latitude: "+loc.getLatitude()+ " Longitude: " +loc.getLongitude());
    }

    @Override
    public void onProviderDisabled(String provider) {}

    @Override
    public void onProviderEnabled(String provider) {}

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}

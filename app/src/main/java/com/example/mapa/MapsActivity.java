package com.example.mapa;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng loc1 = new LatLng(40, -3);
        mMap.addMarker(new MarkerOptions().position(loc1).title("Madrid, España"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc1));

        LatLng loc2 = new LatLng(40, -74);
        mMap.addMarker(new MarkerOptions().position(loc2).title("New York, Estados Unidos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc2));

        LatLng loc3 = new LatLng(-35, 149);
        mMap.addMarker(new MarkerOptions().position(loc3).title("Camberra, Australia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc3));

        LatLng loc4 = new LatLng(-34, -58);
        mMap.addMarker(new MarkerOptions().position(loc4).title("Buenos Aires, Argentina"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc4));
    }
}

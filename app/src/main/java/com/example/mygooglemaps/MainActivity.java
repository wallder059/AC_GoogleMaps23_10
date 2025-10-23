package com.example.mygooglemaps;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        //esto dice que lo vamos a hacer asicronica por eso se usa el callback
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap=googleMap;
        LatLng santaCruz=new LatLng(-17.345692, -63.246626);
        //myMap.addMarker(new MarkerOptions().position(santaCruz).title("Santa Cruz Elay"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(santaCruz));
        MarkerOptions options = new MarkerOptions().position(santaCruz).title("Mi Casa").snippet("Santa Cruz, Bolivia - Mi hogar");
        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(options);

        // familia Almanza tía
        LatLng familiaAlmanza = new LatLng(-17.346832, -63.391464);
        MarkerOptions almanzaOptions = new MarkerOptions().position(familiaAlmanza).title("Familia Almanza - Tía").snippet("Familia materna - Santa Cruz");
        almanzaOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(almanzaOptions);

        // familia Guzmán abuelo
        LatLng familiaGuzman = new LatLng(-17.009756, -63.233895);
        MarkerOptions guzmanOptions = new MarkerOptions().position(familiaGuzman).title("Familia Guzmán - Abuelo").snippet("Familia paterna - Santa Cruz");
        guzmanOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        myMap.addMarker(guzmanOptions);

        // hermano Wilmer
        LatLng hermanoWilmer = new LatLng(-17.336272329903196, -63.26324270349139);
        MarkerOptions wilmerOptions = new MarkerOptions().position(hermanoWilmer).title("Hermano Wilmer").snippet("Hermano - Santa Cruz");
        wilmerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        myMap.addMarker(wilmerOptions);

        // hermana Wendy
        LatLng hermanaWendy = new LatLng(-17.341766913831528, -63.24877768243336);
        MarkerOptions wendyOptions = new MarkerOptions().position(hermanaWendy).title("Hermana Wendy").snippet("Hermana - Santa Cruz");
        wendyOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        myMap.addMarker(wendyOptions);

        // casa de tía Claudia
        LatLng tiaClaudia = new LatLng(38.780121, -77.464774);
        MarkerOptions claudiaOptions = new MarkerOptions().position(tiaClaudia).title("Casa de Tía Claudia").snippet("Ubicación en Estados Unidos");
        claudiaOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        myMap.addMarker(claudiaOptions);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }


}
package com.sj.ecodrive;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import com.sj.ecodrive.databinding.FragmentMapBinding;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private FragmentMapBinding binding;
    private GoogleMap mMap;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMapBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
//        StyleSpan styleSpan = new StyleSpan(Color.GREEN);

        Polyline line = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(59.377873,13.500385), new LatLng(59.377898,13.505200), new LatLng(59.379470, 13.511875),new LatLng(59.381346, 13.516273), new LatLng(59.383612, 13.521602), new LatLng(59.386810, 13.527454))
                .addSpan(new StyleSpan(Color.GREEN)));

        // Add a marker in Karlstad central and move the camera
        LatLng karlstadCentral = new LatLng(59.377873, 13.500385);
        mMap.addMarker(new MarkerOptions()
                .position(karlstadCentral)
                .title("karlstad central"));


        LatLng trainLocation = new LatLng(59.386810, 13.527454);
        mMap.addMarker(new MarkerOptions()
                .position(trainLocation)
                .title("533"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(trainLocation, 14.0f));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
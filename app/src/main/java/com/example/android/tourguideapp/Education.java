package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Education extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.kar), R.drawable.university, getString(R.string.about_uni)));
        places.add(new Place(getResources().getString(R.string.agri), R.drawable.agri, getString(R.string.about_agri)));
        places.add(new Place(getResources().getString(R.string.sdmm), R.drawable.sdmm, getString(R.string.about_sdmm)));
        places.add(new Place(getResources().getString(R.string.sdme), R.drawable.sdme, getString(R.string.about_sdme)));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

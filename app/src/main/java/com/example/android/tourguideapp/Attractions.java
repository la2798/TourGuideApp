package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Attractions extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.stemple), getString(R.string.about_stemple)));
        places.add(new Place(getResources().getString(R.string.kelgeri), getString(R.string.about_kelgeri)));
        places.add(new Place(getResources().getString(R.string.ulavi), getString(R.string.about_ulavi)));
        places.add(new Place(getResources().getString(R.string.sadankeri), getString(R.string.about_sadankeri)));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

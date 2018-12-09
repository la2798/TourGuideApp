package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.girmit), R.drawable.girmit, getString(R.string.about_girmit)));
        places.add(new Place(getResources().getString(R.string.pedha), R.drawable.pedha, getString(R.string.about_pedha)));
        places.add(new Place(getResources().getString(R.string.rotti), R.drawable.rotti, getString(R.string.about_rotti)));
        places.add(new Place(getResources().getString(R.string.avalakki), R.drawable.avalakki, getString(R.string.about_avalakki)));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

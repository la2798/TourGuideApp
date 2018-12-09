package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Place currrentPlace = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currrentPlace.getmNameOfPlace());
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
        infoTextView.setText(currrentPlace.getmInfo());
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currrentPlace.getmImageId());
        return listItemView;
    }
}

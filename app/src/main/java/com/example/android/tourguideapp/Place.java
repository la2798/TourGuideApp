package com.example.android.tourguideapp;

public class Place {

    private String mNameOfPlace;
    private String mInfo;
    private int mImageId;

    public Place(String nameOfPlace, int imageId, String info) {
        mNameOfPlace = nameOfPlace;
        mImageId = imageId;
        mInfo = info;
    }

    public Place(String nameOfPlace, String info) {
        mNameOfPlace = nameOfPlace;
        mInfo = info;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmNameOfPlace() {
        return mNameOfPlace;
    }

    public String getmInfo() {
        return mInfo;
    }
}

package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Attractions();
        } else if (position == 1) {
            return new Education();
        } else {
            return new Food();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attractions_category);
        } else if (position == 1) {
            return mContext.getString(R.string.education_category);
        } else {
            return mContext.getString(R.string.food_category);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

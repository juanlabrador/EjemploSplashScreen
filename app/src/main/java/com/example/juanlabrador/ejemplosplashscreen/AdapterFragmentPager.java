package com.example.juanlabrador.ejemplosplashscreen;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanlabrador on 05/10/14.
 */
public class AdapterFragmentPager extends FragmentPagerAdapter {

    List<Fragment> fragments;
    private Context context;

    public AdapterFragmentPager(FragmentManager fm, Context context) {
        super(fm);
        this.fragments = new ArrayList<Fragment>();
        this.context = context;
    }

    public void addFragment(Fragment fragment) {
        this.fragments.add(fragment);
    }
    @Override
    public Fragment getItem(int i) {
        return this.fragments.get(i);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}

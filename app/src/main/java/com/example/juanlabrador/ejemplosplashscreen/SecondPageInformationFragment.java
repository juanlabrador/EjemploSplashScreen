package com.example.juanlabrador.ejemplosplashscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondPageInformationFragment extends Fragment {

    public static SecondPageInformationFragment newInstance() {
        SecondPageInformationFragment activity = new SecondPageInformationFragment();
        activity.setRetainInstance(true);
        return activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.second_page_information, container, false);
    }
}

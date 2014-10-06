package com.example.juanlabrador.ejemplosplashscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class SplashScreenFragment extends Fragment {

    private static long SPLASHDELAY = 3000;
    ImageView logo;
    TextView introduction;
    Animation animation;

    private boolean status = false;

    public static SplashScreenFragment newInstance() {
        SplashScreenFragment activity = new SplashScreenFragment();
        activity.setRetainInstance(true);
        return activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.splash_screen, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(status == false) {
            startAnimationLogo();
            startAnimationText();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {

                }
            };

            Timer timer = new Timer();
            timer.schedule(task, SPLASHDELAY);
            status = true;
        }
    }

    private void startAnimationLogo() {
        logo = (ImageView) getView().findViewById(R.id.logo);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_logo);
        logo.startAnimation(animation);
    }

    private void startAnimationText() {
        introduction = (TextView) getView().findViewById(R.id.introduction);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_text);
        introduction.startAnimation(animation);
    }
}

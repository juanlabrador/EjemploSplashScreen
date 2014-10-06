package com.example.juanlabrador.ejemplosplashscreen;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

/**
 * Created by juanlabrador on 05/10/14.
 */
public class MainActivity extends FragmentActivity {

    private ViewPager pager;
    private AdapterFragmentPager fragmentPager;
    private CirclePageIndicator pageIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pager = (ViewPager) this.findViewById(R.id.viewPager);

        fragmentPager = new AdapterFragmentPager(getSupportFragmentManager(), this);
        fragmentPager.addFragment(SplashScreenFragment.newInstance());
        fragmentPager.addFragment(FirstPageInformationFragment.newInstance());
        fragmentPager.addFragment(SecondPageInformationFragment.newInstance());
        fragmentPager.addFragment(ThirdPageInformationFragment.newInstance());
        this.pager.setAdapter(fragmentPager);

        pageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        pageIndicator.setViewPager(pager);
        pageIndicator.setSnap(true);
        pageIndicator.setFillColor(Color.BLUE);
        pageIndicator.setPageColor(Color.GRAY);
        pageIndicator.setStrokeColor(Color.TRANSPARENT);
    }

    @Override
    public void onBackPressed() {
        if(this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);
    }
}

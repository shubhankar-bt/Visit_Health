package com.shubhankaranku.visit_health;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import androidx.annotation.NonNull;


public class MyAdapter extends FragmentPagerAdapter {
    private final int totalTabs;

    public MyAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new WeeklyFragment();
        }
        return new MonthlyFragment();

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

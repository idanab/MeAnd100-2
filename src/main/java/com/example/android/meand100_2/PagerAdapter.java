package com.example.android.meand100_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SettingFragment settingsFragment = new SettingFragment();
                return settingsFragment;
            case 1:
                ReportFragment reportFragment = new ReportFragment();
                return reportFragment;
            case 2:
                NewsFragment newsFragment = new NewsFragment();
                return newsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
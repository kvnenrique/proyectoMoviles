package com.example.proyectomoviles.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.proyectomoviles.R;
import com.example.proyectomoviles.fragments.FragBebidasACTInsertar;
import com.example.proyectomoviles.fragments.FragQuesadillasACTInsertar;
import com.example.proyectomoviles.fragments.FragTacosACTInsertar;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new FragTacosACTInsertar();
                break;
            case 1:
                fragment = new FragQuesadillasACTInsertar();
                break;
            case 2:
                fragment = new FragBebidasACTInsertar();
                break;
        }
        return fragment;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "TACOS";
            case 1:
                return "QUESADILLAS";
            case 2:
                return "BEBIDAS";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}
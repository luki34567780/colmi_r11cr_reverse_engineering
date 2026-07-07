package com.qcwireless.qcwatch.ui.mine.ucenter.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class TabPageAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    private java.util.List<androidx.fragment.app.Fragment> fragments;

    public TabPageAdapter(androidx.fragment.app.FragmentManager fm, java.util.List<androidx.fragment.app.Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public androidx.fragment.app.Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    public int getCount() {
        return this.fragments.size();
    }
}

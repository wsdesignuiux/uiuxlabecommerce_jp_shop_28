package e.wolfsoft1.uiuxlabecommerce_jp_shop_28.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop_28.fragment.Fragmemt_Viewpager_shop28;


public class Pants_ViewpagerAdapter_Shop28 extends FragmentPagerAdapter {
    public Pants_ViewpagerAdapter_Shop28(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragmemt_Viewpager_shop28();
                break;
            case 1:

                fragment = new Fragmemt_Viewpager_shop28();
                break;
            case 2:

                fragment = new Fragmemt_Viewpager_shop28();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

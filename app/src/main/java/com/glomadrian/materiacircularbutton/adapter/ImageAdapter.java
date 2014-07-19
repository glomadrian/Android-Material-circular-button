package com.glomadrian.materiacircularbutton.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.glomadrian.materiacircularbutton.fragment.ImageFragment;

import java.util.HashMap;
import java.util.List;

/**
 * @author Adrián Lomas
 */
public class ImageAdapter extends FragmentStatePagerAdapter {

    List<Integer> imageResources;
    HashMap<Integer,ImageFragment> fragmentHashMap;


    public ImageAdapter(FragmentManager fm, List<Integer> imageResources) {
        super(fm);
        this.imageResources = imageResources;
        fragmentHashMap = new HashMap<Integer, ImageFragment>();
    }

    public List<Integer> getImageResources() {
        return imageResources;
    }

    public void setImageResources(List<Integer> imageResources) {
        this.imageResources = imageResources;
    }

    @Override
    public Fragment getItem(int position) {
        ImageFragment imageFragment = ImageFragment.newInstance(imageResources.get(position));
        fragmentHashMap.put(position,imageFragment);
        return imageFragment;
    }

    @Override
    public int getCount() {
       return imageResources.size();
    }

    public ImageFragment getFragment(int posicion){
        return fragmentHashMap.get(posicion);
    }
}

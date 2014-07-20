package com.glomadrian.materiacircularbutton;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.graphics.Palette;

import com.glomadrian.button.MaterialButton;
import com.glomadrian.materiacircularbutton.adapter.ImageAdapter;
import com.glomadrian.materiacircularbutton.fragment.ImageFragment;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends FragmentActivity {

    private MaterialButton materialButton;
    private ImageAdapter mImageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        materialButton = (MaterialButton) findViewById(R.id.materialButton);
        mViewPager = (ViewPager) findViewById(R.id.pager);

        //Create images array
        List<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.image_1);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);
        images.add(R.drawable.image_5);

        //Create adapter
        mImageAdapter = new ImageAdapter(getSupportFragmentManager(),images);

        //Set adapter
        mViewPager.setAdapter(mImageAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {






            }

            @Override
            public void onPageSelected(int position) {
                ImageFragment page = mImageAdapter.getFragment(position);
                if(page!=null){
                    Palette palette = page.getPaleette();
                    materialButton.changueColorAnimate(palette.getVibrantColor().getRgb());
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



}

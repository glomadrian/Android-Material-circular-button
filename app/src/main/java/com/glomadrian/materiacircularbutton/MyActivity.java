package com.glomadrian.materiacircularbutton;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.graphics.Palette;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.glomadrian.button.CircleButton;
import com.glomadrian.materiacircularbutton.adapter.ImageAdapter;
import com.glomadrian.materiacircularbutton.fragment.ImageFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyActivity extends FragmentActivity {

    private CircleButton circleButton;
    private ImageAdapter mImageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        circleButton = (CircleButton) findViewById(R.id.materialButton);
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
                Palette palette = page.getPaleette();
                circleButton.changueColorAnimate(palette.getVibrantColor().getRgb());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.glomadrian.materiacircularbutton.fragment;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.glomadrian.materiacircularbutton.R;

/**
 * @author Adrián Lomas
 */
public class ImageFragment  extends android.support.v4.app.Fragment{

    private ImageView imageView;
    private Integer imageResource;

    public ImageFragment() {
    }

    public ImageFragment(Integer imageResource) {
        this.imageResource = imageResource;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View imageFragmentView = inflater.inflate(R.layout.fragment_image, container, false);
        imageView = (ImageView) imageFragmentView.findViewById(R.id.imageView);

        imageView.setImageResource(imageResource);

        return  imageFragmentView;

    }

        public Palette getPaleette(){
        return Palette.generate(((BitmapDrawable) imageView.getDrawable()).getBitmap());
        }
}

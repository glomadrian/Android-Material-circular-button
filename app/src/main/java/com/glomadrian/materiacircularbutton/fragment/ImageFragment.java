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


    public static  ImageFragment newInstance(Integer imageResource){

        ImageFragment imageFragment = new ImageFragment();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putInt("imageResource", imageResource);
        imageFragment.setArguments(args);

        return imageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageResource = getArguments() != null ? getArguments().getInt("imageResource") : 0;
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

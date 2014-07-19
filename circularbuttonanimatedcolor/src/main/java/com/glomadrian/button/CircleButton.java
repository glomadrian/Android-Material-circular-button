package com.glomadrian.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.glomadrian.R;
import com.glomadrian.drawable.CircularButtonDrawable;


/**
 * @author Adrián Lomas
 */
public class CircleButton extends ImageButton{

    private CircularButtonDrawable circularButtonDrawable;

     public CircleButton(Context context) {
        super(context);
    }

    public CircleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public CircleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }


    public void init(Context context,AttributeSet attributeSet){

        int transitionTime = 0;
        int color = Color.BLACK;


          TypedArray arr = context.obtainStyledAttributes(attributeSet, R.styleable.CircleButton);
        CharSequence colorAtr = arr.getString(R.styleable.CircleButton_color);
        if (colorAtr != null) {
            color = Color.parseColor(String.valueOf(colorAtr));
        }

        Integer transitionTimeAttr = arr.getInteger(R.styleable.CircleButton_transitionTime, 0);
        if (transitionTimeAttr != null) {
            transitionTime = transitionTimeAttr;
        }

        arr.recycle();

        //Crate background drawable and set color
        circularButtonDrawable = new CircularButtonDrawable(color);
        circularButtonDrawable.setTransitionTime(transitionTime);
        this.setBackground(circularButtonDrawable);


    }


    public void changueColorAnimate(int color){
        circularButtonDrawable.animatedChangueColor(color);
    }

}

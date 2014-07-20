package com.glomadrian.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.glomadrian.R;
import com.glomadrian.drawable.MaterialButtonDrawable;


/**
 * @author Adrián Lomas
 */
public class MaterialButton extends ImageButton{

    private MaterialButtonDrawable materialButtonDrawable;

     public MaterialButton(Context context) {
        super(context);
    }

    public MaterialButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public MaterialButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }


    public void init(Context context,AttributeSet attributeSet){

        int transitionTime = 0;
        int color = Color.BLACK;


          TypedArray arr = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialButton);
        CharSequence colorAtr = arr.getString(R.styleable.MaterialButton_color);
        if (colorAtr != null) {
            color = Color.parseColor(String.valueOf(colorAtr));
        }

        Integer transitionTimeAttr = arr.getInteger(R.styleable.MaterialButton_transitionTime, 0);
        if (transitionTimeAttr != null) {
            transitionTime = transitionTimeAttr;
        }

        arr.recycle();

        //Crate background drawable and set color
        materialButtonDrawable = new MaterialButtonDrawable(color);
        materialButtonDrawable.setTransitionTime(transitionTime);
        this.setBackground(materialButtonDrawable);


    }


    public void changueColorAnimate(int color){
        materialButtonDrawable.animatedChangueColor(color);
    }

}

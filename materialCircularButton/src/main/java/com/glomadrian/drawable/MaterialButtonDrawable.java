package com.glomadrian.drawable;


import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * @author Adrián Lomas
 */
public class MaterialButtonDrawable extends ShapeDrawable{

    private Paint paint;
    private Integer transitionTime = 0;

    public MaterialButtonDrawable(int color) {


        this.paint = new Paint();
        this.paint.setColor(color);
        this.setShape(new OvalShape());


    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2,canvas.getHeight()/2,paint);
    }


    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }



    public void animatedChangueColor(int color){

        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), paint.getColor(), color);
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        paint.setColor((Integer)animator.getAnimatedValue());
                        invalidateSelf();
                    }

                });

                if(transitionTime!=0){
                    colorAnimation.setDuration(transitionTime);
                }
                colorAnimation.start();
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Integer getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(Integer transitionTime) {
        this.transitionTime = transitionTime;
    }
}

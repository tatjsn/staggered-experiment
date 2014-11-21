package com.example.tat.gridapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyCard extends TextView {
    public MyCard(Context context) {
        super(context);
    }

    public MyCard(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams lp = getLayoutParams();
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(
                lp.height, MeasureSpec.EXACTLY));
    }
}

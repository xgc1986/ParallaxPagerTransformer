package com.xgc1986.parallaxpagerlibrary;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ParallaxTransformer implements ViewPager.PageTransformer {

    private int id;

    public ParallaxTransformer(int id) {
        this.id = id;
    }

    @Override
    public void transformPage(View view, float position) {

        ViewGroup root = (ViewGroup)((FrameLayout) view).getChildAt(0);
        View parallaxView = root.findViewById(id);

        if (position >= -1 && position <= 1) {
            float wv = parallaxView.getWidth();
            float hv = parallaxView.getHeight();

            float wi = parallaxView.getWidth();
            float hi = parallaxView.getHeight();

            float width = wv;
            float height = hv;

            if (wi / wv > hi / hv) {
                width = wi * hv / hi;
            } else {
                height= hi * wv / wi;
            }

            parallaxView.setTranslationX(-(position * width * 0.2f) + (wv - width) / 2);
            parallaxView.setTranslationY((hv - height) / 2);
        }
    }
}
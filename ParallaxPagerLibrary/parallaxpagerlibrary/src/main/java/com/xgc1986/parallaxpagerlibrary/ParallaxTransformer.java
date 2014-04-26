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

        View parallaxView = view.findViewById(id);

        if (position >= -1 && position <= 1) {
            float width = parallaxView.getWidth();
            parallaxView.setTranslationX(-(position * width * 0.2f));
        }
    }
}
package com.xgc1986.parallaxPagerTransformer;

import android.os.Build;
import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ParallaxPagerTransformer implements ViewPager.PageTransformer {
    private int mBorder;
    private List<ParallaxItem> mItems;

    public ParallaxPagerTransformer(List<ParallaxItem> items) {
        mItems = items;
    }

    @Override
    public void transformPage(View view, float position) {
        for (ParallaxItem item : mItems) {
            parallax(item, view, position);
        }
    }

    private void parallax(ParallaxItem item, View view, float position) {
        View parallaxView = view.findViewById(item.getId());

        if (parallaxView == null) {
            return;
        }

        if (position > -1 && position < 1) {
            float width = parallaxView.getWidth();
            float speed = item.getSpeed();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                if (view.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL) {
                    speed = speed * -1;
                }
            }

            parallaxView.setTranslationX(-(position * width * speed));
            float sc = ((float) view.getWidth() - mBorder) / view.getWidth();
            if (position == 0) {
                view.setScaleX(1);
                view.setScaleY(1);
            } else {
                view.setScaleX(sc);
                view.setScaleY(sc);
            }
        }
    }

    public void setBorder(int border) {
        mBorder = border;
    }

    public static class Builder {
        private int border;
        List<ParallaxItem> items;

        public Builder() {
            items = new ArrayList<>();
        }

        public Builder addItem(ParallaxItem item) {
            items.add(item);
            return this;
        }

        public Builder addItem(@IdRes int id, float speed) {
            items.add(new ParallaxItem(id, speed));
            return this;
        }

        public Builder border(int border) {
            this.border = border;
            return this;
        }

        public ParallaxPagerTransformer build() {
            ParallaxPagerTransformer pt = new ParallaxPagerTransformer(items);
            pt.setBorder(border);
            return pt;
        }
    }
}
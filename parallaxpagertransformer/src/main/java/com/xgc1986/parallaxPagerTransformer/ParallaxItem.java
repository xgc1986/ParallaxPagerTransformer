package com.xgc1986.parallaxPagerTransformer;

import android.support.annotation.IdRes;

/**
 * Created by Alireza Afkar on 04/07/16.
 */
public class ParallaxItem {
    private @IdRes int id;
    private float speed = 0.2f;

    public ParallaxItem(@IdRes int id) {
        this.id = id;
    }

    public ParallaxItem(@IdRes int id, float speed) {
        this.id = id;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(@IdRes int id) {
        this.id = id;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}

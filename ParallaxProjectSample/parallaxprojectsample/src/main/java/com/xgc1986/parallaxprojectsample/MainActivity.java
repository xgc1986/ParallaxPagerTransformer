package com.xgc1986.parallaxprojectsample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.xgc1986.parallaxPagerTransformer.ParallaxPagerTransformer;

public class MainActivity extends FragmentActivity {

    ViewPager mPager;
    CatsAdapter mAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        getActionBar().hide();

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setBackgroundColor(0xFF000000);

        ParallaxPagerTransformer pt = new ParallaxPagerTransformer((R.id.image));
        pt.setBorder(20);
        //pt.setSpeed(0.2f);
        mPager.setPageTransformer(false, pt);

        mAdapter = new CatsAdapter(this, getSupportFragmentManager());
        mAdapter.setPager(mPager);

        Bundle bNina = new Bundle();
        bNina.putInt("image", R.drawable.nina);
        bNina.putString("name", "Nina");
        ParallaxFragment pfNina = new ParallaxFragment();
        pfNina.setArguments(bNina);

        Bundle bNiju = new Bundle();
        bNiju.putInt("image", R.drawable.niju);
        bNiju.putString("name", "Ninu Junior");
        ParallaxFragment pfNiju = new ParallaxFragment();
        pfNiju.setArguments(bNiju);

        Bundle bYuki = new Bundle();
        bYuki.putInt("image", R.drawable.yuki);
        bYuki.putString("name", "Yuki");
        ParallaxFragment pfYuki = new ParallaxFragment();
        pfYuki.setArguments(bYuki);

        Bundle bKero = new Bundle();
        bKero.putInt("image", R.drawable.kero);
        bKero.putString("name", "Kero");
        ParallaxFragment pfKero = new ParallaxFragment();
        pfKero.setArguments(bKero);

        mAdapter.add(pfNina);
        mAdapter.add(pfNiju);
        mAdapter.add(pfYuki);
        mAdapter.add(pfKero);
        mPager.setAdapter(mAdapter);
    }
}

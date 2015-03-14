package com.xgc1986.parallaxpagersample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.xgc1986.parallaxPagerTransformer.ParallaxPagerTransformer;

public class MainActivity extends FragmentActivity {

    ViewPager mPager;
    DemoParallaxAdapter mAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_activity_parallax);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setBackgroundColor(0xFF000000);

        ParallaxPagerTransformer pt = new ParallaxPagerTransformer((R.id.image));
        pt.setBorder(20);
        //pt.setSpeed(0.2f);
        mPager.setPageTransformer(false, pt);

        mAdapter = new DemoParallaxAdapter(getSupportFragmentManager());
        mAdapter.setPager(mPager); //only for this transformer

        Bundle bNina = new Bundle();
        bNina.putInt("image", R.mipmap.bg_nina);
        bNina.putString("name", "Nina");
        DemoParallaxFragment pfNina = new DemoParallaxFragment();
        pfNina.setArguments(bNina);

        Bundle bNiju = new Bundle();
        bNiju.putInt("image", R.mipmap.bg_niju);
        bNiju.putString("name", "Ninu Junior");
        DemoParallaxFragment pfNiju = new DemoParallaxFragment();
        pfNiju.setArguments(bNiju);

        Bundle bYuki = new Bundle();
        bYuki.putInt("image", R.mipmap.bg_yuki);
        bYuki.putString("name", "Yuki");
        DemoParallaxFragment pfYuki = new DemoParallaxFragment();
        pfYuki.setArguments(bYuki);

        Bundle bKero = new Bundle();
        bKero.putInt("image", R.mipmap.bg_kero);
        bKero.putString("name", "Kero");
        DemoParallaxFragment pfKero = new DemoParallaxFragment();
        pfKero.setArguments(bKero);

        mAdapter.add(pfNina);
        mAdapter.add(pfNiju);
        mAdapter.add(pfYuki);
        mAdapter.add(pfKero);
        mPager.setAdapter(mAdapter);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();

        return super.onOptionsItemSelected(item);
    }
}

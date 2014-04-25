# ParallaxPagerLibrary

A pager for Android with parallax effect

## Usage

You only have to pass to the ParallaxTransformer the id of the element you want have the parallax effect

```java

	/** other imports **/
	import com.xgc1986.parallaxpagerlibrary.ParallaxTransformer;
	
	public class MainActivity extends Activity {

		ViewPager mPager;
    	FragmentStatePagerAdapter mAdapter;

		public void onCreate(Bundle savedInstanceState) {
			/** ... **/

			mPager = (ViewPager) findViewById(R.id.pager);
        	mPager.setBackgroundColor(0xFF000000);

        	// creating the parallaxTransformer, you only need to pass the id of the View (or ViewGroup) you want to do the parallax effect
        	mPager.setPageTransformer(false, new ParallaxTransformer(R.id.parallaxContent));
        	mAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager());
        	mAdapter.setPager(mPager);

        	/** ... **/
		}
	}

```

And that's all, you can see in action <a href="https://www.youtube.com/watch?v=5zEOUWY9Hvo">Here</a>

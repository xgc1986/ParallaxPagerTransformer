# ParallaxPagerTransformer

A pager transformer for Android with parallax effect

## Installation

in your build.gradle file


    repositories {
        maven { url "https://oss.sonatype.org/content/repositories/snapshots/" }
        mavenCentral()
    }

    dependencies {
        // ...
        compile 'com.xgc1986.ParallaxBackgroundViewPager:library:0.1-SNAPSHOT'
    }



## Usage

minSdkVersion 11

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

        	// creating the parallaxTransformer, you only need to pass the id of the View (or ViewGroup) you want to do the parallax effect
        	mPager.setPageTransformer(false, new ParallaxTransformer(R.id.parallaxContent));
        	mAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager());
        	mAdapter.setPager(mPager);

        	/** ... **/
		}
	}

```

And that's all, you can see in action <a href="https://www.youtube.com/watch?v=5zEOUWY9Hvo" target="_blank">Here</a>

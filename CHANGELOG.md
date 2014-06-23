Change Log
===============================================================================

(0.2-SNAPSHOT) *(2014-07-23)* 
--------------
 * Replace package parallaxpagerlibrary to parallaxpagertransformer
 * Added method setSpeed(float) (default = 0.2f). This change the speed of the effect during the transition between two pages
 * Deleted hardcoded values on sample
 * Updated sample

(0.1-SNAPSHOT) *(2014-07-23)* 
--------------
 * [Issue #1]Change project title to ParallaxPagerTransformer (as suggested by <a href="https://github.com/tasomaniac" target="_blank">tasomaniac</a>)
 * Exported to sonatype.org
 * Delete some resources from SampleParallaxProjectSample
 * SampleParallaxProjectSample is importing the library from sonatype
 * Fix some layout issue from SampleParallaxProjectSample

*(2014-06-28)*
--------------
 * Add `void setBorder(int px)`. Sets a current border while de transition between twopages, the border's with is `px`.

```java
	/** ... **/
	
	ViewPager Pager = (ViewPager) findViewById(R.id.pager);
	ParallaxTransformer parallaxTransformer = new ParallaxTransformer(R.id.parallaxContent);
	parallaxTransformer.setBorder(3);
	mPager.setPageTransformer(false, parallaxTransformer);
	/** ... **/
```

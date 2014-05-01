Change Log
===============================================================================

*(2013-07-28)*
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
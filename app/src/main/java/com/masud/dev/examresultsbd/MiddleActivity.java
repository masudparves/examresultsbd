package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MiddleActivity extends Activity {
	private InterstitialAd interstitial;
	int data;
	int number;
	private AdView adView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser);
		
		
		
		
		adView = new AdView(this);
		adView.setAdSize(AdSize.SMART_BANNER);
		adView.setAdUnitId("ca-app-pub-9715098980887036/3322071300");

		// Add the AdView to the view hierarchy. The view will have no size
		// until the ad is loaded.
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.relative_layout);
		layout.addView(adView);

		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) adView
				.getLayoutParams();
		params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
		adView.setLayoutParams(params);

		// Create an ad request. Check logcat output for the hashed device ID to
		// get test ads on a physical device.
		AdRequest adRequest = new AdRequest.Builder()
				.addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("") // gotten
																				// from
																				// running
																				// as
																				// Debug
																				// and
																				// reading
																				// logcat
				.build();

		// Start loading the ad in the background.
		adView.loadAd(adRequest);
		
		
		
		
		
		
		
		
		 // Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-9715098980887036/4080875709");

	    // Create ad request.
	    AdRequest adRequestInt = new AdRequest.Builder().build();

	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequestInt);
		
		String strData = getIntent().getStringExtra("value");
		number = Integer.parseInt(strData);
		if (number == 2) {

			CustomizeWebview webview = (CustomizeWebview) findViewById(R.id.customize_webview);
			webview.loadUrl("http://www.educationboardresults.gov.bd/lite/index.php");
//			Toast.makeText(getApplicationContext(),
//					"If page not found, wait and press reload",
//					Toast.LENGTH_SHORT).show();
		} else {

			CustomizeWebview webview = (CustomizeWebview) findViewById(R.id.customize_webview);
			webview.loadUrl("http://archive.educationboard.gov.bd/");
//			Toast.makeText(getApplicationContext(),
//					"If page not found, wait and press reload",
//					Toast.LENGTH_SHORT).show();
		}

	}
	
	public void onPause() {
		displayInterstitial();
		
        super.onPause();
    }
	
	

private void displayInterstitial() {
	
	if (interstitial.isLoaded()) {
	      interstitial.show();
	    }
	

}
}

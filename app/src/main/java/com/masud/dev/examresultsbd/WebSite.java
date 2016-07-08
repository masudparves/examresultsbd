package com.masud.dev.examresultsbd;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSite extends Activity {
	private InterstitialAd interstitial;
	WebView myWebView;
	String myAddr;

	// String ua =
	// "Mozilla/5.0 (Android; Tablet; rv:20.0) Gecko/20.0 Firefox/20.0";
	// private AdView adView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		// Create the interstitial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-9715098980887036/7034342102");

		// Create ad request.
		AdRequest adRequestInt = new AdRequest.Builder().build();

		// Begin loading your interstitial.
		interstitial.loadAd(adRequestInt);

		myAddr = "http://dperesult.teletalk.com.bd/dpe.php";

		myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.loadUrl(myAddr);
		// myWebView.getSettings().setUserAgentString(ua);
		myWebView.getSettings().setBuiltInZoomControls(true);
		myWebView.getSettings().setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new MyWebViewClient());
		myWebView.getSettings().setUseWideViewPort(false);
		myWebView.getSettings().setLoadWithOverviewMode(false);
		// // myWebView = new WebView(this);
		// myWebView.getSettings().setUserAgentString(ua);
		// myWebView.getSettings().setBuiltInZoomControls(true);
		// myWebView.getSettings().setJavaScriptEnabled(true);
		// // myWebView.setHorizontalScrollBarEnabled(true);
		//
		// // LinearLayout layout = (LinearLayout) findViewById(R.id.linLay);
		//
		// myWebView.getSettings().setUseWideViewPort(true);
		// myWebView.getSettings().setLoadWithOverviewMode(true);
		//
		// myWebView.getSettings().setJavaScriptEnabled(true);
		// myWebView.setWebViewClient(new MyWebViewClient());
		// myWebView.loadUrl(myAddr);
		// myWebView.getSettings().setBuiltInZoomControls(true);
		// // myWebView.getSettings().setDisplayZoomControls(false);
		// setContentView(myWebView);
		// // webview.loadUrl("https://www.facebook.com");
		// Toast.makeText(getApplicationContext(), "Desktop Version",
		// Toast.LENGTH_SHORT).show();

	}

	private class MyWebViewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
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

	// @Override
	// public void onBackPressed(){
	// if(myWebView.canGoBack() == true){
	// myWebView.goBack();
	// }else{
	// finish();
	// }
	// // return true;
	// }
	//
}

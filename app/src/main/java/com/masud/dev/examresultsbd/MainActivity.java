package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

	Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Look up the AdView as a resource and load a request.
	    AdView adView = (AdView) this.findViewById(R.id.adView);
	    AdRequest adRequest = new AdRequest.Builder().build();
	    adView.loadAd(adRequest);

	}

	public void turnBack(View v) {

		startActivityForResult(new Intent(
				android.provider.Settings.ACTION_SETTINGS), 0);

	}

	public void psc(View v){

		Intent intentMobile = new Intent(MainActivity.this,
				WebSite.class);
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);

	}

	public void web1(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				MiddleActivity.class);
		intentMobile.putExtra("value", "1");
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);
	}

	public void web2(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				MiddleActivity.class);
		intentMobile.putExtra("value", "2");
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);


	}
	public void sms(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				smsActivity.class);
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);


	}

	public void rateApp(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri
				.parse("market://details?id=com.masud.dev.examresultsbd"));
		startActivity(intent);
	}

	public void aboutApp(View v) {

		new AlertDialog.Builder(this)
				.setTitle("Exam Results BD")
				.setMessage(
						"This app is developed by,\nMasud Parves\nA Pharmacist by profession, working in Sanofi Bangladesh Ltd. as Assistant Product Manager.\nContact: +8801712924952\nparves@gmail.com")
				.setInverseBackgroundForced(true)
				.setNeutralButton("Close", null).show();

	}

	public void otherApp(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("market://search?q=dev.masud"));
		startActivity(intent);

	}

	private Runnable mLaunchTask = new Runnable() {
		public void run() {
			Intent i = new Intent(MainActivity.this, MiddleActivity.class);
			startActivity(i);
			Toast.makeText(getApplicationContext(),
					"In case of WEBPAGE NOT AVAILABLE: wait & press RELOAD",
					Toast.LENGTH_LONG).show();
		}
	};

	public void collegeActivity(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				Colleges.class);
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);

	}

	public void universityActivity(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				Universities.class);
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);

	}
	public void coachingActivity(View v) {
		Intent intentMobile = new Intent(MainActivity.this,
				Coaching.class);
		intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intentMobile);

	}
//	public void facebook(View v) {
//		Intent intent = new Intent(Intent.ACTION_VIEW);
//		intent.setData(Uri
//				.parse("market://details?id=com.masud.dev.additionaddiction"));
//		startActivity(intent);
//	}
//
//	public void voice(View v) {
//		Intent intent = new Intent(Intent.ACTION_VIEW);
//		intent.setData(Uri
//				.parse("market://details?id=com.masud.dev.voicesms"));
//		startActivity(intent);
//	}



}

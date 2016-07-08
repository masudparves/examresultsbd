package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class smsActivity extends Activity implements OnItemSelectedListener {
	private InterstitialAd interstitial;
	Spinner spnYear, spnBoard, spnExam;
	private ArrayAdapter<CharSequence> adapter;
	String year, rollNumber, exam, board;
	EditText etRoll;
//	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sms_canvas);
		
		
		
		
		
		
	 // Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-9715098980887036/1127409307");

	    // Create ad request.
	    AdRequest adRequestInt = new AdRequest.Builder().build();

	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequestInt);
		
		
		
		// Look up the AdView as a resource and load a request.
	    AdView adView = (AdView) this.findViewById(R.id.adView);
	    AdRequest adRequest = new AdRequest.Builder().build();
	    adView.loadAd(adRequest);
		
	    

		etRoll = (EditText) findViewById(R.id.etRoll);
		spnYear = (Spinner) findViewById(R.id.spnYear);
		spnExam = (Spinner) findViewById(R.id.spnExam);
		spnBoard = (Spinner) findViewById(R.id.spnBoard);

		adapter = ArrayAdapter.createFromResource(this, R.array.year_list, R.layout.custom_spinner_list);
        adapter.setDropDownViewResource(R.layout.customer_spinner);
		spnYear.setOnItemSelectedListener(this);
		spnYear.setAdapter(adapter);

		adapter = ArrayAdapter.createFromResource(this, R.array.exam_list, R.layout.custom_spinner_list);
        adapter.setDropDownViewResource(R.layout.customer_spinner);
		spnExam.setOnItemSelectedListener(this);
		spnExam.setAdapter(adapter);

		adapter = ArrayAdapter.createFromResource(this, R.array.board_list, R.layout.custom_spinner_list);
        adapter.setDropDownViewResource(R.layout.customer_spinner);
		spnBoard.setOnItemSelectedListener(this);
		spnBoard.setAdapter(adapter);

	}

	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		int positionYear = spnYear.getSelectedItemPosition();
		switch (positionYear) {
		case 0:
			year = "Select Year";
			break;
		case 1:
			year = "2016";
			break;
		case 2:
			year = "2015";
			break;
		case 3:
			year = "2014";
			break;
		case 4:
			year = "2013";
			break;
		case 5:
			year = "2012";
			break;
		case 6:
			year = "2011";
			break;
		case 7:
			year = "2010";
			break;
		case 8:
			year = "2009";
			break;
		case 9:
			year = "2008";
			break;
		case 10:
			year = "2007";
			break;
		case 11:
			year = "2006";
			break;
		case 12:
			year = "2005";
			break;
		case 13:
			year = "2004";
			break;
		case 14:
			year = "2003";
			break;
		case 15:
			year = "2002";
			break;
		case 16:
			year = "2001";
			break;
			

		}
		// Toast.makeText(getApplicationContext(), year,
		// Toast.LENGTH_LONG).show();
		int positionExam = spnExam.getSelectedItemPosition();
		switch (positionExam) {
		case 0:
			exam = "Exam Name";
			break;
		case 1:
			exam = "JSC";
			break;
		case 2:
			exam = "JDC";
			break;
		case 3:
			exam = "SSC";
			break;
		case 4:
			exam = "HSC";
			break;

		}

		int positionBoard = spnBoard.getSelectedItemPosition();
		switch (positionBoard) {
		case 0:
			board = "Select Board";
			break;
		case 1:
			board = "DHA";
			break;
		case 2:
			board = "CHI";
			break;
		case 3:
			board = "BAR";
			break;
		case 4:
			board = "KHU";
			break;
		case 5:
			board = "COM";
			break;
		case 6:
			board = "DIN";
			break;
		case 7:
			board = "JES";
			break;
		case 8:
			board = "RAJ";
			break;
		case 9:
			board = "SYL";
			break;
		case 10:
			board = "TEC";
			break;
		case 11:
			board = "MAD";
			break;

		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	public void sendSMS(View v) {
		if (exam != "Exam Name") {

			if (year != "Select Year") {

				if (board != "Select Board") {
					if (etRoll.getText().toString().trim().length()>5) {
						String message = exam + " " + board + " "
								+ etRoll.getText().toString().trim() + " " + year;

						try {
							SmsManager smsManager = SmsManager.getDefault();
							smsManager.sendTextMessage("16222", null, message,
									null, null);
							Toast t= Toast.makeText(this, "Wait for the result SMS", Toast.LENGTH_LONG);
							t.show();
						} catch (Exception e) {
							Toast.makeText(getApplicationContext(),
									"SMS faild, please try again.",
									Toast.LENGTH_LONG).show();
							e.printStackTrace();
						}
						
					}else {
						new AlertDialog.Builder(this).setTitle("Exam Results BD")
						.setMessage("Provide your correct exam exam roll number")
						.setInverseBackgroundForced(true)
						.setNeutralButton("Close", null).show();

			}
					
				} else {
					new AlertDialog.Builder(this).setTitle("Exam Results BD")
							.setMessage("Provide your exam board")
							.setInverseBackgroundForced(true)
							.setNeutralButton("Close", null).show();

				}

			} else {
				new AlertDialog.Builder(this).setTitle("Exam Results BD")
						.setMessage("Provide your exam year")
						.setInverseBackgroundForced(true)
						.setNeutralButton("Close", null).show();
			}

		} else {
			new AlertDialog.Builder(this).setTitle("Exam Results BD")
					.setMessage("Provide your exam name")
					.setInverseBackgroundForced(true)
					.setNeutralButton("Close", null).show();
		}
		Intent intentMobile = new Intent(smsActivity.this,
				waitingActivity.class);
		intentMobile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intentMobile);
		
		}
		
//		public void onPause() {
//			displayInterstitial();
//			
//	        super.onPause();
//	    }
		
		@Override
		public void onBackPressed() {
			displayInterstitial();
			

		}

	private void displayInterstitial() {
		
		if (interstitial.isLoaded()) {
			
			Intent intentMobile = new Intent(smsActivity.this,
					MainActivity.class);
			intentMobile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intentMobile);
		      interstitial.show();
		      
		      
		    }
		
	}
	
	
	
//	// Invoke displayInterstitial() when you are ready to display an interstitial.
//	  public void displayInterstitial() {
//	    if (interstitial.isLoaded()) {
//	      interstitial.show();
//	    }
//	  }
}

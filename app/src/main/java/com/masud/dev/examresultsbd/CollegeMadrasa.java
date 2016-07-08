package com.masud.dev.examresultsbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CollegeMadrasa extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_madrasa);


        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void m1(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801712124566"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void m2(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88049863288"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void m3(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801952624694"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void m4(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801712891493"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void m5(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88052164719"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
//    public void d6(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88029129917"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d7(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+8801772525804"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//    public void d8(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88028610294"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d9(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88027219690"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d10(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88029000016"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d11(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88027286363"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d12(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+8801743941638"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d13(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+8801720557180"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public void d14 (View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+8801710599498"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
//    public void d15(View v) {
//        Intent callIntent = new Intent(Intent.ACTION_CALL);
//        callIntent.setData(Uri.parse("tel:+88028611354"));
//        startActivity(callIntent);
//        try {
//            startActivity(callIntent);
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
//        }
//    }
}

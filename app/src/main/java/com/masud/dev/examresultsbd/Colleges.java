package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Colleges extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }

    public void collegeDhaka(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeDhaka.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeComilla(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeComilla.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeBarisal(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeBarisal.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeCTG(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeCtg.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeDinajpur(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeDinajpur.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeJessore(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeJessore.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeRajshahi(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeRajshahi.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }

    public void collegeSylhet(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeSylhet.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);


    }

    public void collegeMadrasa(View v) {
        Intent intentMobile = new Intent(Colleges.this,
                CollegeMadrasa.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }
}
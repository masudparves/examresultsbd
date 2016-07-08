package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Universities extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universities);
    }


    public void publicUniversiy(View v) {
        Intent intentMobile = new Intent(Universities.this,
                PublicUniversity.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }



    public void privateUniversiy(View v) {
        Intent intentMobile = new Intent(Universities.this,
                PrivateUniversity.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }
    public void medicalCollege(View v) {
        Intent intentMobile = new Intent(Universities.this,
                MedicalCollege.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }
    public void engineeringUniversiy(View v) {
        Intent intentMobile = new Intent(Universities.this,
                EngineeringUniversity.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }
    public void otherInstitutes(View v) {
        Intent intentMobile = new Intent(Universities.this,
                OtherInstitute.class);
        intentMobile.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMobile);

    }
}

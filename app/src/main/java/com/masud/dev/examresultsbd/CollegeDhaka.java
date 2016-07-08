package com.masud.dev.examresultsbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CollegeDhaka extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_dhaka);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void d1(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88028912780"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d2(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801713144850"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d3(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711604323"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d4(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88028350500"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void d5(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801781910129"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void d6(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88029129917"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d7(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801772525804"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void d8(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88028610294"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d9(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88027219690"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d10(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88029000016"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d11(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88027286363"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d12(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801743941638"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d13(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801720557180"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void d14 (View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801710599498"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void d15(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88028611354"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }


 public void d16(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8802-9833306"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
 public void d17(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 1820-567023"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
 public void d18(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88 02 9023338"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
 public void d19(View v) {
     Intent callIntent = new Intent(Intent.ACTION_CALL);
     callIntent.setData(Uri.parse("tel:+880 1819-187069"));
     startActivity(callIntent);
     try {
         startActivity(callIntent);
     } catch (android.content.ActivityNotFoundException ex) {
         Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
     }
 }

public void d20(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 2-8872446"));
        startActivity(callIntent);
        try {
        startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
        Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
        }
}

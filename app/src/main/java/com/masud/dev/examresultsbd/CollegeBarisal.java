package com.masud.dev.examresultsbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CollegeBarisal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_barisal);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void b1(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801730445567"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void b2(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88043164032"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void b3(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88043164908"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void b4(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801727413069"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void b5(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801716879033"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

public void b6(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b7(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801715267510"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b8(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801718819660"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b9(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801552481621"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b10(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88+88 0431-64417"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b11(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801817452613"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b12(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel: +880 1764-849487"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b13(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b14(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801724-539362"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b15(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b16(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 1786-057369"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b17(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801820514490"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b18(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b19(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:01710788696"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void b20(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88 0431-64417"));
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

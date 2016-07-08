package com.masud.dev.examresultsbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CollegeComilla extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_comilla);


        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void c1(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801714279589"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c2(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801771737428"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c3(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88031616323"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c4(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8808165988"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void c5(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711737783"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }






public void c6(View v) {
      Intent callIntent = new Intent(Intent.ACTION_CALL);
       callIntent.setData(Uri.parse("tel:+8801711167895"));
       startActivity(callIntent);
       try {
           startActivity(callIntent);
      } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
   public void c7(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8809614016429"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
       }
    }
    public void c8(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8808161375"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c9(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8808176744"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c10(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88085157347"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
       }
    }

    public void c11(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801843989504"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
       } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c12(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88032161594"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c13(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88085163400"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void c14 (View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
       callIntent.setData(Uri.parse("tel:+8801713452920"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void c15(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801736510659"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }


public void c16(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801715577602"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }


public void c17(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711340290"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }



public void c18(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88084163374"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }


public void c19(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801915441280"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }


public void c20(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801913123520"));
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

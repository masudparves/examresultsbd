package com.masud.dev.examresultsbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CollegeRajshahi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_rajshahi);


        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void r1(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801775409924"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void r2(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801772800382"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void r3(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801712101100"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

    public void r4(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801717999003"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }
    public void r5(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711905969"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }

public void r6(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 721-775475"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r7(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711905969"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r8(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801836220000"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r9(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801719984311"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r10(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880752956442"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r11(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880721-772388"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r12(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801727461699"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r13(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 1774-290600"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r14(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88078152261"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r15(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801558352301"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r16(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880-731-66126"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r17(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+88057162430"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r18(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+880 1712-575928"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r19(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801731951197"));
        startActivity(callIntent);
        try {
            startActivity(callIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "No number found", Toast.LENGTH_LONG).show();
        }
    }public void r20(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:+8801711905969"));
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

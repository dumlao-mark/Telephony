package com.group12.g12telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Contact 1
    public void btnSms(View view) {

        Intent intentSms= new Intent(this, SmsActivity.class);
        startActivity(intentSms);
    }

    public void btnCall(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED){

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+"09657824785"));
            startActivity(callIntent);

        }else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        }
    }
    //Contact 2
    public void btnSms2(View view) {

        Intent intentSms2= new Intent(this, Sms2.class);
        startActivity(intentSms2);
    }

    public void btnCall2(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED){

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+"09950173355"));
            startActivity(callIntent);

        }else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        }
    }

    //Contact 3
    public void btnSms3(View view) {

        Intent intentSms= new Intent(this, Sms3.class);
        startActivity(intentSms);
    }

    public void btnCall3(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED){

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+"09552141785"));
            startActivity(callIntent);

        }else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        }
    }

    //Contact 4
    public void btnSms4(View view) {

        Intent intentSms= new Intent(this, Sms4.class);
        startActivity(intentSms);
    }

    public void btnCall4(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED){

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+"09651478952"));
            startActivity(callIntent);

        }else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        }
    }

    //Contact 5
    public void btnSms5(View view) {

        Intent intentSms= new Intent(this, Sms5.class);
        startActivity(intentSms);
    }

    public void btnCall5(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck== PackageManager.PERMISSION_GRANTED){

            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+"09350202355"));
            startActivity(callIntent);

        }else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 0);
        }
    }
}
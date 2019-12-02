package com.example.brief;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    // on back button pressed - leave application
    public void onBackPressed() {
        // finish();

        // hide
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    // on education button press - open education activity
    public void OnClick(View view) {

        switch(view.getId()){

            // go to education activity
            case R.id.educationButton:
                    Intent intent = new Intent(MainActivity.this, EducationActivity.class);
                    startActivity(intent);
                break;

            // hide app
            case R.id.exitButton:
                    // hide
                    Intent i = new Intent(Intent.ACTION_MAIN);
                    i.addCategory(Intent.CATEGORY_HOME);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                break;

            case R.id.jobButton:
                    // hide
                    Intent intentJob = new Intent(MainActivity.this, JobActivity.class);
                    startActivity(intentJob);
                break;

            // jobButton

            // portraitImage


        }


    }



}




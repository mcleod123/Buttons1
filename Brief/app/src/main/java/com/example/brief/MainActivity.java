package com.example.brief;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    public void OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, EducationActivity.class);
        startActivity(intent);
    }
    */


    public void OnClick(View view) {

        switch(view.getId()){

            case R.id.educationButton:
                    Intent intent = new Intent(MainActivity.this, EducationActivity.class);
                    startActivity(intent);
                break;
            /*
            case R.id.backButton:
                // чето еще
                break;
            */

        }


    }



}




package com.example.brief;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
    }

    public void OnClick(View view) {

        switch(view.getId()){

            case R.id.backButton:
                Intent intent = new Intent(EducationActivity.this, MainActivity.class);
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

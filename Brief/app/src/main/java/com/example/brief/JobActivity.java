package com.example.brief;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class JobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
    }


    @Override
    // on back button pressed - close education activity
    protected void onUserLeaveHint() {
        onPause();
        Intent intent = new Intent(JobActivity.this, MainActivity.class);
        startActivity(intent);
        super.onUserLeaveHint();
    }


    public void OnClick(View view) {

        switch(view.getId()){

            case R.id.backButtonFromJob:
                Intent intent = new Intent(JobActivity.this, MainActivity.class);
                startActivity(intent);
                break;

        }
    }

}

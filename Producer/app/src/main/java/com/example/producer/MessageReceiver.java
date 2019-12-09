package com.example.producer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;


public class MessageReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        // отлавливаем сообщение от продюсера
        if(intent.getStringExtra("message_from_producer_text") != null) {

            Toast.makeText(context, "We have a message from Producer: " +
                            intent.getStringExtra("message_from_producer_text"),
                    Toast.LENGTH_LONG).show();

            /*
            MainActivityLogger mainActivityLogger = new MainActivityLogger();
            mainActivityLogger.recordToLogField(
                    "message_from_producer_text",
                    intent.getStringExtra("message_from_producer_text")
                    );
            */



        // отлавливаем сообщения от консумера, если он ответил
        } else if (intent.getStringExtra("message_from_consumer_text") != null) {

            Toast.makeText(context, "We have a message from Consumer: " +
                            intent.getStringExtra("message_from_consumer_text"),
                    Toast.LENGTH_LONG).show();

            /*
            MainActivityLogger mainActivityLogger = new MainActivityLogger();
            mainActivityLogger.recordToLogField(
                    "message_from_consumer_text",
                    intent.getStringExtra("message_from_consumer_text")
            );
            */

          //  recordToLogField("message_from_consumer_text", intent.getStringExtra("message_from_consumer_text"));

        }
    }




}



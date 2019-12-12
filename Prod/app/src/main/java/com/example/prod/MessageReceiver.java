package com.example.prod;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast toast = Toast.makeText(
                context.getApplicationContext(),
                intent.getStringExtra("producer_broadcast_name"),
                Toast.LENGTH_SHORT
        );
        toast.show();

        throw new UnsupportedOperationException("Not yet implemented");
    }

}

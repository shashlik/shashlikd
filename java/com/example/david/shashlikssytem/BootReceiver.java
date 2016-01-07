package com.example.david.shashlikssytem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MainApplication app = ((MainApplication) context.getApplicationContext());
        app.startServices();
    }
}

package com.example.david.shashlikssytem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.SystemProperties;

import java.io.RandomAccessFile;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import android.net.LocalSocket;

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //start shashlikd app wide services
        MainApplication app = ((MainApplication) context.getApplicationContext());
        app.startServices();

        //start boot app
        Log.e("DAVE DAVE DAVE DAVE STARTUP", "Going to open socket");

        RandomAccessFile pipe;
        try {
            pipe = new RandomAccessFile("/dev/qemu_pipe", "rw");
            FileWriter x = new FileWriter(pipe.getFD());
            x.write("pipe:unix:/tmp/asdf");
            x.flush();

            Log.e("DAVE DAVE DAVE DAVE STARTUP", "opening pipe");

            LocalSocket socket = new LocalSocket(pipe.getFD());
            OutputStreamWriter socketStream = new OutputStreamWriter(socket.getOutputStream());
            socketStream.write("CHEESE");
            socketStream.flush();

            Log.e("DAVE DAVE DAVE DAVE STARTUP", "DATA SENT");
        } catch (Exception e){
            Log.e("DAVE DAVE DAVE DAVE STARTUP", "could not open pipe");
        }
    }
}

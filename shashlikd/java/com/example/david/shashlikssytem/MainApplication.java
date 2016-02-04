package com.example.david.shashlikssytem;

import android.app.Application;

/**
 * Created by david on 17/12/15.
 */
public class MainApplication extends Application {
    private NavBar mNavBar;

    public void startServices() {
        mNavBar = new NavBar(this);
    }
}

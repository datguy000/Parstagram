package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DO8NzJZ4kFo2lMerxwUlhTGFt7bp7PR2UjP235DL")
                .clientKey("c0Srmb3tFfJk7IRmXImkE4mIASiMAjNOSyJCEAM2")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}

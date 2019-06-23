package com.gm.coding.dsggersample;

import android.app.Application;

import com.gm.coding.dsggersample.di.application.ApplicationComponent;
import com.gm.coding.dsggersample.di.application.ApplicationModule;
import com.gm.coding.dsggersample.di.application.DaggerApplicationComponent;

public class MainApplication extends Application {
    private ApplicationComponent applicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}

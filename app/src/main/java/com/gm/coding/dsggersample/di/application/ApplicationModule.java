package com.gm.coding.dsggersample.di.application;

import android.app.Application;
import android.content.Context;

import com.gm.coding.dsggersample.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    MainApplication mApplication;

    public ApplicationModule(MainApplication application) {
        mApplication = application;
    }

    @Provides
    MainApplication provideApplication(){
        return mApplication;
    }

    @Provides
    Context provideApplicationContext(){
        return mApplication.getApplicationContext();
    }
}

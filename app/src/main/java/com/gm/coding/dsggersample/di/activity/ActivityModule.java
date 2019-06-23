package com.gm.coding.dsggersample.di.activity;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.gm.coding.dsggersample.FirstFragment;
import com.gm.coding.dsggersample.MainActivity;
import com.gm.coding.dsggersample.MainApplication;
import com.gm.coding.dsggersample.di.application.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private FragmentActivity activity;

    public ActivityModule(FragmentActivity activity) {
        this.activity = activity;
    }

    @Provides
    Activity getActivity(){
        return activity;
    }

    @Provides
    Context provideActivityContext(){
        return activity.getBaseContext();
    }

    @Provides
    FragmentManager provideFragmentManager() {
        return activity.getSupportFragmentManager();
    }

    @Provides
    FirstFragment provideFirstFragment() {
        return new FirstFragment();
    }

}

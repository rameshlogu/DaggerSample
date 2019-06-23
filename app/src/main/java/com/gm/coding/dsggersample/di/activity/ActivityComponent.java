package com.gm.coding.dsggersample.di.activity;

import android.app.Activity;
import android.content.Context;

import com.gm.coding.dsggersample.MainActivity;
import com.gm.coding.dsggersample.MainApplication;
import com.gm.coding.dsggersample.di.application.ApplicationComponent;

import javax.inject.Singleton;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
    Activity getActivity();
}

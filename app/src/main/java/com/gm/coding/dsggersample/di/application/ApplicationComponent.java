package com.gm.coding.dsggersample.di.application;

import android.app.Application;

import com.gm.coding.dsggersample.MainApplication;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    public MainApplication getApplication();
}

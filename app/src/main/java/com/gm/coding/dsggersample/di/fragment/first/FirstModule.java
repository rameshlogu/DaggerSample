package com.gm.coding.dsggersample.di.fragment.first;

import android.support.v4.app.Fragment;

import com.gm.coding.dsggersample.FirstFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstModule {
    private FirstFragment fragment;

    public FirstModule(FirstFragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    Fragment getFragment(){
        return fragment;
    }

    @Provides
    String provideLabel() {
        return "First Fragment : Injected String";
    }

    @Named("Another string")
    @Provides
    String provideAnotherLabel() {
        return "First Fragment : Injected Another String";
    }
}

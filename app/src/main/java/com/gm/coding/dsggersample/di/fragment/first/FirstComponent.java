package com.gm.coding.dsggersample.di.fragment.first;

import android.support.v4.app.Fragment;

import com.gm.coding.dsggersample.FirstFragment;

import dagger.Component;

@Component(modules = FirstModule.class)
public interface FirstComponent {
    void inject(FirstFragment fragment);
    Fragment getFragment();
}

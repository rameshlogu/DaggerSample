package com.gm.coding.dsggersample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gm.coding.dsggersample.di.fragment.first.DaggerFirstComponent;
import com.gm.coding.dsggersample.di.fragment.first.FirstModule;

import javax.inject.Inject;
import javax.inject.Named;

public class FirstFragment extends Fragment {

    @Inject
    @Named("Another string")
    public String injectedLabel;

    public FirstFragment(){}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        DaggerFirstComponent.builder()
                .firstModule(new FirstModule(this))
                .build()
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        ((TextView)view.findViewById(R.id.first_string)).setText(injectedLabel);
        return view;
    }
}

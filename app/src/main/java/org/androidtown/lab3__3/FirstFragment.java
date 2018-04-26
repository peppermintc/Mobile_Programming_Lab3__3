package org.androidtown.lab3__3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //INFLATION
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_first, container, false);

        return rootView;
    }
}


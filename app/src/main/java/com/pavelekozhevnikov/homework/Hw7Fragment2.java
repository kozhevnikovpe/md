package com.pavelekozhevnikov.homework;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hw7Fragment2 extends Fragment {


    public Hw7Fragment2() {
        // Required empty public constructor
    }

    public static Hw7Fragment2 newInstance(Bundle bundle) {
        Hw7Fragment2 currentFragment = new Hw7Fragment2();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hw7_fragment2, container, false);
    }

}
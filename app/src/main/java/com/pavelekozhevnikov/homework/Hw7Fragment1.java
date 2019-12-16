package com.pavelekozhevnikov.homework;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hw7Fragment1 extends Fragment {


    public Hw7Fragment1() {
        // Required empty public constructor
    }

    public static Hw7Fragment1 newInstance(Bundle bundle) {
        Hw7Fragment1 currentFragment = new Hw7Fragment1();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hw7_fragment1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button button_hw7=
                getActivity().findViewById(R.id.button_hw7);
        button_hw7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Hw7BottomNavigationActivity.class);
                startActivity(intent);
            }
        });
    }

}

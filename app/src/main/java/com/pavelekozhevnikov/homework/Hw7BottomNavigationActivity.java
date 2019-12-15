package com.pavelekozhevnikov.homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;
import android.view.MenuItem;

public class Hw7BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw7_bottom_navigation);
        replaceFragment(new Hw7Fragment1());

        BottomNavigationView navView = findViewById(R.id.navigation_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bn_tab1:
                    replaceFragment(new Hw7Fragment1());
                    return true;
                case R.id.bn_tab2:
                    replaceFragment(new Hw7Fragment2());
                    return true;
                case R.id.bn_tab3:
                    replaceFragment(new Hw7Fragment3());
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();

    }
}

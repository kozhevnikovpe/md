package com.pavelekozhevnikov.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Hw7TabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw7_tabs);

        Fragment fragment1 = Hw7Fragment1.newInstance(null);
        Fragment fragment2 = Hw7Fragment2.newInstance(null);
        Fragment fragment3 = Hw7Fragment3.newInstance(null);

        Hw7Adapter myAdapter = new Hw7Adapter(getSupportFragmentManager());
        myAdapter.addFragment(fragment1, "tab1");
        myAdapter.addFragment(fragment2, "tab2");
        myAdapter.addFragment(fragment3, "tab3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}

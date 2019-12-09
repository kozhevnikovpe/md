package com.pavelekozhevnikov.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;

public class TextInputActivity extends AppCompatActivity {

    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);

        LinearLayout llBottomSheet = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet);

        Button button_sb = findViewById(R.id.button_sb);
        button_sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "I'am a bottomsheet expander", Snackbar.LENGTH_LONG)
                        .setAction("TRY ME", new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {
                                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                            }
                        }).show();

            }
        });

        Button button_hw3=findViewById(R.id.button_hw3);
        button_hw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextInputActivity.this, Homework3Activity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.customviews;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyCustomView myCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomView = findViewById(R.id.custom_view);

        /*if (event.getAction() == MotionEvent.ACTION_UP) {
            myCustomView.setViewColor(Color.rgb(122, 77, 168));
            myCustomView.setTextColor(Color.WHITE);
        }*/
    }
}
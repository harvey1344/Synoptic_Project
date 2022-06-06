package com.example.synopticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menu= findViewById(R.id.button);


        menu.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, StaticListViewActivity.class)));
    }
}


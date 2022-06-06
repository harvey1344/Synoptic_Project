package com.example.synopticproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class StaticListViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // create our UI using a fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentById(android.R.id.content) == null) {
            StaticListViewFragment fragment = StaticListViewFragment.newInstance();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(android.R.id.content, fragment);
            ft.commit();
        }
        ((AppCompatActivity)this).getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}

package com.example.synopticproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.Arrays;


public class StaticListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView= findViewById(R.id.staticListView);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener)this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String item = (String) parent.getItemAtPosition(position);
        if (item.equals("Cooking"))
        {
            startActivity(new Intent(StaticListViewActivity.this, Cooking.class));
        }
        else if (item.equals("Cleaning"))
        {
            startActivity(new Intent(StaticListViewActivity.this, Cleaning.class));
        }
        switch (item)
        {
            case "Cooking":
                startActivity(new Intent(StaticListViewActivity.this, Cooking.class));
                break;

            case "Washing":
                startActivity(new Intent(StaticListViewActivity.this, Washing.class));
                break;

            case "Cleaning":
                startActivity(new Intent(StaticListViewActivity.this, Cleaning.class));
                break;

            case "Fishing":
                startActivity(new Intent(StaticListViewActivity.this, Fishing.class));
                break;

            case "Farming":
                startActivity(new Intent(StaticListViewActivity.this, Farming.class));
                break;

            case "Getting Online"  :
                startActivity(new Intent(StaticListViewActivity.this, GettingOnline.class));
                break;
        }
        Toast.makeText(this.getApplicationContext(), "Clicked on "+ item, Toast.LENGTH_LONG).show();


    }
}

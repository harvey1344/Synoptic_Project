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

        // get listView object by id
        ListView listView= findViewById(R.id.staticListView);
        // on click run "this" AdapterView.OnItemClickListener
        listView.setOnItemClickListener((AdapterView.OnItemClickListener)this);


    }


    // method from AdapterView- define behaviour for menu
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // get string from the text of menu item press
        String item = (String) parent.getItemAtPosition(position);

        // switch statement dictates the activity that is loading based off the item
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

            case "Waste Management"  :
                startActivity(new Intent(StaticListViewActivity.this, WasteManagement.class));
                break;
        }
        Toast.makeText(this.getApplicationContext(), "Clicked on "+ item, Toast.LENGTH_LONG).show();


    }
}

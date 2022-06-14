package com.example.synopticproject;

import android.os.Bundle;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class StaticListViewFragment extends Fragment {

    private static String[] MOBILE_MODELS = {"Cooking", "Cleaning", "Building", "Farming", "Getting Online","Waste Management" };

    public static StaticListViewFragment newInstance() {
        Bundle args = new Bundle();
        StaticListViewFragment fragment = new StaticListViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.staticlistviewmain, container, false);
        ListView listView = (ListView) mainView.findViewById(R.id.listView);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,MOBILE_MODELS));
        return mainView;
    }
}
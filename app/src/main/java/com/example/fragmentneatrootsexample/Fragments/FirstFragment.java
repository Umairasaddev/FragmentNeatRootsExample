package com.example.fragmentneatrootsexample.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentneatrootsexample.R;
import com.example.fragmentneatrootsexample.SecondActivity;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    TextView tvf1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvf1 = view.findViewById(R.id.tvf1);
        tvf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
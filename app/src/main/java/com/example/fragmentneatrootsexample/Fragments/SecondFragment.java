package com.example.fragmentneatrootsexample.Fragments;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentneatrootsexample.R;
import com.example.fragmentneatrootsexample.SecondActivity;

public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    TextView tvf2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);

        tvf2 = view.findViewById(R.id.tvf2);
        tvf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
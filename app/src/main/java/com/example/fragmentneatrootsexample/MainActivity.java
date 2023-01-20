package com.example.fragmentneatrootsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragmentneatrootsexample.Fragments.FirstFragment;
import com.example.fragmentneatrootsexample.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        linearLayout = findViewById(R.id.linearlayout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                Fragment fragment = new tasks(); .
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
                */
                Bundle bundle = new Bundle();
                bundle.putString("message", "From Activity");

// Set Fragmentclass Arguments
                Fragmentclass fragobj = new Fragmentclass();
                fragobj.setArguments(bundle);
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout,firstFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout,secondFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
    }
}
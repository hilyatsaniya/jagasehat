package com.example.misara.jagasehatnavbar;


import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1Fragment extends android.app.Fragment {
    Button button;

    public Page1Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_page1, container, false);

        LinearLayout ln = view.findViewById(R.id.frame1);

        ln.setOnTouchListener(new OnSwipeTouchListener() {
            public void onSwipeRight(){
                FragmentManager manager1 = getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.fragment, new DashboardFragment())
                        .commit();
            }

            public void onSwipeLeft(){
                FragmentManager pg2 = getFragmentManager();
                pg2.beginTransaction()
                        .replace(R.id.fragment, new Page2Fragment())
                        .commit();
            }
        });



        return view;

    }

    public void onClickHome (View v){
        FragmentManager manager1 = getFragmentManager();
        manager1.beginTransaction()
                .replace(R.id.fragment, new DashboardFragment())
                .commit();
    }

    public void onClickNext2 (View v){
        FragmentManager pg2 = getFragmentManager();
        pg2.beginTransaction()
                .replace(R.id.fragment, new Page2Fragment())
                .commit();
    }


}

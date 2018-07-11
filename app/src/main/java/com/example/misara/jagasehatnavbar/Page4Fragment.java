package com.example.misara.jagasehatnavbar;


import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page4Fragment extends android.app.Fragment {


    public Page4Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_page4, container, false);
        LinearLayout ln = view.findViewById(R.id.frame4);

        ln.setOnTouchListener(new OnSwipeTouchListener() {
            public void onSwipeRight(){
                FragmentManager pg3 = getFragmentManager();
                pg3.beginTransaction()
                        .replace(R.id.fragment, new Page3Fragment())
                        .commit();
            }

            public void onSwipeLeft(){
                FragmentManager manager1 = getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.fragment, new DashboardFragment())
                        .commit();
//                Toast.makeText(Page4Fragment.this,"selesai", Toast.LENGTH_SHORT).show();
            }

        });
        return view;
    }

    public void onClickHome (View v){
//        FragmentManager manager1 = getFragmentManager();
//        manager1.beginTransaction()
//                .replace(R.id.fragment, new DashboardFragment())
//                .commit();
    }

    public void onClickPrev3 (View v) {
//        FragmentManager pg1 = getFragmentManager();
//        pg1.beginTransaction()
//                .replace(R.id.fragment, new Page1Fragment())
//                .commit();
    }

}

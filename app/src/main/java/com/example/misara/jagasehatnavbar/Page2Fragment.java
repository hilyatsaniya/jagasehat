package com.example.misara.jagasehatnavbar;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page2Fragment extends android.app.Fragment {


    public Page2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page2, container, false);

        LinearLayout ln = view.findViewById(R.id.frame2);

        ln.setOnTouchListener(new OnSwipeTouchListener() {
            public void onSwipeRight(){
                FragmentManager pg1 = getFragmentManager();
                pg1.beginTransaction()
                        .replace(R.id.fragment, new Page1Fragment())
                        .commit();
            }

            public void onSwipeLeft(){
                FragmentManager pg3 = getFragmentManager();
                pg3.beginTransaction()
                        .replace(R.id.fragment, new Page3Fragment())
                        .commit();
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

    public void onClickNext3 (View v){
//        FragmentManager pg3 = getFragmentManager();
//        pg3.beginTransaction()
//                .replace(R.id.fragment, new Page3Fragment())
//                .commit();
    }

    public void onClickPrev1 (View v) {
        FragmentManager pg1 = getFragmentManager();
        pg1.beginTransaction()
                .replace(R.id.fragment, new Page1Fragment())
                .commit();
    }




}

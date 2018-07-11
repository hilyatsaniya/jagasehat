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
public class DashboardFragment extends android.app.Fragment /*implements View.OnClickListener*/{

//    private LinearLayout hal1,hal2,hal3,hal4;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        hal1 = (LinearLayout) getView().findViewById(R.id.page1);
//        hal2 = (LinearLayout) getView().findViewById(R.id.page2);
//        hal3 = (LinearLayout) getView().findViewById(R.id.page3);
//        hal4 = (LinearLayout) getView().findViewById(R.id.page4);
//
//        hal1.setOnClickListener(this);
//        hal2.setOnClickListener(this);
//        hal3.setOnClickListener(this);
//        hal4.setOnClickListener(this);

        return inflater.inflate(R.layout.fragment_dashboard, container, false);

    }


//    @Override
//    public void onClickPage1(View v) {
//        FragmentManager pg1 = getFragmentManager();
//        pg1.beginTransaction()
//                .replace(R.id.fragment, new Page1Fragment())
//                .commit();
//
//    }
}

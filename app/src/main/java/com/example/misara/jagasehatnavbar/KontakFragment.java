package com.example.misara.jagasehatnavbar;


import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends android.app.Fragment {


    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kontak, container, false);


        return v;
    }

    public void onClickCall(View v){
//        setContentView(R.layout.fragment_kontak);
//        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(String.valueOf(R.id.number)));
//        startActivity(i);
    }
}

package com.eomsbd.Islamic.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eomsbd.Islamic.Interface.OnBackPressed;
import com.eomsbd.Islamic.R;
import com.eomsbd.Islamic.activity.StartActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class sura245Fragment extends Fragment implements OnBackPressed {
LinearLayout button3;

    public sura245Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sura245, container, false);
        button3=view.findViewById(R.id.backButton3);
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(getActivity(), StartActivity.class);
               startActivity(i);
               getActivity().finish();
           }
       });
return view;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getActivity(), StartActivity.class);
        startActivity(i);
    }
}

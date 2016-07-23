package com.example.learnfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        rootView.findViewById(R.id.btnShowNewFragment).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  getFragmentManager().beginTransaction()
                          .addToBackStack(null)
                          .replace(R.id.container, new AnotherFragment())
                          .commit();
              }
          }
        );
        return rootView;
    }
}

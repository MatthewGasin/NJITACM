package org.acm.njit.njitacm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;


public class SIGFragment extends Fragment {

    String[] gridViewNames = {"Android","Algorithm","Applied Alg.","Linux","Sound Design","Web Design"};

    public SIGFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sig, container, false);

       // GridView gv =  getView().findViewById(R.id.SigGV);

      //  gv.setAdapter(new ArrayAdapter<String>(this.getActivity(), R.layout.fragment_sig, gridViewNames));
        // Inflate the layout for this fragment
        return view;
    }

}
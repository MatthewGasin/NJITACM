package org.acm.njit.njitacm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;


public class SIGFragment extends Fragment {

    String[] gridViewNames = {"Android","Algorithm","Applied Alg.","Linux","Sound Design","Web Design"};

    public SIGFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sig, container, false);
    }

}

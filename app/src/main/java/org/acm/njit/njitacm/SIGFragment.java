package org.acm.njit.njitacm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class SIGFragment extends Fragment implements View.OnClickListener {



    public SIGFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sig, container, false);

        return view;
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.imageButton3:
                Toast.makeText(getActivity(), "Your toast message.",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageButton4:
                break;

            case R.id.imageButton5:
                break;

            case R.id.imageButton6:
                break;

            case R.id.imageButton7:
                break;

            case R.id.imageButton8:
                break;
        }


    }

}
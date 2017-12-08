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

    //String[] gridViewNames = {"Android","Algorithm","Applied Alg.","Linux","Sound Design","Web Design"};
    ImageButton BTandroid,BTalg,BTAppAlg,BTLinux,BTWebDev,BTRevEng;

    public SIGFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Sig Fragment","onCreateView Started");
        View view = inflater.inflate(R.layout.fragment_sig, container, false);
        BTandroid = (ImageButton) getActivity().findViewById(R.id.imageButton3);
       /* BTandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Your toast message.",
                        Toast.LENGTH_SHORT).show();
            }
        });*/
        BTalg = (ImageButton) getActivity().findViewById(R.id.imageButton4);
       // BTalg.setOnClickListener(this);
        BTAppAlg = (ImageButton) getActivity().findViewById(R.id.imageButton5);
        //BTAppAlg.setOnClickListener(this);
        BTLinux = (ImageButton) getActivity().findViewById(R.id.imageButton6);
       // BTLinux.setOnClickListener(this);
        BTWebDev = (ImageButton) getActivity().findViewById(R.id.imageButton7);
        //BTWebDev.setOnClickListener(this);
        BTRevEng = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        //BTRevEng.setOnClickListener(this);

        Log.d("Sig Fragment","onCreateView Finished");


        // GridView gv =  getView().findViewById(R.id.SigGV);

      //  gv.setAdapter(new ArrayAdapter<String>(this.getActivity(), R.layout.fragment_sig, gridViewNames));
        // Inflate the layout for this fragment
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
package org.acm.njit.njitacm.SigDisplays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import org.acm.njit.njitacm.R;

/**
 * Created by joesc on 12/8/2017.
 */

public class AndroidFrag extends android.support.v4.app.Fragment {
    public AndroidFrag(){
        //required empty constructor

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.android_sig, container, false);
    }
}


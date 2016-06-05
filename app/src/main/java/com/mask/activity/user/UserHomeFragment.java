package com.mask.activity.user;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mask.R;


public class UserHomeFragment extends Fragment {
    Button buttonWater, buttonElectricity, buttonSeavage, buttonMedical;
    public UserHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_user_home, container, false);

        buttonElectricity = (Button)view.findViewById(R.id.buttonElectricity);
        buttonMedical = (Button)view.findViewById(R.id.buttonMedical);
        buttonWater = (Button)view.findViewById(R.id.buttonWater);
        buttonSeavage = (Button)view.findViewById(R.id.buttonSeavage);
        return  view;
    }


}

package com.mask.activity.moderator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mask.R;

public class ModProfileFragment extends Fragment {
    ImageView img;
    TextView tname, taadhar, taddress;
    Button btnContact;
    public ModProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mod_profile, container, false);
        img = (ImageView)view.findViewById(R.id.imageView2);
        tname = (TextView)view.findViewById(R.id.txtviewMName);
        taadhar = (TextView)view.findViewById(R.id.txtViewAdhar);
        taddress = (TextView)view.findViewById(R.id.txtViewAddress);
        btnContact = (Button)view.findViewById(R.id.btnContact);
        return  view;
    }

}

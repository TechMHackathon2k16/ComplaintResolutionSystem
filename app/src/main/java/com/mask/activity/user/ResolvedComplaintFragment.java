package com.mask.activity.user;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mask.R;


public class ResolvedComplaintFragment extends Fragment {
    ListView resolvedComplaint;
    public ResolvedComplaintFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resolved_complaint, container, false);
        resolvedComplaint = (ListView)view.findViewById(R.id.buttonregister);
        return view;
    }


}

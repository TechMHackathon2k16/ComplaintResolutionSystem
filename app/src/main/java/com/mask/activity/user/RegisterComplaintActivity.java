package com.mask.activity.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.mask.R;

public class RegisterComplaintActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    EditText txtfieldName;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_complaint);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        txtfieldName = (EditText)findViewById(R.id.txtfieldName);
        btn = (Button)findViewById(R.id.buttonregister);
    }
}

package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        EditText username_f1 = view.findViewById(R.id.username_f1);
        EditText password_f1 = view.findViewById(R.id.password_f1);
        Button chuyen = view.findViewById(R.id.chuyen);

        chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username_f2 = getActivity().findViewById(R.id.username_f2);
                username_f2.setText(username_f1.getText().toString());
                EditText password_f2 = getActivity().findViewById(R.id.password_f2);
                password_f2.setText(password_f1.getText().toString());
            }
        });
        return view;
    }
}
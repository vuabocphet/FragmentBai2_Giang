package com.developer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_A extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);

        final EditText edt_a=view.findViewById(R.id.edt_a);
        view.findViewById(R.id.click_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Anh xa view cua fragment ben trong day
                TextView textView=getActivity().findViewById(R.id.txt_b);
                textView.setText(edt_a.getText().toString().trim());

            }
        });
        return view;
    }
}

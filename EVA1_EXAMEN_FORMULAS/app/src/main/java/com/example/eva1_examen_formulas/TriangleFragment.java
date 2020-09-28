package com.example.eva1_examen_formulas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TriangleFragment extends Fragment {

    TextView tvResult;
    EditText etBase,etAltura;
    Button btnCalc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout lyTriang = (LinearLayout) inflater.inflate(R.layout.fragment_triangle, container, false);

        tvResult = lyTriang.findViewById(R.id.txtVwResult2);
        etBase = lyTriang.findViewById(R.id.etBase);
        etAltura = lyTriang.findViewById(R.id.etAltura);
        btnCalc = lyTriang.findViewById(R.id.btnCalc2);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dBase = Double.parseDouble(etAltura.getText().toString());
                double dAltura = Double.parseDouble(etBase.getText().toString());

                double result = (dBase*dAltura)/2;

                tvResult.setText(String.valueOf(result)+" Cm²");

            }
        });


        return lyTriang;
    }
}
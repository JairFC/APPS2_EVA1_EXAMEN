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

public class RombFragment extends Fragment {

    TextView tvResult;
    EditText etDiagMay,etDiagMen;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout lyRomb = (LinearLayout) inflater.inflate(R.layout.fragment_romb, container, false);

        tvResult = lyRomb.findViewById(R.id.txtVwResult6);
        etDiagMay = lyRomb.findViewById(R.id.etDiamMay);
        etDiagMen = lyRomb.findViewById(R.id.etDiamMen);
        btnCalc = lyRomb.findViewById(R.id.btnCalc6);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dMenor = Double.parseDouble(etDiagMen.getText().toString());
                double dMayor = Double.parseDouble(etDiagMay.getText().toString());

                double result = (dMayor*dMenor)/2;

                tvResult.setText(String.valueOf(result)+" Cm²");

            }
        });
        // Inflate the layout for this fragment
        return lyRomb;
    }
}
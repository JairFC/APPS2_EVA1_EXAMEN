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

public class PentaFragment extends Fragment {

    TextView tvResult;
    EditText etLado,etApot;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout lyPenta = (LinearLayout) inflater.inflate(R.layout.fragment_penta, container, false);
        tvResult = lyPenta.findViewById(R.id.txtVwResult7);
        etLado = lyPenta.findViewById(R.id.etLadoPer);
        etApot = lyPenta.findViewById(R.id.etApotema);
        btnCalc = lyPenta.findViewById(R.id.btnCalc7);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dLado = Double.parseDouble(etLado.getText().toString());
                double dApo = Double.parseDouble(etApot.getText().toString());

                double result = ((dLado*5)*dApo)/2;

                tvResult.setText(String.valueOf(result)+" Cm²");
            }
        });
        // Inflate the layout for this fragment
        return lyPenta;
    }
}
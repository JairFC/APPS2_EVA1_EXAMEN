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


public class TrapFragment extends Fragment {
    TextView tvResult;
    EditText etBaseMay,etBaseMen,etAltura;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout lyTrapecio = (LinearLayout) inflater.inflate(R.layout.fragment_trap, container, false);

        tvResult = lyTrapecio.findViewById(R.id.txtVwResult5);
        etBaseMen = lyTrapecio.findViewById(R.id.etBaseMen);
        etAltura = lyTrapecio.findViewById(R.id.etAlt6);
        etBaseMay = lyTrapecio.findViewById(R.id.etBaseMay);
        btnCalc = lyTrapecio.findViewById(R.id.btnCalc5);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dBaseMen = Double.parseDouble(etBaseMen.getText().toString());
                double dBaseMay = Double.parseDouble(etBaseMay.getText().toString());
                double dAltura = Double.parseDouble(etAltura.getText().toString());

                double result = ((dBaseMay+dBaseMen)*dAltura)/2;

                tvResult.setText(String.valueOf(result)+" cm²");
            }
        });

        return lyTrapecio;
    }
}
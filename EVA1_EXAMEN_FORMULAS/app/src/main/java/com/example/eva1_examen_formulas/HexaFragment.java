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

public class HexaFragment extends Fragment {

    TextView tvResult;
    EditText etLado,etApotema;
    Button btnCalc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout lyHexa = (LinearLayout) inflater.inflate(R.layout.fragment_hexa, container, false);
        // Inflate the layout for this fragment
        tvResult = lyHexa.findViewById(R.id.txtVwResult8);
        etLado = lyHexa.findViewById(R.id.etLado8);
        etApotema = lyHexa.findViewById(R.id.etApotema8);
        btnCalc = lyHexa.findViewById(R.id.btnCalc8);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dLado = Double.parseDouble(etLado.getText().toString());
                double dApotema = Double.parseDouble(etApotema.getText().toString());

                double result = ((dLado*6)*dApotema)/2;

                tvResult.setText(String.valueOf(result)+" cm²");

            }
        });



        return lyHexa;
    }
}
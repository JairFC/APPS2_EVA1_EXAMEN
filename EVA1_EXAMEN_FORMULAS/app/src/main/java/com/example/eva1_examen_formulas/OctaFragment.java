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

public class OctaFragment extends Fragment {

    TextView tvResult;
    EditText etLado,etApotema;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout lyOcta = (LinearLayout) inflater.inflate(R.layout.fragment_octa, container, false);


        tvResult = lyOcta.findViewById(R.id.txtVwResult9);
        etLado = lyOcta.findViewById(R.id.etLado9);
        etApotema = lyOcta.findViewById(R.id.etApotema9);
        btnCalc = lyOcta.findViewById(R.id.btnCalc9);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dLado = Double.parseDouble(etLado.getText().toString());
                double dApotema = Double.parseDouble(etApotema.getText().toString());

                double result = ((dLado*8)*dApotema)/2;

                tvResult.setText(String.valueOf(result)+" cm²");

            }
        });

        return lyOcta;
    }
}
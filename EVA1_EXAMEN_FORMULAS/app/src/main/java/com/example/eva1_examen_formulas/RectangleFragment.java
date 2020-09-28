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


public class RectangleFragment extends Fragment {

    TextView tvResult;
    EditText etBase,etAltura;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout lyRect = (LinearLayout) inflater.inflate(R.layout.fragment_rectangle, container, false);

        tvResult = lyRect.findViewById(R.id.txtVwResult4);
        etBase = lyRect.findViewById(R.id.etBase4);
        etAltura = lyRect.findViewById(R.id.etAltura4);

        btnCalc = lyRect.findViewById(R.id.btnCalc4);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dBase = Double.parseDouble(etAltura.getText().toString());
                double dAltura = Double.parseDouble(etBase.getText().toString());

                double result = (dBase*dAltura);

                tvResult.setText(String.valueOf(result)+" Cm²");

            }
        });


        return lyRect;
    }
}
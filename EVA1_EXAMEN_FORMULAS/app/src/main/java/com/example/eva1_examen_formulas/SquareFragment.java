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

public class SquareFragment extends Fragment {

    TextView tvResult;
    EditText etLad;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout lySquare = (LinearLayout) inflater.inflate(R.layout.fragment_square, container, false);

        tvResult = lySquare.findViewById(R.id.txtVwResult3);
        etLad = lySquare.findViewById(R.id.etLado);
        btnCalc = lySquare.findViewById(R.id.btnCalc3);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dLad = Double.parseDouble(etLad.getText().toString());

                double result = dLad*dLad;

                tvResult.setText(result+" Cm²");

            }
        });


        return lySquare;
    }
}
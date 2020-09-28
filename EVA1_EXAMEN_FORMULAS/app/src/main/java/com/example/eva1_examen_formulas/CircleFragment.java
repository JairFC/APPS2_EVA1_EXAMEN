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

public class CircleFragment extends Fragment {

    TextView tvResult;
    EditText etRad;
    Button btnCalc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout lyCircle = (LinearLayout) inflater.inflate(R.layout.fragment_circle, container, false);
        tvResult = lyCircle.findViewById(R.id.txtVwResult);
        etRad = lyCircle.findViewById(R.id.etRadio);
        btnCalc = lyCircle.findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dRad = Double.parseDouble(etRad.getText().toString());

                double result = (dRad*dRad)*Math.PI;

                tvResult.setText(String.valueOf(result)+" Cm²");

            }
        });

        return lyCircle;
    }


    public void onMessageFromMainToFrag(String param){
       // textViewDatos.setText(param);
    }
}
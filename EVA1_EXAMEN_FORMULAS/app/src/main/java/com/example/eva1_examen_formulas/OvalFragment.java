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

public class OvalFragment extends Fragment {
    TextView tvResult;
    EditText etRadMay,etRadMen;
    Button btnCalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout lyOval = (LinearLayout) inflater.inflate(R.layout.fragment_oval, container, false);

        tvResult = lyOval.findViewById(R.id.txtVwResult10);
        etRadMay = lyOval.findViewById(R.id.etRadioMen);
        etRadMen = lyOval.findViewById(R.id.etRadioMay);
        btnCalc = lyOval.findViewById(R.id.btnCalc10);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double dMenor = Double.parseDouble(etRadMen.getText().toString());
                double dMayor = Double.parseDouble(etRadMay.getText().toString());

                double result = (dMayor*dMenor)*Math.PI;

                tvResult.setText(String.valueOf(result)+" Cm²");

            }
        });


        // Inflate the layout for this fragment
        return lyOval;
    }
}
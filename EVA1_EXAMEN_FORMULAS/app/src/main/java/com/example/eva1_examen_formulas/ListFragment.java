package com.example.eva1_examen_formulas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

public class ListFragment extends Fragment {

    String[] Figuras = {
            "Circulo",
            "Triangulo",
            "Cuadrado",
            "Rectangulo",
            "Trapecio",
            "Rombo",
            "Pentagono",
            "Hexagono",
            "Octagono",
            "Ovalo"
    };

    MainActivity mainActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_list, container, false);
        ListView listView;
        listView = frameLayout.findViewById(R.id.lvData);

        listView.setAdapter(new ArrayAdapter<>(
                mainActivity,
                android.R.layout.simple_list_item_1,
                Figuras
        ));


        //evento
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //aqui va el codigo
                //mainActivity.onMessageFromFragToMain("LISTA",Figuras[i]);
                //obtener el titulo de la fig seleccionada
                String FigCode = Figuras[i];

                mainActivity.onMessageFromFragToMain("LISTA",FigCode);

            }
        });



        return frameLayout;
    }
}
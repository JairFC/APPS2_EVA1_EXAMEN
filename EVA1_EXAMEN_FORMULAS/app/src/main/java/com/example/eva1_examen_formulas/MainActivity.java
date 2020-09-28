package com.example.eva1_examen_formulas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListFragment lista;

    //2. ACCEDER
    //METODO QUE SE EJECUTA CUANDO UN FRAGMENTO SE VINCULA

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);


        if (fragment.getClass()==ListFragment.class)
            lista = (ListFragment) fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onMessageFromFragToMain(String sender,String param){
        if (sender.equals("LISTA")){

            if (param.equals("Circulo")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                CircleFragment circleFragment = new CircleFragment();
                ft.replace(R.id.frmLyFrag,circleFragment);
                ft.commit();

            }else if(param.equals("Triangulo")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                TriangleFragment triangleFragment = new TriangleFragment();
                ft.replace(R.id.frmLyFrag,triangleFragment);
                ft.commit();

            }else if(param.equals("Cuadrado")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                SquareFragment squareFragment = new SquareFragment();
                ft.replace(R.id.frmLyFrag,squareFragment);
                ft.commit();

            }else if(param.equals("Rectangulo")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                RectangleFragment rectangleFragment = new RectangleFragment();
                ft.replace(R.id.frmLyFrag,rectangleFragment);
                ft.commit();
            }else if(param.equals("Trapecio")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                TrapFragment trapFragment = new TrapFragment();
                ft.replace(R.id.frmLyFrag,trapFragment);
                ft.commit();

            }else if(param.equals("Rombo")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                RombFragment rombFragment = new RombFragment();
                ft.replace(R.id.frmLyFrag,rombFragment);
                ft.commit();

            }else if(param.equals("Pentagono")){


                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                PentaFragment pentaFragment = new PentaFragment();
                ft.replace(R.id.frmLyFrag,pentaFragment);
                ft.commit();

            }else if(param.equals("Hexagono")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                HexaFragment hexaFragment = new HexaFragment();
                ft.replace(R.id.frmLyFrag,hexaFragment);
                ft.commit();

            }else if(param.equals("Octagono")){


                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                OctaFragment octaFragment = new OctaFragment();
                ft.replace(R.id.frmLyFrag,octaFragment);
                ft.commit();

            }else if(param.equals("Ovalo")){

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                OvalFragment ovalFragment = new OvalFragment();
                ft.replace(R.id.frmLyFrag,ovalFragment);
                ft.commit();
            }
        }
    }
}
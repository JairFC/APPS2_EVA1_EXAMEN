package com.example.imagenmoviendose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.squareup.picasso.Picasso;

public class Segundo extends AppCompatActivity {
    Button btnRegreso;
    ImageView imgMain,imgLeft,imgRight;
    SeekBar skBar;
    int x=0;
    boolean orientation;//verdadero para horizontal y falso para vertical
    //--Lista con todas las imagenes
    int[] imagenes={R.drawable.a0,R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
//------Devuelve un 1 si se esta vertical y un 2 si se esta en horizontal
        orientation= getResources().getConfiguration().orientation==2;

//--------------- Crea el boton regresar y llama a finsih para destruir el activity-------------
        btnRegreso=findViewById(R.id.btnRegreso);
        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//------Inicializa el imageView
        imgMain=findViewById(R.id.imgVwMain);
        imgLeft=findViewById(R.id.imgVwLeft);
        imgRight=findViewById(R.id.imgVwRight);

//------Inicializa el seek y crea un hilo que acualiza la imagen
        skBar=findViewById(R.id.seekBarImg);

        Runnable vigilarSeek=new Runnable() {
            @Override
            public void run() {

                while(true){
                    imgMain.post(new Runnable() {
                        @Override
                        public void run() {
                            Picasso.get().load(imagenes[x]).into(imgMain);
                        }
                    });
                    if(orientation){
                        imgLeft.post(new Runnable() {
                            @Override
                            public void run() {
                                if(x!=0){
                                    Picasso.get().load(imagenes[x-1]).into(imgLeft);
                                }else{
                                    Picasso.get().load(imagenes[17]).into(imgLeft);
                                }
                            }
                        });
                        imgRight.post(new Runnable() {
                            @Override
                            public void run() {
                                if(x!=17){
                                    Picasso.get().load(imagenes[x+1]).into(imgRight);
                                }else{
                                    Picasso.get().load(imagenes[0]).into(imgRight);
                                }
                            }
                        });
                    }
                    if(x==17)x=0;
                    else x++;
                    try {
                        Thread.sleep(10*skBar.getProgress());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        Thread t1=new Thread(vigilarSeek);
        t1.start();
    }
}
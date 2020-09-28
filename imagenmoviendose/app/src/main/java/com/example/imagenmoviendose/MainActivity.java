package com.example.imagenmoviendose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button img,segunda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.btnImg);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(),Primera.class);
                startActivityForResult(intent,0);
            }
        });
        segunda=findViewById(R.id.btSegunda);
        segunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(v.getContext(), Segundo.class);
                startActivityForResult(intent,0);
            }
        });
    }


}
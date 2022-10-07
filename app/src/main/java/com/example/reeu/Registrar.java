package com.example.reeu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Registrar extends AppCompatActivity {

    private View _bg__registrar_ek2;
    private TextView registro;
    private TextView ingrese_los_siguientes_datos_;
    private TextView dni;
    private TextView nombre;
    private TextView password;
    private Button _rectangle_4;
    private TextView inicia_sesi_n;
    private View rectangle_2;
    private TextView _99999999;
    private View rectangle_3;
    private TextView introduce_tu_contrase_a;
    private TextView ___ya_tienes_cuenta__inicia_sesi_n;
    private View rectangle_5;
    private TextView pablito;
    private ImageView vector;
    private View atras_1;
    private ImageView atras__2__1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        _bg__registrar_ek2 = (View) findViewById(R.id._bg__registrar_ek2);
        registro = (TextView) findViewById(R.id.registro);
        ingrese_los_siguientes_datos_ = (TextView) findViewById(R.id.ingrese_los_siguientes_datos_);
        dni = (TextView) findViewById(R.id.dni);
        nombre = (TextView) findViewById(R.id.nombre);
        password = (TextView) findViewById(R.id.password);
        _rectangle_4 = (Button) findViewById(R.id._rectangle_4);
        //inicia_sesi_n = (TextView) findViewById(R.id.inicia_sesi_n);
        rectangle_2 = (View) findViewById(R.id.rectangle_2);
        _99999999 = (TextView) findViewById(R.id._99999999);
        rectangle_3 = (View) findViewById(R.id.rectangle_3);
        introduce_tu_contrase_a = (TextView) findViewById(R.id.introduce_tu_contrase_a);
        ___ya_tienes_cuenta__inicia_sesi_n = (TextView) findViewById(R.id.___ya_tienes_cuenta__inicia_sesi_n);
        rectangle_5 = (View) findViewById(R.id.rectangle_5);
        pablito = (TextView) findViewById(R.id.pablito);
        vector = (ImageView) findViewById(R.id.vector);
        //atras_1 = (View) findViewById(R.id.atras_1);
        atras__2__1 = (ImageView) findViewById(R.id.atras__2__1);


        _rectangle_4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), Home.class);
                startActivity(nextScreen);


            }
        });


        ___ya_tienes_cuenta__inicia_sesi_n.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), Login.class);
                startActivity(nextScreen);


            }
        });


        //custom code goes here

    }
}
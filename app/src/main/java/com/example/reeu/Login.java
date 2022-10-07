package com.example.reeu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private View _bg__login_ek2;
    private TextView inicio_de_sesi_n;
    private ImageView iniciar_con_tu_cuenta_de_reeu_;
    private ImageView dni_ek1;
    private ImageView password_ek1;
    private ImageView rectangle_4_ek5;
    private Button _rectangle_5_ek1;
    private TextView inicia_sesi_n_ek1;
    private View rectangle_3_ek1;
    private TextView introduce_tu_contrase_a_ek1;
    private TextView ___no_tienes_cuenta__registrate;
    private View rectangle_2_ek1;
    private TextView _999999999;
    private ImageView vector_ek25;
    private ImageView reeu_1;
    private TextView __deja_que_tu_smartphone_sea_el_gerente_de_tu_evento_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicio_de_sesi_n = (TextView) findViewById(R.id.inicio_de_sesi_n);
        iniciar_con_tu_cuenta_de_reeu_ = (ImageView) findViewById(R.id.iniciar_con_tu_cuenta_de_reeu_);
        dni_ek1 = (ImageView) findViewById(R.id.dni_ek1);
        password_ek1 = (ImageView) findViewById(R.id.password_ek1);
        //rectangle_4_ek5 = (ImageView) findViewById(R.id.rectangle_4_ek5);
        _rectangle_5_ek1 = (Button) findViewById(R.id._rectangle_5_ek1);
        //inicia_sesi_n_ek1 = (TextView) findViewById(R.id.inicia_sesi_n_ek1);
        rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
        introduce_tu_contrase_a_ek1 = (TextView) findViewById(R.id.introduce_tu_contrase_a_ek1);
        ___no_tienes_cuenta__registrate = (TextView) findViewById(R.id.___no_tienes_cuenta__registrate);
        rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
        _999999999 = (TextView) findViewById(R.id._999999999);
        //vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
        reeu_1 = (ImageView) findViewById(R.id.reeu_1);
        __deja_que_tu_smartphone_sea_el_gerente_de_tu_evento_ = (TextView) findViewById(R.id.__deja_que_tu_smartphone_sea_el_gerente_de_tu_evento_);


        _rectangle_5_ek1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), Home.class);
                startActivity(nextScreen);


            }
        });


        ___no_tienes_cuenta__registrate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), Registrar.class);
                startActivity(nextScreen);


            }
        });


        //custom code goes here

    }
}
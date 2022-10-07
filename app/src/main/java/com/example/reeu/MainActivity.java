package com.example.reeu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View _bg__welcome_ek2;
    private ImageView unsplash_kdpm1on9jfs;
    private Button botom_portada;
    private TextView comenzar;
    private ImageView reeu_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _bg__welcome_ek2 = (View) findViewById(R.id._bg__welcome_ek2);
        unsplash_kdpm1on9jfs = (ImageView) findViewById(R.id.unsplash_kdpm1on9jfs);
        botom_portada = (Button) findViewById(R.id.botom_portada);
        //comenzar = (TextView) findViewById(R.id.comenzar);
        reeu_1 = (ImageView) findViewById(R.id.reeu_1);


        botom_portada.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), Login.class);
                startActivity(nextScreen);


            }
        });


        //custom code goes here

    }
}

package com.example.reeu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{

    Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if(SharedPrefManager.getInstance(this).isLoggedIn()){


            User user = SharedPrefManager.getInstance(this).getUser();
            buttonLogout.setOnClickListener(this);
        }
        else{
            Intent intent = new Intent(Home.this,Login.class);
            startActivity(intent);
            finish();
        }
    }

    public void onClick(View view){
        if(view.equals(buttonLogout)){
            SharedPrefManager.getInstance(getApplicationContext()).logout();
        }
    }
}
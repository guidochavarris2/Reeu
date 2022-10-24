package com.example.reeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Busqueda_creacion extends AppCompatActivity {

        EditText edtCodigo, edtEvento, edtDescripcion, edtFecha;
        Button btnBuscar;

        RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_creacion);

        edtCodigo=(EditText)findViewById(R.id.edtcodigo);
        edtEvento=(EditText)findViewById(R.id.edtEvento);
        edtDescripcion=(EditText)findViewById(R.id.edtDescripcion);
        edtFecha=(EditText)findViewById(R.id.edtFecha);
        btnBuscar=(Button) findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarEvento("{ingresar tu link}"+edtCodigo.getText()+"");
            }
        });
    }

    private void buscarEvento(String URL) {
        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i= 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        edtEvento.setText(jsonObject.getString("{ingresar tu atributo}"));
                        edtDescripcion.setText(jsonObject.getString("{ingresar tu atributo}"));
                        edtFecha.setText(jsonObject.getString("{ingresar tu atributo}"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Error de conexión", Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }
}
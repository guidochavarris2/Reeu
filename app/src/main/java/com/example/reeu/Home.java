package com.example.reeu;

import static com.android.volley.Request.Method.GET;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Home extends AppCompatActivity implements View.OnClickListener{

    ListView listView;
    Adapter2 adapter2;

    RequestQueue queue;

    SwipeRefreshLayout swipeRefreshLayout;

    public static ArrayList<Usuarios> usuariosArrayList2=new ArrayList<>();
    String url="https://polar-cove-80223.herokuapp.com/estacionamientos.php";
    Usuarios usuarios;

    Button siguiente;

    Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        queue = Volley.newRequestQueue(this);

        listView=findViewById(R.id.lisMostrar);
        adapter2= new Adapter2(this,usuariosArrayList2);
        listView.setAdapter(adapter2);

        leerJSON2();
/*

        if(SharedPrefManager.getInstance(this).isLoggedIn()){


            User user = SharedPrefManager.getInstance(this).getUser();
            buttonLogout.setOnClickListener(this);
        }
        else{
            Intent intent = new Intent(Home.this,Login.class);
            startActivity(intent);
            finish();
        }*/
    }

    private void leerJSON2(){
        String url = "https://polar-cove-80223.herokuapp.com/estacionamientos.php";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {


                        System.out.println("Response: " + response.toString());


                        try {
                            // JSONObject jsonObject = new JSONObject(response);
                            //String exito = jsonObject.getString("exito");

                            //int id2 = (int) listaid.get(listaid.size() - 1);

                            // nuevalista.add(id2);


                            JSONArray agenteJSON=response.getJSONArray("datos");
                            for (int i = 0; i < agenteJSON.length(); i++) {

                                String numcadena = String.valueOf(i);

                                JSONObject animal = agenteJSON.getJSONObject(i);

                                String id = animal.getString("id");
                                //listaid.add(id);
                                String codigo = animal.getString("codigo");
                                String categoria = animal.getString("categoria");

                                System.out.println(id + ", " + codigo + ", " + categoria);

                                usuarios = new Usuarios(id,codigo,categoria);
                                usuariosArrayList2.add(usuarios);
                                adapter2.notifyDataSetChanged();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

        // Access the RequestQueue through your singleton class.
        //Volley.newRequestQueue(this).add(jsonObjectRequest);
        //System.out.println("estos son todos los datos que" + jsonObjectRequest);

        RequestQueue requestQueue =Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
        System.out.println(jsonObjectRequest);
    }


    private HashMap<String, Object> getHashMapFromJson(String json) throws JSONException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        JSONObject jsonObject = new JSONObject(json);
        for (Iterator<String> it = jsonObject.keys(); it.hasNext();) {
            String key = it.next();
            map.put(key, jsonObject.get(key));
        }
        return map;
    }




    public void onClick(View view){
        if(view.equals(buttonLogout)){
            SharedPrefManager.getInstance(getApplicationContext()).logout();
        }
    }
}
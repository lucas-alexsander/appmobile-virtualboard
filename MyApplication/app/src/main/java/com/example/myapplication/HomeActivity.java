package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.Adapter.MateriaAdapter;
import com.example.myapplication.Model.MateriaModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        List<MateriaModel> materias = new ArrayList<>();

        materias.add(new MateriaModel("Banco de dados", "Seg", "19:10",  "22:10", "//"));
        materias.add(new MateriaModel("Engenharia", "Ter", "19:20",  "22:20", "//"));
        materias.add(new MateriaModel("Arquitetura", "Qua", "19:30",  "22:30", "//"));
        materias.add(new MateriaModel("Gestão Projetos", "Qui", "19:30",  "22:30", "//"));
        materias.add(new MateriaModel("Dev Mobile", "Sex", "19:30",  "22:30", "//"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvMaterias);

        RecyclerView.Adapter adapter = new MateriaAdapter(materias);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(lm);

        TextView textView = (TextView) findViewById(R.id.tvHome);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://pokeapi.glitch.me/v1/categories";

        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    // now we get our response from API in json object format.
                    // in below line we are extracting a string with its key
                    // value from our json object.
                    // similarly we are extracting all the strings from our json object.
                    //String courseName = response.getString("courseName");
                    String category = response.getString(0);
                    textView.setText(category);
                    // we are using picasso to load the image from url.
                    //Picasso.get().load(courseImageURL).into(courseIV);
                } catch (JSONException e) {
                    // if we do not extract data from json object properly.
                    // below line of code is use to handle json exception
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            // this is the error listener method which
            // we will call if we get any error from API.
            @Override
            public void onErrorResponse(VolleyError error) {
                // below line is use to display a toast message along with our error.
                Toast.makeText(HomeActivity.this, "Fail to get data..", Toast.LENGTH_SHORT).show();
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);


    }


}
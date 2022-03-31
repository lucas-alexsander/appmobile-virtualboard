package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.MateriaAdapter;
import com.example.myapplication.Model.MateriaModel;

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

    }


}
package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.MateriaModel;
import com.example.myapplication.R;

import java.util.List;

public class MateriaAdapter extends RecyclerView.Adapter<MateriaViewHolder> {

    private List<MateriaModel> materias;


    public MateriaAdapter(List<MateriaModel> materias){
        this.materias = materias;
    }

    @NonNull
    @Override
    public MateriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.materia_view, parent, false);
        MateriaViewHolder vw = new MateriaViewHolder(v);

        return vw;
    }

    @Override
    public void onBindViewHolder(@NonNull MateriaViewHolder holder, int position) {
        TextView tv = holder.viewMateria.findViewById(R.id.materia_textView);
        tv.setText(materias.get(position).getNome());
        tv = holder.viewMateria.findViewById(R.id.week_textView);
        tv.setText(materias.get(position).getDia());
        tv = holder.viewMateria.findViewById(R.id.horaInicio_textView);
        tv.setText(materias.get(position).getHoraInicio()+"");
        tv = holder.viewMateria.findViewById(R.id.horaFim_textView);
        tv.setText(materias.get(position).getHoraFim()+"");
    }


    @Override
    public int getItemCount() {
        return materias.size();
    }
}

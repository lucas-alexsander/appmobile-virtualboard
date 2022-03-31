package com.example.myapplication.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MateriaViewHolder extends RecyclerView.ViewHolder {

    public View viewMateria;

    public MateriaViewHolder(@NonNull View itemView) {
        super(itemView);
        this.viewMateria = itemView;

    }
}

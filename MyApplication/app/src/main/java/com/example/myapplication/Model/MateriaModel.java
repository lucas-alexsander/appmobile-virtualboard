package com.example.myapplication.Model;

import java.util.Objects;

public class MateriaModel {

    String nome;
    String dia;
    String horaInicio;
    String horaFim;
    String imagem;

    public MateriaModel(String nome, String dia, String horaInicio, String horaFim, String imagem) {
        this.nome = nome;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MateriaModel that = (MateriaModel) o;
        return dia == that.dia && horaInicio == that.horaInicio && horaFim == that.horaFim && Objects.equals(nome, that.nome) && Objects.equals(imagem, that.imagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dia, horaInicio, horaFim, imagem);
    }
}

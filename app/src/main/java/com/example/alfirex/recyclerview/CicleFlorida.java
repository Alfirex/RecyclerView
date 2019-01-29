package com.example.alfirex.recyclerview;

public class CicleFlorida {
    private String familiaProfesional;
    private String tipo;
    private String titulo;
    private String descripcion;

    public CicleFlorida(String familiaProfesional, String tipo, String titulo, String descripcion) {
        this.familiaProfesional = familiaProfesional;
        this.tipo = tipo;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getFamiliaProfesional() {
        return familiaProfesional;
    }

    public void setFamiliaProfesional(String familiaProfesional) {
        this.familiaProfesional = familiaProfesional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

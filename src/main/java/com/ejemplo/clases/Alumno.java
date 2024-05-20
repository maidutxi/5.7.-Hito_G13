package com.ejemplo.clases;

public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;

    // Constructor
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }

    }

    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

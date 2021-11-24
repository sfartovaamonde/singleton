package com.dam1;

public class Singleton {

    private String nombre;
    private int edad;

    private Singleton(){


    }
    public static final Singleton getInstance(){

        return getInstance();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }





}



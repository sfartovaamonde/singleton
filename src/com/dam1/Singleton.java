package com.dam1;

public class Singleton {

    private String nombre;
    private int edad;

    private Singleton(){


    }
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Singleton();
        }
        return instance;
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



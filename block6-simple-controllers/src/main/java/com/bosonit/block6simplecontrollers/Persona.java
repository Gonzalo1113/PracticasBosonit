package com.bosonit.block6simplecontrollers;

public class Persona {


    private String nombre;
    private String poblacion;
    private int edad;

    public Persona() {
        this.nombre="";
        this.poblacion="";
        this.edad=0;
    }

    public Persona(String poblacion, int edad, String nombre) {
        this.poblacion = poblacion;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
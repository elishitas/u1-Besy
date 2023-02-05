package com.besysfot.bootcampspringboot.dominio;

public class Persona {

    private String nombre;
    private String apellido;

    /*
        alt + Insert
        Para generar constructores, getter, setter, toString, etc
     */

    //Constructor vacio
    public Persona() {
    }

    //Constructor Inicializado
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Override permite redefinar la representación de texto de un objeto
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}

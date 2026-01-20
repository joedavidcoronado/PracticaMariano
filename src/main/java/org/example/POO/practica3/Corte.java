package org.example.POO.practica3;

public class Corte {
    String nombre;
    int precio;
    int duracion;
    String tipoCabello;

    public Corte(String nombre, int precio, int duracion, String tipoCabello) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tipoCabello = tipoCabello;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getTipoCabello() {
        return tipoCabello;
    }
}

package org.example.POO.practica3;

public class Persona {
    String nombre;
    String tipoCabello;
    String colorCabello;
    int dinero;

    public Persona(String nombre, String tipoCabello, String coloCabello, int dinero) {
        this.nombre = nombre;
        this.tipoCabello = tipoCabello;
        this.colorCabello = coloCabello;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCabello() {
        return tipoCabello;
    }

    public void setTipoCabello(String tipoCabello) {
        this.tipoCabello = tipoCabello;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String coloCabello) {
        this.colorCabello = coloCabello;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}

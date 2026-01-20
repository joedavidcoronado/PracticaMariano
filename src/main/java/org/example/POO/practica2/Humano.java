package org.example.POO.practica2;

public class Humano {
    // ATRIBUTOS
    String nombre;
    double vida;
    int valor;
    double daño;

    // CONSTRUCTOR
    public Humano(String nombre, double vida, int valor, double daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.valor = valor;
        this.daño = daño;
    }

    //METODOS
    public double hacerDaño(){
        return daño;
    }
}

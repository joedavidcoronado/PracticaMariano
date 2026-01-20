package org.example.POO.practica2;

public class Monstruo {
    // ATRIBUTOS
    String nombre;
    double vida;
    int valor;
    double daño;
    int poderes;

    // CONSTRUCTOR


    public Monstruo(String nombre, double vida, int valor, double daño, int poderes) {
        this.nombre = nombre;
        this.vida = vida;
        this.valor = valor;
        this.daño = daño;
        this.poderes = poderes;
    }

    //METODOS
    public double hacerDaño(){
        return daño * 0.3;
    }
}

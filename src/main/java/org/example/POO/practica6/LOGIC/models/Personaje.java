package org.example.POO.practica6.LOGIC.models;

import org.example.POO.practica6.LOGIC.interfaces.MetodosPeleas;

public class Personaje {
    // Atributos
    private String nombre;
    private int vida;
    private int danio;

    // Metodos
    public Personaje(String nombre, int vida, int danio) {
        this.nombre = nombre;
        this.vida = vida;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

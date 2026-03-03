package org.example.POO.practica6.LOGIC.models;

import org.example.POO.practica6.LOGIC.interfaces.MetodosPeleas;

public class Humano extends Personaje implements MetodosPeleas {

    private int valentia;

    public Humano(String nombre, int vida, int danio, int valentia) {
        super(nombre, vida, danio);
        this.valentia = valentia;
    }

    public int getValentia() {
        return valentia;
    }

    public void setValentia(int valentia) {
        this.valentia = valentia;
    }

    @Override
    public void golpear() {

    }

    @Override
    public void restarVida(int danio) {
        setVida(getVida()-danio);
    }
}

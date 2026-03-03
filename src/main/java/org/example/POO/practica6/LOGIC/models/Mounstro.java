package org.example.POO.practica6.LOGIC.models;

import org.example.POO.practica6.LOGIC.interfaces.MetodosPeleas;

public class Mounstro extends Personaje implements MetodosPeleas {

    private int rugido;

    public Mounstro(String nombre, int vida, int danio, int rugido) {
        super(nombre, vida, danio);
        this.rugido = rugido;
    }

    public int getRugido() {
        return rugido;
    }

    public void setRugido(int rugido) {
        this.rugido = rugido;
    }

    @Override
    public void golpear() {

    }

    @Override
    public void restarVida(int danio) {
        setVida(getVida()-danio);
    }
}

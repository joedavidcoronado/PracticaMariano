package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Perro extends Animal implements CosasDeAnimales{

    boolean cazador;

    public Perro(String nombre, int edad, double peso, String ultimaVisita, Especie especie, String[] condiciones, String nombreDueño, boolean cazador) {
        super(nombre, edad, peso, ultimaVisita, especie, condiciones, nombreDueño);
        this.cazador = cazador;
    }

    public Perro(String nombre, int edad, double peso, Especie especie, String[] condiciones) {
        super(nombre, edad, peso, especie, condiciones);
    }

    @Override
    public void hacerSonido() {
        System.out.println("GUAU GUAU");
    }

    @Override
    public void hacerDaño() {
        System.out.println("morder");
    }
}

package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Gato extends Animal implements CosasDeAnimales{
    //ATRIBUTOS
    int vidas;

    public Gato(String nombre, int edad, double peso, Especie especie, String[] condiciones, int vidas) {
        super(nombre, edad, peso, especie, condiciones);
        this.vidas = vidas;
    }

    public Gato(String nombre, int edad, double peso, String ultimaVisita, Especie especie, String[] condiciones, String nombreDueño) {
        super(nombre, edad, peso, ultimaVisita, especie, condiciones, nombreDueño);
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("MIAU MIAU");
    }

    @Override
    public void hacerDaño() {
        System.out.println("arañar");
    }
}

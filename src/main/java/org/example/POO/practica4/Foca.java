package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Foca extends Animal implements CosasDeAnimales{
    //ATRIBUTOS
    int respiracionTime;

    //Constructor normal
    public Foca(String nombre, int edad, double peso, String ultimaVisita, Especie especie, String[] condiciones, String nombreDueño, int respiracionTime) {
        super(nombre, edad, peso, ultimaVisita, especie, condiciones, nombreDueño);
        this.respiracionTime = respiracionTime;
    }

    //Constructor de emergencias
    public Foca(String nombre, int edad, double peso, Especie especie, String[] condiciones) {
        super(nombre, edad, peso, especie, condiciones);
    }

    public int getRespiracionTime() {
        return respiracionTime;
    }

    public void setRespiracionTime(int respiracionTime) {
        this.respiracionTime = respiracionTime;
    }

    @Override
    public void hacerSonido() {
        System.out.println("GRRRRRRRR");
    }

    @Override
    public void hacerDaño() {
        System.out.println("Abrazar");
    }
}

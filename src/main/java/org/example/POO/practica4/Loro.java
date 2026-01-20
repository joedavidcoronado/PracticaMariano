package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Loro extends Animal implements CosasDeAnimales{
    String colorPlumas;

    public Loro(String nombre, int edad, double peso, String ultimaVisita, Especie especie, String[] condiciones, String nombreDueño, String colorPlumas) {
        super(nombre, edad, peso, ultimaVisita, especie, condiciones, nombreDueño);
        this.colorPlumas = colorPlumas;
    }

    public Loro(String nombre, int edad, double peso, Especie especie, String[] condiciones) {
        super(nombre, edad, peso, especie, condiciones);
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Volanding***");
    }

    @Override
    public void hacerDaño() {
        System.out.println("Picotear");
    }
}

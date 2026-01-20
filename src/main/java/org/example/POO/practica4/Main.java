package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Main {
    public static void main(String[] args) {
        // HERENCIA: Se pasan todos los atributos y los metodos de una clase a otra

        // Somos una veterinaria
        // Tenemos: perros, gatos, loros, focas

        Perro perro = new Perro("toby", 4, 30.4, "30/12/24", Especie.PERRO, new String[]{"fiebre", "no come"}, "Juan", true);
        perro.hacerSonido();

        /*
        for(int i = 0; i < perro.getCondiciones().length; i++){
            System.out.println(perro.getCondiciones()[i]);
        }
        */
    }
}

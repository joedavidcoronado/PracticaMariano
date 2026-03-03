package org.example.POO.practica6;

import org.example.POO.practica6.LOGIC.models.Humano;
import org.example.POO.practica6.LOGIC.models.Mounstro;
import org.example.POO.practica6.UI.windows.PeleaFrame;

public class Main {
    public static void main(String[] args) {

        Mounstro mounstro = new Mounstro("Mariano", 100, 20, 30);
        Humano humano = new Humano("Joe", 80, 15, 10);

        PeleaFrame peleaFrame = new PeleaFrame(humano, mounstro);

    }
}

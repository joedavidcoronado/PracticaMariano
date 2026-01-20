package org.example.POO.practica5;

import org.example.POO.practica5.hijas.Generador;
import org.example.POO.practica5.hijas.Licuadora;
import org.example.POO.practica5.hijas.Microondas;
import org.example.POO.practica5.padre.AparatoElectronico;

public class Main {
    public static void main(String[] args) {

        //esto es para iniciar el generador
        AparatoElectronico microondas = new Microondas(
                "Microondas",
                34.6,
                20,
                6
        );

        //ACA INICIALIZAMOS EL GENERADOR
        Generador generador = new Generador(
                "HOSTER",
                3,
                23.5,
                100,
                new AparatoElectronico[]{microondas}
        );

        //Intento agregar aparatos
        AparatoElectronico licuadora = new Licuadora(
                "Licuadora",
                25.6,
                30,
                4,
                5,
                7
        );
        generador.conectar(licuadora);

        AparatoElectronico microondas2 = new Microondas(
                "Microondas2",
                34.6,
                60,
                6
        );
        generador.conectar(microondas2);


    }
}

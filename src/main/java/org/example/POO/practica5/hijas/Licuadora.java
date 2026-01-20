package org.example.POO.practica5.hijas;

import org.example.POO.practica5.interfaces.Metodos;
import org.example.POO.practica5.padre.AparatoElectronico;

public class Licuadora extends AparatoElectronico implements Metodos {

    private int cuchillas;
    private int capacidadKg;

    public Licuadora(String marca, double precio, int consumoElectrico, int añosGarantia, int cuchillas, int capacidadKg) {
        super(marca, precio, consumoElectrico, añosGarantia);
        this.cuchillas = cuchillas;
        this.capacidadKg = capacidadKg;
    }

    @Override
    public void consumoEnergia() {
        System.out.println("Consume poco y tampoco de forma intensa");
    }

    @Override
    public void formaDeDañarse() {
        System.out.println("No se puede limpiar");
    }
}

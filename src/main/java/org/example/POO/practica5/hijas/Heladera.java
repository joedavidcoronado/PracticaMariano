package org.example.POO.practica5.hijas;

import org.example.POO.practica5.interfaces.Metodos;
import org.example.POO.practica5.padre.AparatoElectronico;
import org.example.POO.practica5.utils.Tipo;

public class Heladera extends AparatoElectronico implements Metodos {

    private int puertas;
    private Tipo tipo;

    public Heladera(String marca, double precio, int consumoElectrico, int añosGarantia, int puertas,  Tipo tipo) {
        super(marca, precio, consumoElectrico, añosGarantia);
        this.puertas = puertas;
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void consumoEnergia() {
        System.out.println("Consume mucho pero de forma regular");
    }

    @Override
    public void formaDeDañarse() {
        System.out.println("Se apaga/No enfria");
    }
}

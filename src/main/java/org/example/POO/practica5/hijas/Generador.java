package org.example.POO.practica5.hijas;

import org.example.POO.practica5.interfaces.Metodos;
import org.example.POO.practica5.padre.AparatoElectronico;

import java.util.Arrays;

public class Generador extends AparatoElectronico implements Metodos {

    private int capacidadMaxima;
    private AparatoElectronico[] aparatosConectados;

    public Generador(String marca, int añosGarantia, double precio, int capacidadMaxima, AparatoElectronico[] aparatosConectados) {
        super(marca, añosGarantia, precio);
        this.capacidadMaxima = capacidadMaxima;
        this.aparatosConectados = aparatosConectados;
    }

    public void conectar(AparatoElectronico aparatoElectronico){

        int espacioDisponible = capacidadMaxima;

        //Para saber en realidad cuanto tengo de espacio
        for (int i = 0; i < aparatosConectados.length; i ++){
            espacioDisponible = espacioDisponible - aparatosConectados[i].getConsumoElectrico();
        }

        //
        if(espacioDisponible < aparatoElectronico.getConsumoElectrico()){
            System.out.println("no se puede conectar el aparato, no hay espacio");
        }else{
            //Las 2 lineas de abajo son para agregar algo a ese array nativo
            aparatosConectados = Arrays.copyOf(aparatosConectados, aparatosConectados.length + 1);
            aparatosConectados[aparatosConectados.length - 1] = aparatoElectronico;

            System.out.println("Se conectó el/la " + aparatoElectronico.getMarca() + " y quedan " + (espacioDisponible - aparatoElectronico.getConsumoElectrico()) + " ws de espacio");
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public AparatoElectronico[] getAparatosConectados() {
        return aparatosConectados;
    }
    public void setAparatosConectados(AparatoElectronico[] aparatosConectados) {
        this.aparatosConectados = aparatosConectados;
    }

    @Override
    public void consumoEnergia() {
        System.out.println("no consume");
    }

    @Override
    public void formaDeDañarse() {
        System.out.println("le meten muchos aparatos");
    }
}

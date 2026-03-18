package org.example.POO.practica8;

import org.example.POO.practica8.miLista.CalculadoraDeVectores;
import org.example.POO.practica8.miLista.Lista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        //EJEMPLO DE LISTA HECHA POR JAVA
        ArrayList<String> datosClima = new ArrayList<>();

        datosClima.add("humedad: 12");
        datosClima.add("Presion: 56");

        for(String nombre: datosClima){
            System.out.println(nombre);
        }
        */

        //EJEMPLO DE LISTA HECHA POR NOSOTROS
        Lista listaV = new Lista();  //Creo una lista vacia

        listaV.agregarNodo(100);
        listaV.agregarNodo(45);
        listaV.agregarNodo(92);
        listaV.agregarNodo(34);

        Lista listaU = new Lista();  //Creo una lista vacia

        listaU.agregarNodo(10);
        listaU.agregarNodo(56);
        listaU.agregarNodo(12);
        listaU.agregarNodo(89);

        CalculadoraDeVectores calculadoraDeVectores = new CalculadoraDeVectores();

        calculadoraDeVectores.calcularSimilitud(listaV, listaU);
        
    }
}

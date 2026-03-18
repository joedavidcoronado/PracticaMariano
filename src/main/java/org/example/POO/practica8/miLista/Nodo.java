package org.example.POO.practica8.miLista;

public class Nodo {
    int valor;
    Nodo siguiente;  //Conexion con otros nodos

    public Nodo(int valor) {   //Metodo constructor (para crear el objeto)
        this.valor = valor;
        this.siguiente = null;
    }
}

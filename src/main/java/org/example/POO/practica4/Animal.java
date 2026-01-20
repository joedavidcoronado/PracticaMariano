package org.example.POO.practica4;

import org.example.POO.practica4.utils.Especie;

public class Animal {

    //ATRIBUTOS
    String nombre;
    int edad;
    double peso;
    String ultimaVisita;
    Especie especie;
    String[] condiciones;
    String nombreDueño;

    //METODOS

    //Constructor de registro regular
    public Animal(
            String nombre,
            int edad,
            double peso,
            String ultimaVisita,
            Especie especie,
            String[] condiciones,
            String nombreDueño
    ){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.ultimaVisita = ultimaVisita;
        this.especie = especie;
        this.condiciones = condiciones;
        this.nombreDueño = nombreDueño;
    }

    //Constructor de emergencia
    public Animal(String nombre, int edad, double peso, Especie especie, String[] condiciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.condiciones = condiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUltimaVisita() {
        return ultimaVisita;
    }

    public void setUltimaVisita(String ultimaVisita) {
        this.ultimaVisita = ultimaVisita;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String[] getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String[] condiciones) {
        this.condiciones = condiciones;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
}


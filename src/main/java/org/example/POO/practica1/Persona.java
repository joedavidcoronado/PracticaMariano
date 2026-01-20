package org.example.POO.practica1;

public class Persona {
    // ATRIBUTOS
    String nombre;
    int edad;
    int extremidades;
    boolean masista;

    // Metodo constructor (es como usar el molde)
    public Persona(String nombre, int edad, int extremidades, boolean masista){
        this.nombre = nombre;
        this.edad = edad;
        this.extremidades = extremidades;
        this.masista = masista;
    }
    // se pueden hacer varios metodos constructores dependiendo de la necesidad
    public Persona(int edad){
        this.edad = edad;
    }

    // METODOS
    public void caminar(){
        System.out.println("Hola estoy caminando");
    }

    public void respirar(){
        System.out.println("Hola estoy respirando");
    }

    public String irAClases(Boolean bañarse){
        if(bañarse == false){
            return "no vas a la U";
        }else{
            return "vas a la U";
        }
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

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public boolean isMasista() {
        return masista;
    }

    public void setMasista(boolean masista) {
        this.masista = masista;
    }
}

package org.example.POO.practica8.miLista;

public class CalculadoraDeVectores {

    public void calcularSimilitud(Lista v, Lista u){
        double similitud = calcularProductoPunto(v,u)/(v.calcularModulo() * u.calcularModulo());

        if(similitud >= 0.00){
            System.out.println("Son IGUALES " + "("+similitud+")");
        }
        if (similitud == 0){
            System.out.println("Son DIFERENTES " + "("+similitud+")");
        }
        if (similitud <= 0){
            System.out.println("Son OPUESTOS " + "("+similitud+")");
        }
    }

    public double calcularProductoPunto(Lista v, Lista u){

        int escalar = 0;

        Nodo actual1 = v.getCabeza();
        Nodo actual2 = u.getCabeza();

        while(actual1.siguiente != null && actual2.siguiente != null){
            actual1 = actual1.siguiente;
            actual2 = actual2.siguiente;
            escalar = escalar + (actual1.valor * actual2.valor);
        }
        return escalar;
    }
}

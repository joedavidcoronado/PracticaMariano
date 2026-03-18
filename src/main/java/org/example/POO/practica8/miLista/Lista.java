package org.example.POO.practica8.miLista;

public class Lista {   // LISTA = VECTORES

    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;   //Cuando creo la lista, está vacia
    }

    public void agregarNodo(int valor){    //Pido el valor
        Nodo nuevoNodo = new Nodo(valor);  //Inicio  el nodo con ese valor
        if(cabeza == null){                //Pregunto si la cabeza esta vacia
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;   // recorrer la lista hasta que llego al altimo
            }
            actual.siguiente = nuevoNodo;    //Une los bagones del tren
        }
    }

    public void eliminar(int valor){  //Valor es la posicion o el numero del nodo (ejmplo: elimina el nodo3)
        if (cabeza == null) return;   //Sino hay cabeza la lista está vacia y no retorno nada
        if(cabeza.valor == valor){
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while(actual.siguiente != null){
            if(actual.siguiente.valor == valor){
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void imprimir(){
        Nodo actual = cabeza;
        while(actual != null){
            System.out.print(actual.valor + "-->");
            actual = actual.siguiente;
        }
        System.out.println("Ese era el ultimo");
    }

    public double calcularModulo(){
        int modulo = 0;

        Nodo actual = cabeza;

        while(actual.siguiente != null){
            actual = actual.siguiente;
            modulo = modulo + (actual.valor * actual.valor);
        }

        return Math.sqrt(modulo);
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
}

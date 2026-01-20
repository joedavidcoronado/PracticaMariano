package org.example.LINEAL;

public class Main {

    public static void main(String[] args) {

        //Metodos de String

        String nombre ="Juan Carlos de las Casas Mariano Matinez de Leones";

        // El metodo .length() mide la longitud de la cadena y me la da en int
        int longitudCadena = nombre.length();
        // El metodo .charAt() selecciona el caracter en la posicion X
        char caracterDeCadena = nombre.charAt(4);
        // El metodo .equals() compara strings
        // nombre.equals("juan")
        // El metodo .toLowerCase() convierte todo a minusculas
        String hola = "HoLa";
        String result = hola.toLowerCase();
        // El metodo .toUpperCase() convierte todo a minusculas
        String hola2 = "HoLa";
        String result2 = hola2.toUpperCase();


        //EJERCICIO: Quiero que se analice la variable "cadena" y tienes que darme el
        //numero de letras "a" que haya en ese texto

        String cadena = "Habia una vez un barquito chiquitito que no podia navegar";

        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'w'){
                cantidad = cantidad + 1;
            }else{
                System.out.print("");
            }
        }
        System.out.println("hay " + cantidad + " de letras 'a'");
    }
}




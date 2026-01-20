package org.example.LINEAL;

import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {

        //Las estructuras de control que hemos visto son 4

        //Primera: If, condicion de 2 salidas
        //if (int b == int c)

        //Segunda: For, bucle que se detiene en un numero especifico
        //for (inicio del contador; hasta donde...; incremento/decremento)

        //Tercera: While, bucle con una condicion para detenerse
        //while (seguir == true)

        //Cuarta: Swicth, condicion con varios caminos
        //swicth (variable)
            // case 1:
            //      lo que vamos a hacer
            //      break;


        //EJERCICIO MAMALON:
        //Quiero un menú con 7 opciones
            //opcion #1: ingresar un numero y que me de la tabla de multiplicar
            //hasta el 10
            //opcion #2: ingresar un nombre y que me diga cuantas letras tiene,
            //cuantas vocales y cuantas letras mayusculas
            //opcion #3: ingresar un numero y que me diga si es par o impar
            //opcion #4: ingresar un texto y que me lo imprima en mayusculas
            //opcion #5: ingresar un texto y que me lo imprima en minusculas
            //opcion #6: ingresar un texto y que me imprima cuantas letras M hay
            //opcion #7: Reinicar al menu principal

        Scanner leer = new Scanner(System.in);
        boolean seguir = true;


        while (seguir == true ){

            System.out.println("MENU");
            System.out.println("OPCION 1");
            System.out.println("OPCION 2");
            System.out.println("OPCION 3");
            System.out.println("OPCION 4");
            System.out.println("OPCION 5");
            System.out.println("OPCION 6");
            System.out.println("OPCION 7");
            int menu= leer.nextInt();
            switch (menu){
                case 1:
                    //opcion #1: ingresar un numero y que me de la tabla de multiplicar
                    System.out.println("Ingrese un numero: ");
                    int multiplicar = leer.nextInt();
                    for (int i = 1; i < 10; i++) {
                        System.out.println(i*multiplicar);
                    }
                    seguir = false;
                    break;
                case 2:
                    //opcion #2: ingresar un nombre y que me diga cuantas letras tiene,
                    //cuantas vocales
                    System.out.println("Ingrese un nombre: ");
                    String nombre = leer.next();
                    System.out.println(nombre.length());
                    int vocales = 0;
                    for (int i = 0; i < nombre.length(); i++) {
                        if (nombre.charAt(i) == 'a' || nombre.charAt(i) == 'A' ) {
                            vocales = vocales +1;
                        }
                        if (nombre.charAt(i) == 'e' || nombre.charAt(i) == 'E' ) {
                            vocales = vocales +1;
                        }
                        if (nombre.charAt(i) == 'i' || nombre.charAt(i) == 'I' ) {
                            vocales = vocales +1;
                        }
                        if (nombre.charAt(i) == 'o' || nombre.charAt(i) == 'O' ) {
                            vocales = vocales +1;
                        }
                        if (nombre.charAt(i) == 'u' || nombre.charAt(i) == 'U' ) {
                            vocales = vocales +1;
                        }
                    }
                    System.out.println("hay " + vocales + " vocales");
                    seguir = false;
                    break;
                case 3:
                    //opcion #3: ingresar un numero y que me diga si es par o impar
                    //Si la condición numero % 2 == 0 es falsa, significa que el resto no es cero, por lo tanto, el número es impar.
                    System.out.println("Ingrese un numero");
                    int numero = leer.nextInt();
                    if (numero % 2 == 0){
                        System.out.println("es par");
                    }else{
                        System.out.println("es impar");
                    }
                    seguir = false;
                    break;
                case 4:
                    //opcion #4: ingresar un texto y que me lo imprima en
                    System.out.println("Ingrese un texto");
                    String texto = leer.next();
                    System.out.println(texto.toLowerCase());
                    seguir = false;
                    break;
                case 5:
                    System.out.println("Ingrese un texto");
                    String texto2 = leer.next();
                    System.out.println(texto2.toUpperCase());
                    seguir = false;
                    break;
                case 6:
                    //opcion #6: ingresar un texto y que me imprima cuantas letras M hay
                    System.out.println("Ingrese un texto");
                    String texto3= leer.next();
                    int contador = 0;
                    for (int i = 0; i < texto3.length(); i++) {
                        if (texto3.charAt(i) == 'M' || texto3.charAt(i) == 'm' ){
                            contador = contador + 1;
                        }
                    }
                    System.out.println(contador);
                    seguir = false;
                    break;
                case 7:
                    System.out.println("REINICIOOOOOOOOOOOO");
                    seguir = true;
                    break;
                default:
                    System.out.println("no seas tonto, no tecleaste bien");
                    break;
            }
        }
    }
}

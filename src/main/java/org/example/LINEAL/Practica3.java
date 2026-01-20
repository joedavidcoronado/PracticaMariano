package org.example.LINEAL;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Practica: Hacer un proyecto que me de un menu con 3 opciones
        //opcion1: colocar mi nombre y contar las vocales
        //opcion2: cambie mi nombre a mayusculas
        //opcion3: me imprima cuantas letras hay en mi nombre
        //opcion4: que me diga que soy un imbecil
        //reiniciar

        boolean seguir = true;

        while(seguir == true){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_______________BIENVENIDO A TU PROGRAMA_______________");
            System.out.println("Selecciona una opcion");
            System.out.println("1. Contar Vocales");
            System.out.println("2. Cambiar a Mayusculas");
            System.out.println("3. Cantidad de letras");
            System.out.println("4. Decirte que eres imbecil");
            System.out.println("5. Reiniciar");
            System.out.println("______________________________________________________");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    //contador de vocales
                    System.out.println("______________________________________________________");
                    System.out.println("Ingresa un nombre");
                    System.out.println("______________________________________________________");
                    String nombre = leer.next();
                    int contador1 = 0;
                    for(int i = 0; i < nombre.length(); i ++){
                        if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'A'){
                            contador1 = contador1 + 1;
                        }
                        if(nombre.charAt(i) == 'e' || nombre.charAt(i) == 'E'){
                            contador1 = contador1 + 1;
                        }
                        if(nombre.charAt(i) == 'i' || nombre.charAt(i) == 'I'){
                            contador1 = contador1 + 1;
                        }
                        if(nombre.charAt(i) == 'o' || nombre.charAt(i) == 'O'){
                            contador1 = contador1 + 1;
                        }
                        if(nombre.charAt(i) == 'u' || nombre.charAt(i) == 'U'){
                            contador1 = contador1 + 1;
                        }
                    }
                    System.out.println("en el nombre hay " + contador1 + " vocales");
                    seguir = false;
                    break;
                case 2:
                    //cambiar a mayusculas
                    System.out.println("______________________________________________________");
                    System.out.println("Ingresa un nombre");
                    System.out.println("______________________________________________________");
                    String cadena = leer.next();
                    System.out.println("______________________________________________________");
                    System.out.println(cadena.toUpperCase());
                    seguir = false;
                    break;
                case 3:
                    //cantidad de letras
                    System.out.println("______________________________________________________");
                    System.out.println("Ingresa un nombre");
                    System.out.println("______________________________________________________");
                    String cantidad = leer.next();
                    System.out.println("______________________________________________________");
                    System.out.println(cantidad.length());
                    seguir = false;
                    break;
                case 4:
                    System.out.println("Eres un imbecil");
                    seguir = false;
                    break;
                case 5:
                    System.out.println("chau");
                    seguir = true;
                    break;
                default:
                    System.out.println("no es ninguno de los anteriores");
                    break;
            }
        }
    }
}

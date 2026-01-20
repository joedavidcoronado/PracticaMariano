package org.example.LINEAL;
import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.nextLine();
        
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
    }
}

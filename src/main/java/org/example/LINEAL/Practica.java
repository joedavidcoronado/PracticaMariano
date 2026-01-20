package org.example.LINEAL;

public class Practica {
    public static void main(String[] args) {

        /*
         EJERCICIO FINAL:
            - En una pelea de lucha libre hay 2 peleadores
                * Juan Hernandez
                * Manuel Alexander
            - Necesito un sistema que me diga cual es el nombre mas largo entre los 2
            - que luego de eso me diga cuantas vocales hay en cada nombre
            - y finalmente que me diga si hay un peleador que tiene mas vocales que el
              otro ese gana
         */

        String peleador1= "Juan Hernandez";
        String peleador2= "Manuel Alexander";

        //modulo 1
        if(peleador1.length() < peleador2.length()){
            System.out.println("El pelador 2 es mayor");
        }else{
            System.out.println("El pelador 1 es mayor");
        }

        //modulo 2

        int contador1 = 0;
        int contador2 = 0;

        for(int i = 0; i < peleador1.length(); i ++){
            if(peleador1.charAt(i) == 'a' || peleador1.charAt(i) == 'A'){
                contador1 = contador1 + 1;
            }
            if(peleador1.charAt(i) == 'e' || peleador1.charAt(i) == 'E'){
                contador1 = contador1 + 1;
            }
            if(peleador1.charAt(i) == 'i' || peleador1.charAt(i) == 'I'){
                contador1 = contador1 + 1;
            }
            if(peleador1.charAt(i) == 'o' || peleador1.charAt(i) == 'O'){
                contador1 = contador1 + 1;
            }
            if(peleador1.charAt(i) == 'u' || peleador1.charAt(i) == 'U'){
                contador1 = contador1 + 1;
            }
        }
        System.out.println("en el pelador 1 hay " + contador1 + " vocales");

        for(int i = 0; i < peleador2.length(); i ++){
            if(peleador2.charAt(i) == 'a' || peleador2.charAt(i) == 'A'){
                contador2 = contador2 + 1;
            }
            if(peleador2.charAt(i) == 'e' || peleador2.charAt(i) == 'E'){
                contador2 = contador2 + 1;
            }
            if(peleador2.charAt(i) == 'i' || peleador2.charAt(i) == 'I'){
                contador2 = contador2 + 1;
            }
            if(peleador2.charAt(i) == 'o' || peleador2.charAt(i) == 'O'){
                contador2 = contador2 + 1;
            }
            if(peleador2.charAt(i) == 'u' || peleador2.charAt(i) == 'U'){
                contador2 = contador2 + 1;
            }
        }
        System.out.println("en el pelador 2 hay " + contador2 + " vocales");

        //modulo 3
        if (contador1 < contador2){
            System.out.println("El peleador 2 gana!!!");
        }else{
            System.out.println("El peleador 1 gana!!!");
        }

        //modulo 4: Saber solo el nombre
        String nombre = "";

        for (int i = 0; i < peleador1.length(); i++) {
            if (peleador1.charAt(i) != ' '){
                nombre = nombre + peleador1.charAt(i);
            }else{
                System.out.println(nombre);
                return;
            }
        }
    }
}

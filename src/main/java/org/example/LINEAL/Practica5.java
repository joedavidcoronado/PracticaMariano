package org.example.LINEAL;

public class Practica5 {
    public static void main(String[] args) {

        //LEER EL CODIGO

        boolean enunciado = true;
        if (enunciado == false){
            System.out.println("eres un mentiroso");
        }else{
            String honesto = "Soy honesto";
            int mentiras = 0;
            for (int i = 0; i < honesto.length(); i++) {
                if (honesto.charAt(i) == 'h'){
                    System.out.println("hola como estas");
                }else if(honesto.charAt(i) == 'j'){
                    System.out.println("no se que hago");
                }else{
                    System.out.println("menitra");
                }
            }
        }

    }
}

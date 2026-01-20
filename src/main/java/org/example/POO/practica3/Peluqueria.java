package org.example.POO.practica3;
import java.util.Scanner;

public class Peluqueria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.println("BIENVENIDO A LA BARBERIA MARIANO");
        System.out.println("_________________________________");
        System.out.println("Cual es tu nombre?");
        String nombre = leer.next();
        System.out.println("_________________________________");
        System.out.println("Cual es tu tipo de cabello?");
        String tipoCabello = leer.next();
        System.out.println("_________________________________");
        System.out.println("Cual es tu color de cabello?");
        String colorCabello = leer.next();
        System.out.println("_________________________________");
        System.out.println("Cuanto tienes?");
        int dinero = leer.nextInt();
        System.out.println("_________________________________");

        Persona persona = new Persona(
                nombre,
                tipoCabello.toLowerCase(),
                colorCabello,
                dinero
        );

        System.out.println("EXCELENTEEEEEEEEE, veamos si se puede");

        Corte corte = new Corte(
            "Moicano",
            100,
            12,
            "lizo"
        );

        // SE CORTA LA PRIMERA VEZ
        cortar(persona, corte);

    }

    public static void cortar(Persona persona, Corte corte){
        if(persona.getDinero() >= corte.getPrecio()){
            if(persona.getTipoCabello().equals(corte.getTipoCabello())){
                System.out.println("corte listo");
                persona.setDinero(persona.getDinero() - corte.getPrecio());
            }else{
                System.out.println("no es posible por tu tipo de cabello");
            }

        }else{
            System.out.println("no tienes plata mi rey");
        }

    }
}

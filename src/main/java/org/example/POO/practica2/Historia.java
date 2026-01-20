package org.example.POO.practica2;

public class Historia {
    public static void main(String[] args) {
        Humano humano = new Humano(
                "Mariano el Destrcutor",
                1.00,
                100,
                0.8
                );
        Monstruo monstruo = new Monstruo(
                "Joe el come niños",
                12.00,
                70,
                1.1,
                2
        );

        pelear(humano, monstruo);
        celebrar();
    }

    public static void pelear(Humano humano, Monstruo monstruo){
        int turno = 1;

        double vidaHumano = humano.vida;
        double vidaMonstruo = monstruo.vida;
        while (humano.vida > 0 && monstruo.vida > 0){ //pelear hasta la muerte
            //__________________________________________________
            //Vemos que turno va
            System.out.println("Vamos por el turno #" + turno);


            //Ataca el humano primero y baja la vida del monstruo
            vidaMonstruo = vidaMonstruo-humano.daño;
            // Verifico si se murió el monstruo
            if (vidaMonstruo <= 0) {
                System.out.println("\n" + humano.nombre + " GANA LA PELEA");
                return;
            }

            //El monstrou ataca
            vidaHumano = vidaHumano-monstruo.daño;
            //Verifico si se murio
            if (vidaHumano <= 0) {
                System.out.println("\n" + monstruo.nombre + " GANA LA PELEA");
                return;
            }

            turno++;
        }
    }

    public static void celebrar(){
        System.out.println("POR FIN ACABO LA PELEAAAAAAAA");
    }
}

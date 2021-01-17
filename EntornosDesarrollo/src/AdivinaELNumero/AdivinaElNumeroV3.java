
package AdivinaELNumero;

import java.util.Scanner;

public class AdivinaElNumeroV3 {

    public int saldoMaquina = 1000;
    public int saldoUsuario = 500;
    public void juego() {

        int numAleatorio = (int) (Math.random() * 10);
        boolean salir = false;
        int intentosUsuario = 0;
        int[] entradasArray = new int[10];

        System.out.println("Introduzca el dinero que quiera apostar");

        Scanner eurSc = new Scanner(System.in);
        int entradaEurUsuario = eurSc.nextInt();
        int dineroEnJuego;

        if (entradaEurUsuario > 0 && entradaEurUsuario < saldoUsuario){
            saldoUsuario -= entradaEurUsuario;
            System.out.println("Introduzca un numero entre 0 y 99");
            do {

                Scanner sc = new Scanner(System.in);
                int entradaUsuario = sc.nextInt();
                intentosUsuario++;
                entradasArray[intentosUsuario - 1] = entradaUsuario;

                if (intentosUsuario < 5) {
                    if (numAleatorio == entradaUsuario) {

                        dineroEnJuego = entradaEurUsuario *5;
                        saldoUsuario += dineroEnJuego + entradaUsuario;
                        saldoMaquina -= dineroEnJuego;

                        System.out.println("Correcto era el numero " + numAleatorio + " lo has logrado en " + intentosUsuario + " intentos.");
                        System.out.println("Y has usado los siguientes numeros: ");

                        for (int i = 0; i < intentosUsuario; i++) {
                            System.out.print(" " + entradasArray[i] + ", ");
                        }

                        System.out.println(" ");
                        System.out.println("Saldo maquina " + saldoMaquina);
                        System.out.println("Saldo usuario " + saldoUsuario);

                        salir = true;

                    } else {

                        System.out.println("Prueba otra vez ");

                        if (entradaUsuario > numAleatorio) {

                            System.out.println("El numero es mas pequeno que " + entradaUsuario);
                        } else {

                            System.out.println("El numero es mas grande que " + entradaUsuario);
                        }
                    }
                } else {

                    saldoUsuario -= entradaEurUsuario;
                    saldoMaquina += entradaEurUsuario;

                    System.out.println("Game over, has perdido con " + intentosUsuario + " intentos.");

                    for (int i = 0; i < intentosUsuario; i++) {
                        System.out.print(" " + entradasArray[i] + ", ");
                    }

                    System.out.println(" ");
                    System.out.println("Saldo maquina " + saldoMaquina);
                    System.out.println("Saldo usuario " + saldoUsuario);

                    salir = true;
                }
            }
            while (!salir);
        }
        else {

            System.out.println("Introduzca un valor correcto ");
        }
    }

    public void menu(){

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println(" ");
            System.out.println("1. Jugar a adivina el numero");
            System.out.println("2. Ver ganancias de la maquina");
            System.out.println("3. Cerrar el programa");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Bienvenido a adivina el numero ");
                    juego();
                }
                case 2 -> {
                    System.out.println("Las ganancias de la maquina son de ");
                    System.out.println(saldoMaquina - 1000 + " puntos");
                }
                case 3 -> salir = true;
                default -> System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}


package AdivinaELNumero;

import java.util.Scanner;

public class AdivinaElNumeroV2 {
    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 100);
        boolean salir = false;
        int intentosUsuario = 0;
        int [] entradasArray = new int[10];
        System.out.println("Introduzca un numero entre 0 y 99");

        do {
            Scanner sc = new Scanner(System.in);
            int entradaUsuario = sc.nextInt();
            intentosUsuario++;
            entradasArray[intentosUsuario - 1] = entradaUsuario;

            if (intentosUsuario < 5) {
                if (numAleatorio == entradaUsuario) {
                    System.out.println("Correcto era el numero " + numAleatorio + " lo has logrado en " + intentosUsuario + " intentos.");
                    System.out.println("Y has usado los siguientes numeros: ");
                    for (int i = 0; i < intentosUsuario; i++) {
                        System.out.print(" " + entradasArray[i] + ", ");
                    }
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
                System.out.println("Game over, has perdido con " + intentosUsuario + " intentos.");
                for (int i = 0; i < intentosUsuario; i++) {
                    System.out.print(" " + entradasArray[i] + ", ");
                }
                salir = true;
            }
        }
        while (!salir);
    }
}

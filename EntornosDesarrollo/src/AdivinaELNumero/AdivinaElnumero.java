package AdivinaELNumero;
import java.util.Scanner;

public class AdivinaElnumero {
    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 10);
        boolean respuesta = false;
        int contador = 0;
        System.out.println("Introduzca un numero entre 0 y 9");

        do {
            Scanner sc = new Scanner(System.in);
            int entradaUsuario = sc.nextInt();
            contador++;
            if (numAleatorio == entradaUsuario){
                System.out.println("Correcto era el numero " + numAleatorio + " lo has logrado en " + contador + " intentos.");
                respuesta = true;
            } else {
                System.out.println("Prueba otra vez ");
            }
        }
        while (!respuesta);
    }
}

//************************************************************************
//
//  Made by        Lluc Matas
//  Date           05/02/2021
//  Package        Bingo
//  GitHub:        https://github.com/LMatass
//  Description:
//
//************************************************************************
package Bingo;

public class ClaseMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Cartolina cartolina = new Cartolina();
        Jugador jugador1 = new Jugador(cartolina);
        Jugador jugador2 = new Jugador(cartolina);
        Bombo bombo = new Bombo(jugador1, jugador2);
        bombo.jugar();

        long stopTime = System.currentTimeMillis();
        System.out.println("El programa tarda en ejecutarse: " + (stopTime - startTime) + " milisegundos");
    }
}

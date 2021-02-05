package Bingo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Bombo {
    ArrayList<Integer> jugador1;
    ArrayList<Integer> jugador2;
    boolean salir = false;
    int random;


    public Bombo(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1.getCartolina();
        this.jugador2 = jugador2.getCartolina();
    }

    public void comprueba(ArrayList jugador) {
        if (jugador.contains(random)) {
            jugador.remove((Integer) random);
        }
    }

    public void jugar() {
        while (!salir) {
            random = (int) (Math.random() * 99);
            if (jugador1.size() == 0 || jugador2.size() == 0) {
                if (jugador1.size() == 0) {
                    System.out.println("Ha ganado el jugador 1" );
                } else {
                    System.out.println("Ha ganado el jugador 2");
                }
                salir = true;
            } else {
                comprueba(jugador1);
                comprueba(jugador2);
            }
        }
    }

}


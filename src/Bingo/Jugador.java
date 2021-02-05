package Bingo;

import java.util.ArrayList;

public class Jugador extends Cartolina{
    ArrayList<Integer> cartolina;

    String nombre;
    public Jugador(Cartolina cartolina, String nombre) {
        this.cartolina = cartolina.getCartolina();
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}


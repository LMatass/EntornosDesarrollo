package Bingo;

import java.util.ArrayList;

public class Cartolina {


    int contador = 0;
    ArrayList<Integer> cartolina = new ArrayList<>();

    public Cartolina() {
        generarCartolina();
    }

    public void generarCartolina() {
        while (contador < 10) {
            int random = (int) (Math.random() * 99);
            if (!cartolina.contains(random)) {
                cartolina.add(contador, random);
                contador++;
            }
        }
    }

    public ArrayList<Integer> getCartolina() {
        return cartolina;
    }
}

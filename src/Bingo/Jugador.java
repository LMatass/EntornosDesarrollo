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

import java.util.ArrayList;

public class Jugador extends Cartolina{
    ArrayList<Integer> cartolina;

    public Jugador(Cartolina cartolina) {
        this.cartolina = cartolina.getCartolina();
    }

}


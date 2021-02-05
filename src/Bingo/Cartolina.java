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

public class Cartolina {


    int contador = 0;
    ArrayList<Integer> cartolina = new ArrayList<>();


    public Cartolina() {
        generarCartolina();
    }

    /*
    Metodo que se encarga de generar 10 numeros aleatorios ente el 0 y el 99 y los mete en una arraylist si el numero
    generado no esta ya dentro evitando asi duplicar los numeros.
    */

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

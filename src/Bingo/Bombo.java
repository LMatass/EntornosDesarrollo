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


public class Bombo {
    ArrayList<Integer> jugador1;
    ArrayList<Integer> jugador2;
    ArrayList<Integer> intentosMaquina = new ArrayList<>();
    boolean salir = false;
    int random;

    /*
    Constructor de la clase bombo, que recibe como parametro los distintos jugadores para luego con el uso de un Getter
    conseguir su arraylist que hace referencia a la cartolina.
     */
    public Bombo(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1.getCartolina();
        this.jugador2 = jugador2.getCartolina();
    }
    /*
    Metodo que comprueba si en el arraylist del jugador contiene el numero generado por el bombo, si es el caso el numero
    random sera eliminado de la arraylist.
     */
    public void comprueba(ArrayList jugador) {
        if (jugador.contains(random)) {
            jugador.remove((Integer) random);
        }
    }
    /*
    El metodo jugar es el metodo principal, se trata de un algoritmo de bandera, de manera que hasta que uno de los jugadores
    se quede sin numeros y por lo tanto se cambie el valor a true, el bucle seguira ejecutandose. La primera condicion comprueba
    si hay algun ganador, si no se da el caso se sigue ejecutando.
     */
    public void jugar() {
        while (!salir) {
            random = (int) (Math.random() * 99);
            if (!intentosMaquina.contains(random)) {//Comprueba que el numero generado no esta dentro de la array
                intentosMaquina.add(random);

                if (jugador1.size() == 0 || jugador2.size() == 0) { //Comprueba si el tamaño de alguna de las arrays es 0 y por lo tanto si existe algun ganador.
                    //Si ambos tamaños de las arrays son 0, se considera empate
                    if (jugador1.size() == 0 && jugador2.size() == 0) {
                        System.out.println("Empate");
                    } else if (jugador1.size() == 0){
                        System.out.println("Ha ganado el jugador 1");
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
}


package Bingo;

public class ClaseMain {
    public static void main(String[] args) {
        Cartolina cartolina = new Cartolina();
        Jugador jugador1 = new Jugador(cartolina, "Juan");
        Jugador jugador2 = new Jugador(cartolina, "Fernando");
        Bombo bombo = new Bombo(jugador1, jugador2);
        bombo.jugar();
    }
}

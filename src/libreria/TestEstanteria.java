package libreria;
//************************************************************************
//
//  Made by        Lluc Matas
//  Date           07/02/2021
//  Package        libreria
//  GitHub:        https://github.com/LMatass     
//  Description:
// 
//************************************************************************
public class TestEstanteria {
    public static void main(String[] args) throws Exception {
        //Se crea la estanteria
        Estanteria estanteria = new Estanteria();
        //Se crean 2 libros con sus respectivos parametros
        Llibre l1 = new Llibre("l1", "Marcos", 7);
        Llibre l2 = new Llibre("l2", "Juan", 3);
        //Se añaden estos dos libros a la estanteria
        estanteria.afegirLlibre(l1);
        estanteria.afegirLlibre(l2);
        //Se repite el proceso anterior, se crean 3 libros
        Llibre l3 = new Llibre("l3", "Matias", 8);
        Llibre l4 = new Llibre("l4", "Marc", 4);
        Llibre l5 = new Llibre("l5", "Juanito", 6);
        // Se añaden los 3 libros creados previamente
        estanteria.afegirLlibre(l3);
        estanteria.afegirLlibre(l4);
        estanteria.afegirLlibre(l5);
        //El metodo topDeu es invocado y muestra por pantalla los libros ordenados con la mejor puntuacion
        estanteria.topDeu();
        //Se elimina el libro con el titulo l3
        estanteria.eliminarLlibre("","l3");
        //Se muestran por pantalla todos los libros que estan actualmente en la estanteria
        estanteria.veureEstanteria();

    }
}

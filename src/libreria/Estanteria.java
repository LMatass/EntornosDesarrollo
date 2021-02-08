package libreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//************************************************************************
//  Made by        Lluc Matas
//  Date           07/02/2021
//  Package        libreria
//  GitHub:        https://github.com/LMatass     
//  Description:
// 
//************************************************************************
public class Estanteria {
    Llibre llibre;
    ArrayList <Llibre> estanteria = new ArrayList<>();
    public Estanteria (){

    }
    /*
    Metodo añadir libros, se le pasa como parametro un objeto de tipo Libro, se comprueba que hay sitio en la estanteria,
    en el caso de que haya sitio se añade el libro a a la estanteria, si no hay sitio saltar una excepcion parando el programa.
     */
    public void afegirLlibre(Llibre llibre) throws Exception {
        if (estanteria.size() < 10 && !comprueba(llibre)) {
            estanteria.add(llibre);
        } else throw new Exception("No se ha podido añadir el libro, estanteria llena");
    }
    /*
    Metodo para eliminar los libros, se le pasa como parametro el nombre del autor o el titulo del libro, se recorre la
    libreria y si se da el caso de que alguno de los parametros introducidos (autor o titulo) concuerda con el titulo o
    autor del libro este se eliminara de la estanteria.
     */
    public void eliminarLlibre(String autor, String titol) {
        System.out.println("************************************************************");
        for (int i = 0; i < estanteria.size(); i++) {
            llibre = estanteria.get(i);
            if (autor.equals(llibre.getAutor()) || titol.equals(llibre.titol)){
                System.out.println("Eliminat el llibre: "+ llibre.getTitol());
                estanteria.set(i,creacion()); //Llama a un metodo que crea un libro totalmente vacio
            }
        }
    }
    /*
    Metodo que su funcion es mostrar por pantalla los libros de la estanteria ordenados segun su puntuacion, para ello
    usamos un metodo de la clase Collections y ordenamos los libros, usamos el reverse para listarlos de mayor a menor.
    Luego un bucle for es usado para mostrar por pantalla todos los elementos y sus caracteristicas de la estanteria.
     */
    public  void topDeu(){
        System.out.println("************************************************************");
        Collections.sort(estanteria, Comparator.comparing(Llibre::getQualificacio));
        Collections.reverse(estanteria);
        System.out.println("Top 10 mijors llibres");
        for (int i = 0; i < estanteria.size() ; i++) {
            System.out.println("Titol: " +estanteria.get(i).titol +
                    ", Autor: "+ estanteria.get(i).autor +
                    ", Qualificacio: " + estanteria.get(i).qualificacio);
        }
        System.out.println("************************************************************");
    }
    /*
    Metodo que en la que se funcion es mostrar todos los libros que estan dentro de la estanteria actualmente, para ello
    se usa un bucle for que recorre todos los elementos  de la array y los imprime por pantalla.
     */
    public void veureEstanteria(){
        System.out.println("************************************************************");
        System.out.println("Llistat dels llibres disponibles: ");
        for (int i = 0; i < estanteria.size() ; i++) {
            System.out.println("Titol: " +estanteria.get(i).titol +
                    ", Autor: "+ estanteria.get(i).autor +
                    ", Qualificacio: " + estanteria.get(i).qualificacio +
                    ", Posicio: " + i);
        }
        System.out.println("************************************************************");
    }
    public boolean comprueba (Llibre llibre){
        boolean flag = false;
        for (int i = 0; i < estanteria.size(); i++) {
            if (estanteria.contains(llibre)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Llibre creacion(){
        Llibre llibre = new Llibre("","",0);
        return llibre;
    }
}

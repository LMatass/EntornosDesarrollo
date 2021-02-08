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
public class Llibre {
    String titol;
    String autor;
    int qualificacio;

    public Llibre(String titol, String autor, int qualificacio){
        this.titol = titol;
        this.autor = autor;
        this.qualificacio = qualificacio;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public int getQualificacio() {
        return qualificacio;
    }


}

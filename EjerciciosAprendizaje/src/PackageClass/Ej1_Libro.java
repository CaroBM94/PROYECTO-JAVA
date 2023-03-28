/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageClass;

/**
 *
 * @author carol
 */
public class Ej1_Libro {
    
   //atributos
    public int ISBN;//International Standard Book Number (ISBN) es un número de 13 cifras que identifica de una manera única a cada libro
    public String Titulo;
    public String Autor;
    public int Numerodepag;
    
    public Ej1_Libro(){  
    }
    
    public Ej1_Libro(int ISBN, String Titulo, String Autor, int Numerodepag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numerodepag = Numerodepag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumerodepag() {
        return Numerodepag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumerodepag(int Numerodepag) {
        this.Numerodepag = Numerodepag;
        
    }

    @Override
    public String toString() {
        return "Ej1_Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Numerodepag=" + Numerodepag + '}';
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRO;

import LIBRO.Ej1_Libro;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej1_LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //    public int ISBN;
//    public String Titulo;
//    public String Autor;
//    public int Numero_de_pag;

      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      Ej1_Libro n1 = new Ej1_Libro();
      
        System.out.println("Ingrese el número de ISBN: ");
        n1.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el título del libro: ");
        n1.setTitulo(leer.next());
        
        System.out.println("Ingrese el nombre del Autor: ");
        n1.setAutor(leer.next());
        
        System.out.println("Ingrese numero de paginas: ");
        n1.setNumerodepag(leer.nextInt());
        
        System.out.println(n1.toString());
        
    }


    
}

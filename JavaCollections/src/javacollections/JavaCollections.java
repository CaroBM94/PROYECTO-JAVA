/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;

/**
 *
 * @author carol
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    ArrayList<String> libros = new ArrayList();
    libros.add("El Principito");
    libros.add("Outlander");
    libros.add("Blancanieves");
    libros.add("IT");
    
    for (String aux : libros){
        System.out.println("Titulos: " + aux + " ");
        
    }
    
    
    }
}
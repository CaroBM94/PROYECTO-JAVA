/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CANCION;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class CancionService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cancion1 cancion = new Cancion1();
    
    public Cancion1 crearCancion(){
        System.out.println("Ingrese el nombre el nombre del título: ");
        cancion.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        cancion.setAutor(leer.nextLine());
        
        return cancion;
        
                  
        
    }
   
}

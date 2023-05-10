/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_EXTRA;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class CancionService {
    
    Scanner leer = new Scanner(System.in);
    
    public  Cancion nuevaCancion(){
        Cancion n1 = new Cancion();
        
        
        System.out.println("Ingrese el nombre de la cancion: ");
        n1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        n1.setTitulo(leer.nextLine());
        return n1;
        
    }
    
    public void leerCancion(Cancion num1){
        System.out.println("Titulo : "+num1.getAutor());
        System.out.println("Autor : "+num1.getTitulo());
        
    }
    
}

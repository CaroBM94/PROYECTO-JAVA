/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRACCION;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Service {
    
    Scanner leer = new Scanner(System.in);
    
    public void ingresarNumeros(Fraccion fraccion){
        System.out.println("Ingrese los numeradores");
        fraccion.setA(leer.nextInt());
        fraccion.setB(leer.nextInt());
        
        
        
    }
    public double sumar(Fraccion fraccion){
        
        
    
    }
    
}

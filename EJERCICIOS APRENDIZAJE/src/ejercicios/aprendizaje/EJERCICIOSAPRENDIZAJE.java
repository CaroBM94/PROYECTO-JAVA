/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class EJERCICIOSAPRENDIZAJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 3
      Scanner sc = new Scanner (System.in);
       System.out.println("escribe una frase");
       String frase = sc.nextLine();
       System.out.println(frase.toUpperCase());
       System.out.println(frase.toLowerCase());
    }
    
}

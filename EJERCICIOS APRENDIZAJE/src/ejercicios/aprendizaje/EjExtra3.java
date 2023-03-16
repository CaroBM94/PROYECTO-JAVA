/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 * @author carol
 */
public class EjExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String vocal;
        System.out.println("Ingrese una letra");
        vocal = leer.nextLine();
        
           switch(vocal){
               case "a":
                   System.out.println("Es vocal");
                   break;
               case "e":
                   System.out.println("Es vocal");
                   break;
               case "i":
                   System.out.println("Es vocal");
                   break;
               case "o":
                   System.out.println("Es vocal");
                   break;
               case "u":
                    System.out.println("Es vocal");
                   break;
               default:
                   System.out.println("No es vocal");
           }
          
       
        
        
            
        
    }
    
}

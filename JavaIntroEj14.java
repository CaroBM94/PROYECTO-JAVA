/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[8];
        
        for(int i=0; i<equipo.length ;i++){
            System.out.println("Ingrese el nombre del integrante: ");
            equipo[i] = leer.nextLine();
        }
        System.out.println("Los nombres de los integrantes son:");
        for(int i=0; i<equipo.length ;i++){
            System.out.println((i+1) + " - " + equipo[i]);            
        }          
    }
   
}

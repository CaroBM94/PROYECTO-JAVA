/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj13 {

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

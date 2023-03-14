/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota = 0;
        
        do {
            System.out.println("Ingrese una Nota entre 0 y 10");
            nota = leer.nextInt();
            System.out.println("La nota ingrasada es: " + nota + "");
        }while (nota > 10 || nota < 0);   
    }    
}

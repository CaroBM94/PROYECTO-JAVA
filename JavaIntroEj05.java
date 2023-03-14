/*
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
*/
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj05 {
    public static void main(String[] args){
        //Ejercicio 5
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese True/False");
        boolean banderilla = leer.nextBoolean();
        System.out.println("Ingrese un precio: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese una letra: ");
        char inicial = leer.next().charAt(0);  
    }
}

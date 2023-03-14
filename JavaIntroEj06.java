/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
*/
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj06 {
    public static void main(String[] args){
        //Ejercicio 6
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer numero: ");
        int num01 = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo numero: ");
        int num02 = entrada.nextInt();
        
        if(num01>25 && num02>25){
            System.out.println("Ambos numeros son mayores a 25");
        } else if(num01>25){
            System.out.println("El primer numero es mayor a 25");
        }else if(num02>25){
            System.out.println("El segundo numero es mayor a 25");
        }else{
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}

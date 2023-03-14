/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**Escribir un programa que lea un número entero por teclado y
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 *
 * @author carol
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double num1,doble,triple,raiz;
        System.out.println("Ingrese un numero: ");
        num1 = sc.nextDouble();
        
        doble=num1*2 ;
        triple=num1*3;
        raiz= Math.sqrt(num1) ;
        
        System.out.println("El resultado de " + num1 + " el doble es: " + doble  );
        System.out.println("El resultado de " + num1 + " el triple es: " + triple );
        System.out.println("El resultado de " + num1 + " la raiz cuadrada es : " + raiz );
        
    }
    
}

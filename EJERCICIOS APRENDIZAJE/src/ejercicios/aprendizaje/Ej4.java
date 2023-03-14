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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double centigrados, fahrenheit;
        System.out.println("ingrese la temperatura");
        centigrados = sc.nextDouble();
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("la temperatura es: " + fahrenheit);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 * @author carol
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  int[][] matriz = new int[4][4];
        Random aleatorio = new Random();
        
        // Rellenar matriz con valores aleatorios
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = aleatorio.nextInt(100);
            }
        }
        
        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Obtener matriz traspuesta
        int[][] traspuesta;
        traspuesta = obtenerMatrizTraspuesta(matriz);
        
        // Mostrar matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }
    
    // Método que muestra una matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Método que obtiene la matriz traspuesta de una matriz dada
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        return traspuesta;
    }
}
   


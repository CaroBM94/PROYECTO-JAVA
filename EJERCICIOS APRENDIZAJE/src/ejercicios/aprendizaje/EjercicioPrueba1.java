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
public class EjercicioPrueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("La matriz es de " + filas + "x" + columnas );

        System.out.println("--");
        // Primera fila
        for (int x=0;x<columnas;x++)
            System.out.println(matriz[0][x]);

        System.out.println("--");
        // Última Columna
        for (int x=1;x<filas;x++)
            System.out.println(matriz[x][columnas-1]);

        System.out.println("--");
        // Última Columna
        for (int x=columnas-2;x>=0;x--)
            System.out.println(matriz[filas-1][x]);

        System.out.println("--");
            // Primera Columna
        for (int x=filas-2;x>0;x--)
            System.out.println(matriz[x][0]);

            

    }
}
   
    
    


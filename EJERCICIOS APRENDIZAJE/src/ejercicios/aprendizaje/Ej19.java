/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Arrays;
import java.util.Scanner;

/**Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author carol
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = new int[3][3];

        int m[][] = {   {0,-2,4},
                        {2,0,2},
                        {-4,-2,0}
                    };
        
        int mt[][] = {   {0,2,-4},
                        {-2,0,-2},
                        {4,2,0}
                    };


        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el numero: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("  ");
        }

        int[][] traspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];

            }

        }
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.print(traspuesta[i][j]);
            }
            System.out.println("  ");
        }*/
        
        
        if (Arrays.deepEquals(m, mt)) {
            System.out.println("Es una Matriz Antisimétrica");
        } else {
            System.out.println("No es una Matriz Antisimétrica");
        }
    }
    } 

    
    
/* Scanner poner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz:");
        int n = poner.nextInt();
        System.out.println("Completa los espacios de la matriz:");
        int[][] matriz = new int[n][n];
        int[][] antimatriz = new int[n][n];
        boolean valor = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = poner.nextInt();
                antimatriz[j][i] = -1 * (matriz[i][j]);
                System.out.println("");
            }
        }

        System.out.println("¿La matriz es antisimétrica?");
        System.out.println("la matriz ingresada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
                if (matriz[i][j] == antimatriz[i][j]) {
                    valor = valor && true;
                } else {
                    valor = valor && false;
                }
            }
            System.out.println("");
        }
        
        System.out.println("La matriz transpuesta negativa es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + antimatriz[i][j] + "] ");
            }
            System.out.println("");
        }
        
        if ( valor == true) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
*/


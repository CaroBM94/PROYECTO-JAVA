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
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
/*        Scanner leer = new Scanner(System.in);
        int [][] matriz = {{2,4,4,1,5},{6,6,9,5,1},{2,4,4,9,7},{6,6,9,9,7},{8,10,12,9,7}};
        int i,j ;
        
        System.out.println("MATRIZ");
        //imprimir matriz [10][10]
        int n;
        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                n= matriz[i][j];
                switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("["+ matriz[i][j]+"]");
                    break;
                case 2:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                case 3:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
System.out.println("MATRIZ P");
        //Llenado matrizA
        int [][] matrizP = {{2,4,4},{6,6,9},{8,10,12}};
        //imprimir matriz P
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                n= matriz[i][j];
                switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("["+ matriz[i][j]+"]");
                    break;
                case 2:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                case 3:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
    } 
}
    }
    
}*/
public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
//        int [][] matrizGrande = {{1, 26, 36, 47, 5, 6, 72, 81, 95,10}, 
//            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, 
//            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, 
//            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, 
//            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, 
//            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, 
//            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, 
//            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, 
//            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, 
//            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
//        
//        int [][] matrizMenor = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int [][] matrizGrande = new int [10][10];
        int [][] matrizMenor = new int [3][3];
        
        pushMatrix(matrizGrande);
        printMatrix(matrizGrande);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Por favor ingrese un número");
                matrizMenor[i][j] = input.nextInt();
            }
        }
        
        
        boolean encontrado = true;
        
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if(matrizGrande[i][j] == matrizMenor[0][0]){
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if(matrizGrande[i+k][j+l] != matrizMenor[k][l]){
                                encontrado = false;
                                k = 3;
                                break;
                            }
                        }
                    }
                    System.out.println(encontrado);
                    if(encontrado){
                        System.out.println("Matriz encontrada. Fila = " + i + " Columna = " + j);
                        i = 8;
                        j = 8;
                    }else{
                        encontrado = true;
                    }
                }
            }
        }
    }
    
    public static void pushMatrix (int [][] matrix){
    for (int[] matrix1 : matrix) {
        for (int j = 0; j < matrix.length; j++) {
            matrix1[j] = (int) (Math.random() * 100);
        }
    }
    }
    
    public static void printMatrix (int [][] matrix){
    for (int[] matrix1 : matrix) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(" " + matrix1[j] + " ");
        }
        System.out.println("");
    }
    }
}
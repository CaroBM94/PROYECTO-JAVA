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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [3][3];
        int i,j ;
        
        System.out.println("Llena la matriz con numero del 1 al 9");
        //Llenado matrizA
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               matriz[i][j] = leer.nextInt(); 
            }
        }
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        int suma;
        int diagonal=15;
        int filas=15;
        int columnas=15;
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                if (matriz[i][j]<1 || matriz[i][j]>9){
                    System.out.println("La matriz no es magica por que ingresate una numero fuera del rango");
                    break;
                } else {
                    suma=matriz[0][0]+matriz[0][1]+matriz[0][2];
                    if (suma==filas){
                        suma=0;
                        suma=matriz[1][0]+matriz[1][1]+matriz[1][2];
                        if (suma==filas){
                            suma=0;
                            suma=matriz[2][0]+matriz[2][1]+matriz[2][2];
                            if (suma==filas){
                                suma=0;
                                suma=matriz[0][0]+matriz[1][0]+matriz[2][0];
                                if(suma==columnas){
                                 suma=0;   
                                 suma=matriz[0][1]+matriz[1][1]+matriz[2][1];
                                 if (suma== columnas){
                                     suma=0;
                                     suma=matriz[0][2]+matriz[1][2]+matriz[2][2];
                                     if (suma==columnas){
                                         suma=0;
                                         suma=matriz[0][0]+matriz[1][1]+matriz[2][2];
                                         if (suma==diagonal){
                                             suma=0;
                                             suma=matriz[2][0]+matriz[1][1]+matriz[0][2];
                                             if (suma==diagonal){
                                                 System.out.println("LA MATRIZ ES MAGICA");
                                                 break;
                                             }
                                         }else{
                                             System.out.println("La matriz no es magica");
                                        break;
                                         }
                                     }else{
                                         System.out.println("La matriz no es magica");
                                        break;
                                     }
                                 }else{
                                     System.out.println("La matriz no es magica");
                                    break;
                                 }
                                }else{
                                    System.out.println("La matriz no es magica");
                                     break;
                                }
                            }
                        }else{
                            System.out.println("La matriz no es magica");
                        break;
                        }
                        
                    }else{
                        System.out.println("La matriz no es magica");
                        break;
                    }
                }
            }
            break;
        }
        
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 * @author carol
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int sumaF=0,sumaC=0,sumaD1=0,sumaD2=0,j,sumaC2=0,sumaC3=0, conta=0;
        int[][] cm = new int[3][3];
        System.out.println("Llena la matriz con numero del 1 al 9");
        
//Llena matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                 cm[i][k]=leer.nextInt();
            }                       
        }
        
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sumaF+=cm[i][j];            
             System.out.print("["+cm[i][j]+"]");
            }

System.out.println("");

            if(sumaF!=15){
                break;
            }else{conta++;}
            sumaF=0;
            sumaC3+=cm[i][2];
            sumaC2+=cm[i][1];
            sumaC+=cm[i][0];
            sumaD1+=cm[i][i];
            sumaD2+=cm[i][j-1];  
        }
        
        if(conta==3 && (sumaC3+sumaC2+sumaC+sumaD1+sumaD2)%15==0){
            System.out.println("la matriz SI es mágica");
        }else{
             System.out.println("La matriz NO es mágica");
        }
    }
}
    
    


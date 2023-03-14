/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author carol
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector = new int[100];
        cuentaRegresiva(vector);
    }
    public static void cuentaRegresiva(int[] vector){
        for (int i = 100; i > 0; i--) {
            int j=0;
            vector[j] = i;
            System.out.print(" ("+vector[j]+") ");  
            j++;
        }
    }
}

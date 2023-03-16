/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 * @author carol
 */
public class EjExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 y el 10");

        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El numero romano es  I ");
                break;
            case 2:
                System.out.println("El numero romano es  II ");
                break;
            case 3:
                System.out.println("El numero romano es  III ");
                break;
            case 4:
                System.out.println("El numero romano es  IV ");
                break;
            case 5:
                System.out.println("El numero romano es  V ");
                break;
            case 6:
                System.out.println("El numero romano es  VI ");
                break;
            case 7:
                System.out.println("El numero romano es  \"VII\"");
                break;
            case 8:
                System.out.println("El numero romano es  VIII ");
                break;
            case 9:
                System.out.println("El numero romano es  IX ");
                break;
            case 10:
                System.out.println("El numero romano es  X ");
                break;
            default:
                System.out.println("El número ingresado es inválido");
        }

    }

}

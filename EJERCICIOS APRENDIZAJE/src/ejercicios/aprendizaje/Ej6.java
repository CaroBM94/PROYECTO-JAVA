/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**Crear un programa que dado un numero determine si es par o impar.
 *
 * @author carol
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, par, impar ;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        
        if (num1 % 2 == 0){
                System.out.println("Es numero par");
                }
        else{
                System.out.println("el numero es impar");
                }
    }
    
}

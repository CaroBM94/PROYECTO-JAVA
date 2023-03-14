/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * 
 * @author carol
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float euros;
        String divisa_a_convertir;
        System.out.println("Ingrese la cantidad de euros");
        euros = input.nextFloat();
        System.out.println("¿A qué divisa quiere convertir? \n [dolares, yenes, libras]");
        divisa_a_convertir = input.next();
        convertirMoneda(euros, divisa_a_convertir);
    }
    
    private static void convertirMoneda(float euros, String moneda_convertir){
        
        switch(moneda_convertir){
            case "dolares":
                System.out.println(euros + " euros equivale a = " + (euros * 1.28611) + " " + moneda_convertir);
                break;
            case "yenes":
                System.out.println(euros + " euros equivale a = " + (euros * 129.852) + " " + moneda_convertir);
                break;
            case "libras":
                System.out.println(euros + " euros equivale a = " + (euros * 0.86) + " " + moneda_convertir);
                break;
            default:
                System.out.println("Opción no permitida");
        }
    }
}
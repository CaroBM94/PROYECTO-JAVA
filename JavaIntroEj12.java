/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese dos numeros: ");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo (num1, num2);
    }   
    public static void EsMultiplo(int num1, int num2){
        
        if(num1%num2 == 0){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }
}

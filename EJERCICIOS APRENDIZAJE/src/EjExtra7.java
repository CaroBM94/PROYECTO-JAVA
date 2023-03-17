
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 * @author carol
 */
public class EjExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        int menor = 0, mayor = 0, i = 0, n, num;
        double promedio = 0;
        System.out.println("Ingrese la cantidad de numeros a ingresa: ");
         n = leer.nextInt();
        while(n<0){
            System.out.println("Ingrese la cantidad de numeros a ingresa: ");
            n = leer.nextInt();
        }
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (i==0) {
                menor = num;
                mayor = num;
            }
            if (num<menor) {
                menor = num;
            }else if (num>mayor) {
                mayor = num;
            }
            promedio += num;
            i++;
        } while (i<n);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El promedio es: " + (promedio/n));       
    }   
}
 

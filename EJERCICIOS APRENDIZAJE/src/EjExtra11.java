
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 * @author carol
 */
public class EjExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner leer = new Scanner(System.in);
        int num,digitos= 0;
      
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        while(num !=0){
        num = num/10;
        digitos++;
        
        
       }
        System.out.println("La cantidad de digitos es: " + digitos);
    }
    }

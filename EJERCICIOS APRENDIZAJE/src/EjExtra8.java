
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * @author carol
 */
public class EjExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int par=0, impar=0,cantidad=0, num;
        do{
        System.out.println("Ingrese un número");        
        num = leer.nextInt();
            if (num < 0) {
                continue;               
            }
                        
            if (num%5 == 0) {
              break;  
            }
            if (num%2 == 0) {
                par++;
                
            }else {
                impar++;
            }
            cantidad++;
        }while (true);
        
        System.out.println("La cantidad de números impares es " + impar);       
        System.out.println("La cantidad de números pares es " + par);
        System.out.println("La cantidad de números ingresados " + cantidad);       
    }
    }
    
    


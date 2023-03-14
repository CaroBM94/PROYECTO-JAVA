/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj09 {

    public static void main(String[] args) {
        int i, suma, num;
        suma = 0;
        num = 0;
        i = 0;
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt(); 
                cont++;
                if( num < 0 ){
                    continue;
                }
                if( num == 0 ){
                    System.out.println("Se ha capturado el 0");
                    break;
                }
                suma += num;
        } while (cont<20);
        
        
        System.out.println("La suma de los numeros ingresados es: " + suma + "");
    }
}

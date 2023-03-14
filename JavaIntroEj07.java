/*
 Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
    o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de
    agua”.
    o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
    gasolina”.
    o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
    hormigón”.
    o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de
    pasta alimenticia”.
    o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
    válido para tipo de bomba”
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese una opcion para elegir la bomba");
        System.out.println(" ** opcion: 1- Agua 2- Gasolina 3- Hormigon 4- Pasta Alimenticia ** ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("La bomba es una bomba de Agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de Gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de Hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para este tipo de bomba");
                break;
        }
    }    
}

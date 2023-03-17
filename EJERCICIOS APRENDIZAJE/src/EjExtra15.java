
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class EjExtra15 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        // Mostrar las opciones al usuario
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        // Pedir la opción al usuario
        System.out.print("Elija una opción: ");
        int opcion = input.nextInt();

        // Realizar la operación correspondiente
        switch (opcion) {
            case 1:
                double suma = sumar(num1, num2);
                System.out.println(num1+" + "+ num2+" = "+ suma);
                break;

            case 2:
                double resta = restar(num1, num2);
                System.out.printf(num1+" + "+ num2+" = "+ resta);
                break;

            case 3:
                double producto = multiplicar(num1, num2);
                System.out.printf(num1+" + "+ num2+" = "+ producto);
                break;

            case 4:
                double division = dividir(num1, num2);
                System.out.printf(num1+" + "+ num2+" = "+ division);
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }

        
    }

    // Funciones para realizar las operaciones matemáticas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
 }
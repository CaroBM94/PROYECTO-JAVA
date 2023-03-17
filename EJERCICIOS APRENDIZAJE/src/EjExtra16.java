
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
public class EjExtra16 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = input.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = input.nextInt();
            input.nextLine();

            System.out.printf("La persona ingresada es %s, ", nombre);
            if (edad >= 18) {
                System.out.println("es mayor de edad.");
            } else {
                System.out.println("es menor de edad.");
            }

            System.out.print("¿Quiere seguir ingresando personas? (Sí/No): ");
            String respuesta = input.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
   }
}
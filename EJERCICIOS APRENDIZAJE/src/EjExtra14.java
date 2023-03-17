/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class EjExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Pedir la cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = input.nextInt();

        // Inicializar variables para calcular la media
        int totalHijos = 0;
        int totalEdad = 0;

        // Pedir la cantidad de hijos para cada familia y calcular la media
        for (int i = 1; i <= numFamilias; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia "+ i);
            int numHijos = input.nextInt();
            totalHijos += numHijos;

            for (int j = 1; j <= numHijos; j++) {
                System.out.printf("Ingrese la edad del hijo %d de la familia %d: ", j, i);
                int edadHijo = input.nextInt();
                totalEdad += edadHijo;
            }
        }

        // Calcular y mostrar la media
        double mediaEdad = (double) totalEdad / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: "+ mediaEdad);
    }
    }
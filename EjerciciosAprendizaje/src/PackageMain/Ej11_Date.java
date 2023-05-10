/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageMain;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej11_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        // constructor por defecto
        Date fechaActual = new Date();

        System.out.println("La fecha actual es: ");
        System.out.println(fechaActual.getDate() + "/" + (fechaActual.getMonth() + 1) + "/" + (fechaActual.getYear()+1900));

        //constructor con parámetros        
        System.out.println("Ingrese su fecha de nacimiento (año, mes, día)");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fecha = new Date(fechaActual.getYear() + 1900 - anio, fechaActual.getMonth() + 1 - mes, fechaActual.getDate() - dia);

        System.out.println("Su edad es: " + fecha.getYear() + " años, " + fecha.getMonth() + " meses y " + fecha.getDate() + " dias.");
    }
    }
    


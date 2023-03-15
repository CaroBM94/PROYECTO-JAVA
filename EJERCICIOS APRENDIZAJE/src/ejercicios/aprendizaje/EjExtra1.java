/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author carol
 */
public class EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
       //1140 minutos = 1 dias
       //60 minutos = 1 hora
        int totMins;
        int horas;
        int dias;
 
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el tiempo en minutos: ");
        totMins= leer.nextInt();
        
        //horas = totMins / 60;
        dias = totMins / 1440;
        horas =((totMins % 1440)/60);
        
        
        

        
        System.out.println(totMins + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s)"); 

    }
}

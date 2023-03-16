/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author carol
 */
public class EjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese que a que tipo de socio pertenece");
        
        String socio= teclado.nextLine();
        System.out.println("Ingrese monto de cuota");
        double  cuota = teclado.nextInt();
        
        switch(socio){
            case "A":
                cuota= cuota - (cuota*0.50);
                System.out.println("El importe a abonar es :" + cuota);
                break;
            case "B":
                cuota= cuota - (cuota*0.35);
                System.out.println("El importe a abonar es :" + cuota);
                break;
            case "C":
                cuota= cuota;
                System.out.println("El importe a abonar es :" + cuota);
                break;
            default:
                System.out.println("Ingrese una opcion válida");
        }
                
                
            
    }
    
}

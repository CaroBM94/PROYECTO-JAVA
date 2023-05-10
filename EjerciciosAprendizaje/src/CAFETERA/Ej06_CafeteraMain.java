/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAFETERA;

import CAFETERA.Ej06_Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author carol
 */
public class Ej06_CafeteraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       Ej06_CafeteraService Cafetera1 = new Ej06_CafeteraService();
       Ej06_Cafetera Cafe = Cafetera1.valorCafetera();
       
        int opcion;
        
        do {
            System.out.println("\n---------------------");
            System.out.println("PROGRAMA NESPRESSO");
            System.out.println("1 - Llenar Cafetera"); 
            System.out.println("2 - Servir taza"); 
            System.out.println("3 - Vaciar Cafetera"); 
            System.out.println("4 - Agregar Cafe");
            System.out.println("5 - SALIR");
            System.out.println("---------------------"); 
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    Cafetera1.llenarCafetera(Cafe);
                    break;
                case 2:
                    Cafetera1.servirTaza(Cafe);
                    break;
                case 3:
                    Cafetera1.vaciarCafetera(Cafe);
                    break;
                case 4:
                    Cafetera1.agregarCafe(Cafe);
                    break;
                case 5:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
    
}
       
       
       
       
       
       
       
    
    
    


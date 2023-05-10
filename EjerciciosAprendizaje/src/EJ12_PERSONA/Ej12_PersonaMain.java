/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ12_PERSONA;

import EJ12_PERSONA.Ej12_Persona;
import java.util.Scanner;

/**Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 *
 * @author carol
 */
public class Ej12_PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Ej12_PersonaService servicio = new Ej12_PersonaService();
        Ej12_Persona persona1 = servicio.crearPersona();
        System.out.println("La edad es: "+servicio.calcularEdad(persona1));
                
        System.out.println("Ingrese una nueva edad : ");
        
        System.out.println(servicio.menorQue(leer.nextInt(), persona1));
        
                
        servicio.mostrarPersona(persona1);
        
         Ej12_Persona persona2 = servicio.crearPersona();
        System.out.println("La edad es: "+servicio.calcularEdad(persona2));
                
        System.out.println("Ingrese una nueva edad : ");
        
        System.out.println(servicio.menorQue(leer.nextInt(), persona2));
        
                
        servicio.mostrarPersona(persona2);
    }
    
}

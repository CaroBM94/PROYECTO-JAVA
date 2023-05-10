/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ12_PERSONA;

import EJ12_PERSONA.Ej12_Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
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
 * @author carol
 */
public class Ej12_PersonaService {
    Scanner leer = new Scanner(System.in);
    Date fechaActual = new Date();
    int dia;
    int mes;
    int anio;
    public Ej12_Persona crearPersona(){
               
        System.out.println("Ingrese su dia de nacimiento: ");
        dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        anio = leer.nextInt();
        System.out.println("Ingrese su nombre: ");
        Ej12_Persona p1 = new Ej12_Persona(fechaActual.getYear()+1900 - anio ,fechaActual.getMonth()- mes,fechaActual.getDate()-dia,leer.next());
        return p1;
    
    }
    
    public int calcularEdad(Ej12_Persona p1){
       // System.out.println("Su edad es: " + (p1.getFechanac().getYear())+ "años");
        return p1.getFechanac().getYear();
    }
    //edad nueva
    public boolean menorQue(int edad, Ej12_Persona p1){
        if (edad<calcularEdad(p1)) {
            return true;
        }else{
            return false;
        }
        
    }
    
    public void mostrarPersona(Ej12_Persona p1){
        System.out.println("Su nombre es: " + p1.getNombre() + "// Su fecha de nacimiento es: " + anio+ "/" +mes+ "/"+ dia);
    }
    } 
    
    
   


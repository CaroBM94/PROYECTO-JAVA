/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSONA;

import PERSONA.Ej07_Persona;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej07_PersonaService {
    Scanner leer = new Scanner(System.in);
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    public Ej07_Persona crearPersona(){
        Ej07_Persona persona1 = new Ej07_Persona();
        System.out.print("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.print("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        int contador=0;
        do {System.out.print("Ingrese su género: ");
        persona1.setSexo(leer.next());
        
        if ("M".equals(persona1.getSexo()) || "F".equals(persona1.getSexo()) || "O".equals(persona1.getSexo())) {
            contador = 1;
        }else{
            System.out.print("El genero ingresado es incorrecto ");            
        }
            
        } while ((int) contador!=1);
               
        System.out.print("Ingrese su peso: ");
        persona1.setPeso(leer.nextDouble());
        System.out.print("Ingrese su altura: ");
        persona1.setAltura(leer.nextDouble());
        System.out.println("-----------------------");
        return persona1;
        
              
      }
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int calcularIMC(Ej07_Persona persona1){
        int respuesta=3;
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
////kg/(altura^2 en mt2))
        double imc = persona1.getPeso()/(Math.pow(persona1.getAltura(), 2));
// Si esta fórmula da por resultado un valor menor que 20,
////significa que la persona está por debajo de su peso ideal y la función devuelve un -1
        if (imc < 20 ) {
            respuesta=-1;
           
        }
// Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
////persona está en su peso ideal y la función devuelve un 0
        if (imc>= 20 && imc <=25) {
        respuesta = 0;
             
        }
// Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
////función devuelve un 1
        if (imc>25) {
            respuesta=1;
            
        }
        return respuesta;
    }
//   Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano. 
    public boolean esMayorDeEdad(Ej07_Persona persona1){
        boolean logico=false;
        if (persona1.getEdad()>=18) {
            logico=true;
                        
        }
        return logico;
        
    }
}

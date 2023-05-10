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
public class Ej07_PersonaMain {

    /**A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Ej07_PersonaService servicio = new Ej07_PersonaService();
        Ej07_Persona[] gente = new Ej07_Persona[4];
        double pesoideal=0;
        double bajopeso=0;
        double altopeso=0;
        double mayoredad=0;
        double menoredad=0;
        
        
        for (int i = 0; i < gente.length; i++) {
            gente[i]= servicio.crearPersona();
            
        }
        for (int i = 0; i < gente.length; i++) {
            if (servicio.calcularIMC(gente[i])==-1) {
                bajopeso++;
                
            }
            if (servicio.calcularIMC(gente[i])==0) {
                pesoideal++;
                                
            }
            if (servicio.calcularIMC(gente[i])==1) {
                altopeso++;
                
            }
            if (servicio.esMayorDeEdad(gente[i])==false) {
                menoredad++;
                
            }
           if (servicio.esMayorDeEdad(gente[i])==true) {
                mayoredad++;
                
            }
        }
// Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
        System.out.println("El promedio de las personas que estan por debajo de su peso es: "+((bajopeso*100)/4)+"%");  
        System.out.println("El promedio de las personas que estan en peso ideal es: "+((pesoideal*100)/4)+"%");   
        System.out.println("El promedio de las personas que estan por encima de su peso es: "+((altopeso*100)/4)+"%");   
        System.out.println("El promedio de las personas menores de edad es: "+((menoredad*100)/4)+"%");   
        System.out.println("El promedio de las personas mayores de edad es: "+((mayoredad*100)/4)+"%");   
        
    }
    
}

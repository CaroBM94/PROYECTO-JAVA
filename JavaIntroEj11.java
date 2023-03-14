/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        String CambiarCaracter = null;
        
        System.out.println("Ingresa un texto:");
        texto = leer.nextLine();
        String retorno = cambiarCaracter(texto);
        System.out.println("El texto codificado es: " + retorno );       
    }
    public static String cambiarCaracter (String texto){
        String sub =texto;
        sub = sub.replace("a", "@");
        sub = sub.replace("A", "@");
        sub = sub.replace("e", "#");
        sub = sub.replace("E", "#");
        sub = sub.replace("i", "$");
        sub = sub.replace("I", "$");
        sub = sub.replace("o", "%");
        sub = sub.replace("O", "%");
        sub = sub.replace("u", "*");
        sub = sub.replace("U", "*");
            
        return sub;
    }  
}

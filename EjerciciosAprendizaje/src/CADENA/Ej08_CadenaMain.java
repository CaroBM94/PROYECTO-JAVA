/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CADENA;

import CADENA.Ej08_Cadenas;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej08_CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //crear objeto
        Ej08_CadenaService servicio = new Ej08_CadenaService();
        crearFrase();
        
        public static Ej08_Cadenas crearFrase(){
        Ej08_Cadenas frase = new Ej08_Cadenas();
               
        System.out.println("Ingrese la frase");
        frase.setFrase(leer.nextLine());
        return frase;
        }
        System.out.println(frase.getFrase());
        
        servicio.mostrarVocales(frase);
        
        
        
        
    }
    public
    
}

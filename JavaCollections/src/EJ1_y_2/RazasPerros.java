/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1_y_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author carol
 */
public class RazasPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        ArrayList<String> razasPerros = new ArrayList();
        
        do {
            System.out.println("Ingresa una raza de perro: ");
            razasPerros.add(leer.nextLine());
            System.out.println("Desea agregar otra raza? ");
            respuesta = leer.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        for (String aux : razasPerros){
            System.out.println("Raza Perro: " + aux);
            
        }
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
        
        System.out.println(" ");
        System.out.println(" Ingrese la raza de perro que desea buscar: ");
        String razaB = leer.nextLine();
        
        Iterator it = razasPerros.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(razaB)) {
                it.remove();
                
            }
                              
        }
        if ((razasPerros.contains(razaB))) {
            System.out.println("La raza ingresada no fue encontrada en la lista");
        }else{
//            Iterator it = razasPerros.iterator();
            while(it.hasNext()){
                if (it.next().equals(razaB)) {
                    it.remove();
                    System.out.println("La raza ingresada fue removida de la lista");
                }
            }
        }
       
        Collections.sort(razasPerros);
        
        
        for (String aux : razasPerros){
                System.out.println("Raza perro: " + aux);
                
            }
    }
    
}

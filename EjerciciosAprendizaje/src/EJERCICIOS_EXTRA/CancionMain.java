/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_EXTRA;

/**
 *
 * @author carol
 */
public class CancionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("*** REGISTRO DE CANCIONES ***");
        CancionService cs = new CancionService();
        Cancion num1 = cs.nuevaCancion();
        System.out.println("--------------");
        cs.leerCancion(num1);
    }
    
}

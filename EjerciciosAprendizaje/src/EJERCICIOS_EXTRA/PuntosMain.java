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
public class PuntosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("***CALCULADORA DISTANCIA ENTRE DOS PUNTOS ***");
        PuntosService ps = new PuntosService();      
        Puntos puntos = ps.crearPuntos();
        System.out.println("----------------");
        ps.distanciaEntrePuntos(puntos);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS;

import ARRAYS.Ej10_Arrays;

/**
 *
 * @author carol
 */
public class Ej10_ArraysMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ej10_ArraysService Ves = new Ej10_ArraysService();
        Ej10_Arrays vec1 = Ves.OrdenarAr1();
        Ves.RellenarAr2(vec1);
        Ves.imprimirvector(vec1.getArreglo1());
        Ves.imprimirvector(vec1.getArreglo2());

        
        
        
    }
    
    
}

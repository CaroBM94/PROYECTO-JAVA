/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class Ejextra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] vector = new int[10]; 
        llenarVector(vector); 
        imprimirVector(vector); 
    }
    
    public static void llenarVector(int[] vector) {
        Random rand = new Random(); 
        for(int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); 
        }
    }
    
    public static void imprimirVector(int[] vector) {
    
        for(int i=0;i < vector.length;i++ )
        System.out.print(vector[i]+",");
        
    }
}
   
    


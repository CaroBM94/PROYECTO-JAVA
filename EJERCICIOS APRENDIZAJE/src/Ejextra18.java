/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class Ejextra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    public static void main(String[] args) {
     
      
        System.out.println("Ingrese el tamano de vector");
           Scanner leer = new Scanner(System.in);
      int n= leer.nextInt();
        int suma=0;      
        int[] vector=new int[n];
        
        for(int i=0;i<vector.length;i++){
        
            
            
            System.out.println("Ingrese el valor del posicion "+i);
            
            int valor= leer.nextInt();
                  vector[i]=valor;      
            suma+=valor;
            
          
        
        }
        System.out.println("////////////////////////////////////////////    ");
        for(int i=0;i<vector.length;i++){
        
            System.out.println(vector[i]);
        
        }
        
        System.out.println("La suma de todos los valores de la posicion del vector es igual a "+suma);
    }
    
}
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class Ejextra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
     Scanner leer = new Scanner (System.in);
        System.out.println(" ingrese la longitud de los vectores");
        n1=leer.nextInt();
      double [] vec = new double [n1] ;
      double [] vec2 = new double [n1] ;
      for (int i = 0; i < vec.length; i++) {
            System.out.println("ingrese  los valores del vecor1");
            vec[i]=leer.nextDouble();
        }
      for (int i = 0; i < vec2.length; i++) {
            System.out.println("ingrese  los valores del vector2");
            vec2[i]=leer.nextDouble();
        }
 
        System.out.println(" son iguales? " +     soniguales(vec,vec2));
    }
    public static boolean soniguales (double vec[], double vec2[]){
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]!=vec2[i]) {
                return false;
            }
        }
       return true; 
    }
    }
    
}

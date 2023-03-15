/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

/**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 *
 * @author carol
 */
public class EjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A=D
//  B = C
 // C = A
//  D = B
   
      int A=1;
      int B=2;
      int C=3;
      int D=4;
      int cent;
       
      System.out.println((A)+" "+(B)+" "+" "+(C)+" "+(D));
      
     cent = B;
        B = C;
        C = A;
        A = D;
        D = cent;
      
      
        System.out.println((A)+" "+(B)+" "+" "+(C)+" "+(D));
      
      
    }
    
}
 
   

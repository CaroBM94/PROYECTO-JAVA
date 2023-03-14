/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
            public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        llenarVector(vector);
    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            int num2 = (int) (Math.random() * 10000);
            vector[i] = num2;
            System.out.print("[" + vector[i] + "] ");
        }
        int n,cont1=0, cont2=0,cont3=0, cont4=0,cont5=0  ;
        
        for (int i = 0; i < vector.length; i++) {
         
            switch (n = (int)(Math. log10(vector[i])+1)){
                case 1:
                    cont1=cont1+1;
                    break;
                case 2:
                    cont2=cont2+1;
                    break;
                case 3:
                    cont3=cont3+1;
                    break;
                case 4:
                    cont4=cont4+1;
                    break;
                case 5:
                    cont5=cont5+1;
                    break;
            }
        }
        System.out.println("");
        if (cont1 >0){
            System.out.println("HAY "+ cont1 +" de un solo digito");
        }
        if (cont2 >0){
           System.out.println("HAY "+ cont2 +" de dos  digitos"); 
        }
        if (cont3 >0){
          System.out.println("HAY "+ cont3 +" de tres digitos");  
        }
        if (cont4 >0){
           System.out.println("HAY "+ cont4 +" de cuatro digitos"); 
        }
        if (cont5 >0){
          System.out.println("HAY "+ cont5 +" de cinco  digitos");  
        }
    }
    
}


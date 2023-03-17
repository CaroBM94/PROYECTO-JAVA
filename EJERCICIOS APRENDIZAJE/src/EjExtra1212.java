/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class EjExtra1212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0;  i< 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    String e1 = Integer.toString(i);
                    String e2 = Integer.toString(j);
                    String e3 = Integer.toString(k);
                    
                    if (e1.equals("3")) {
                        System.out.print("E-");
                    }else{                     
                        System.out.print(e1+"-");
                    }
if (e2.equals("3")) {
                        System.out.print("E-");
                    }else{                     
                        System.out.print(e2+"-");
                    } 
                   
                    if (e3.equals("3")) {
                        System.out.print("E");
                    }else{                     
                        System.out.print(e3);                       
                    }
                    System.out.println("");                                                                              
                }                
            }            
        }
    }
}
    
    


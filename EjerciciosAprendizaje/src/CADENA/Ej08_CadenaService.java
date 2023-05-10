/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CADENA;

import CADENA.Ej08_Cadenas;

/**
 *
 * @author carol
 */
public class Ej08_CadenaService {
    public void mostrarVocales(Ej08_Cadenas frase){
        int contador=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            switch(frase.getFrase().charAt(i)){
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break; 
                case 'u':
                    contador++;
                    break;
                default:
                    break;
                                    
                     
                
                   
            }
        }
        System.out.println(contador);
        
    }
    
}

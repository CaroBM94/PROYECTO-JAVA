/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MATEMATICA;

import MATEMATICA.Ej09_Matematica;

/**
 *
 * @author carol
 */
public class Ej09_MatematicaService {
    
    public void devolverMayo(Ej09_Matematica numero1){
        System.out.println("El numero mayor es: " + Math.max(numero1.getNum1(), numero1.getNum2()));
    }
    
    public void calcularPotencia(Ej09_Matematica numero1){
        double mayor = (int) Math.max(numero1.getNum1() , numero1.getNum2());
        double menor = (int) Math.min(numero1.getNum1(), numero1.getNum2());
        
        System.out.println("La potencia es: "+ Math.pow(menor, menor));
        
    }
    public void calcularRaiz(Ej09_Matematica numero1){
        int menor = Math.abs(Math.min(numero1.getNum1(), numero1.getNum2()));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(menor));
    }
}

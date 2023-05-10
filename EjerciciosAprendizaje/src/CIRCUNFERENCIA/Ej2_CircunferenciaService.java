/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIRCUNFERENCIA;

import CIRCUNFERENCIA.Ej2_Circunferencia;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej2_CircunferenciaService {
    
    public Ej2_Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Ej2_Circunferencia circ1= new Ej2_Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        circ1.setRadio(leer.nextDouble());
        return circ1;
    }
    
    public double area(Ej2_Circunferencia circ1){
        //(Area = PI x radio2)
        double area = Math.PI*(circ1.getRadio()*(circ1.getRadio()));
        
        return area;

    }
    public double perimetro (Ej2_Circunferencia circ1){
        //Perimetro = 2* PI * radio
        double perimetro = 2 * Math.PI * (circ1.getRadio());
        return perimetro;
    }
}

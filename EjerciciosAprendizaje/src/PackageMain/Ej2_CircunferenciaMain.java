/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageMain;

import PackageClass.Ej2_Circunferencia;
import PackageService.Ej2_CircunferenciaService;

/**
 *
 * @author carol
 */
public class Ej2_CircunferenciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ej2_CircunferenciaService circ1 = new Ej2_CircunferenciaService();
        Ej2_Circunferencia circ01 = circ1.crearCircunferencia();
        
        System.out.println("el área es: " + circ1.area(circ01));
        System.out.println("el perímetro es: " + circ1.perimetro(circ01));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageMain;

import PackageClass.Ej03_Operacion;
import PackageService.Ej03_OperacionService;

/**
 *
 * @author carol
 */
public class Ej03_OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ej03_OperacionService servOp1 = new Ej03_OperacionService();
        Ej03_Operacion op1 = servOp1.crearOperacion();
        
        int suma = servOp1.suma(op1);
        int resta = servOp1.resta(op1);
        int multiplicacion = servOp1.multiplicacion(op1);
        double division = servOp1.division(op1);
        
        
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicacion es : "+multiplicacion);
        System.out.println("La division es : "+division);
    }
    
}

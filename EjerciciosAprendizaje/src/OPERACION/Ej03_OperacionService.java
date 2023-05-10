/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPERACION;

import OPERACION.Ej03_Operacion;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej03_OperacionService {

    Scanner leer = new Scanner(System.in);

    public Ej03_Operacion crearOperacion() {
        Ej03_Operacion op1 = new Ej03_Operacion();
        System.out.println("Ingrese el valor del numero1 : ");
        op1.setN1(leer.nextInt());

        System.out.println("Ingrese el valor del numero 2 : ");
        op1.setN2(leer.nextInt());

        return op1;
    }

    public int suma(Ej03_Operacion op1) {

        int suma = op1.getN1() + op1.getN2();
        return suma;
    }

    public int resta(Ej03_Operacion op1) {
        int resta = op1.getN1() - op1.getN2();
        return resta;
    }

    public int multiplicacion(Ej03_Operacion op1) {
        if (op1.getN1() == 0 || op1.getN2() == 0) {
            System.out.println("No se puede multiplicar un numero por 0");
            return 0;
        } else {
            int multiplicacion = op1.getN1() * op1.getN2();
            return multiplicacion;
        }
    }
        
     public double division(Ej03_Operacion op1) {
        if (op1.getN1() == 0 || op1.getN2() == 0) {
            System.out.println("No se puede dividir un numero por 0");
            return 0;
        } else {
            double division = op1.getN1() / op1.getN2();
            return division;
        }   

    }
}

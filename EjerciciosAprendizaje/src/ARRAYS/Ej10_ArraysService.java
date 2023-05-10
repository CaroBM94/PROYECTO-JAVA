/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS;

import ARRAYS.Ej10_Arrays;

/**
 *
 * @author carol
 */
public class Ej10_ArraysService {
    public Ej10_Arrays OrdenarAr1() {
        double a = 0, b;
        Ej10_Arrays Ar1 = new Ej10_Arrays();
        for (int i = 0; i < Ar1.getArreglo1().length; i++) {
            for (int j = i + 1; j < Ar1.getArreglo1().length; j++) {
                if (Ar1.getArreglo1()[i] > Ar1.getArreglo1()[j]) {
                    b = Ar1.getArreglo1()[i];
                    Ar1.getArreglo1()[i]=Ar1.getArreglo1()[j];
                    Ar1.getArreglo1()[j]=b;
                }
            } 
        }
         return Ar1;
    }
    public  Ej10_Arrays rellenarArr2(){
        double a = 0, b;
        Ej10_Arrays Ar1 = new Ej10_Arrays();
        for (int i = 0; i < Ar1.getArreglo1().length; i++) {
            for (int j = i + 1; j < Ar1.getArreglo1().length; j++) {
                if (Ar1.getArreglo1()[i] > Ar1.getArreglo1()[j]) {
                    b = Ar1.getArreglo1()[i];
                    Ar1.getArreglo1()[i]=Ar1.getArreglo1()[j];
                    Ar1.getArreglo1()[j]=b;
                }
            } 
        }
         return Ar1;
    }
    public void RellenarAr2( Ej10_Arrays Ar1){
        for (int i = 0; i < 10; i++) {
            Ar1.getArreglo2()[i]=Ar1.getArreglo1()[i] ;
        }
       //System.arraycopy(Ar1.getArreglo1(), 0, Ar1.getArreglo2(), 0, 10);
       for (int i = 10; i < Ar1.getArreglo2().length; i++) {
            Ar1.getArreglo2()[i]=0.5;
        }
    }
    public void imprimirvector (double[] Ar1){
            System.out.println("Imprimiendo Array");
        for (int i = 0; i < Ar1.length; i++) {
            System.out.printf("%.2f", Ar1[i]);
            System.out.println("");
        }
        System.out.println("");
    }

    }


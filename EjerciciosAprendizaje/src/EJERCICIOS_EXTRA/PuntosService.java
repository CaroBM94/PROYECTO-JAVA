/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_EXTRA;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class PuntosService {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos puntos = new Puntos();
        System.out.println("Ingresa las coordenadas del punto 1: ");
        System.out.println("x1");
        puntos.setX1(leer.nextInt());
        System.out.println("y1");
        puntos.setY1(leer.nextInt());
        System.out.println("Ahora ingresa las coordenadas del punto 2: ");
        System.out.println("x2");
        puntos.setX2(leer.nextInt());
        System.out.println("y2");
        puntos.setY2(leer.nextInt());
        
        return puntos;
        
        
    }
    
    public void distanciaEntrePuntos(Puntos dist){
        double distancia;
        
        distancia =  Math.sqrt((Math.pow(dist.getX2()- dist.getX1(),2))+(Math.pow(dist.getY2()-dist.getY1(),2)));
        System.out.println("La distancia entre ("+dist.getX1()+","+dist.getX2()+") y ("+dist.getY1()+","+dist.getY2()+") es "+distancia);
    }
    
}

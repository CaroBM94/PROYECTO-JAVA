/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RECTANGULO;

import RECTANGULO.Ej04_Rectangulo;
import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author carol
 */
public class Ej04_RectanguloService {
    Scanner leer = new Scanner(System.in);
    
    public Ej04_Rectangulo crearRectangulo(){
        Ej04_Rectangulo rect = new Ej04_Rectangulo();
             
        
        System.out.println("Ingrese el valor de la base: ");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura: ");
        rect.setAltura(leer.nextInt());
                
        return rect;
                
    }
    
    public void superficie (Ej04_Rectangulo rect){
        int superficie = rect.getBase() * rect.getAltura();
        System.out.println("La superficie es: "+superficie);
        
    }
    
     public void perimetro (Ej04_Rectangulo rect){
        int perimetro = (rect.getBase() + rect.getAltura()) * 2;
        System.out.println("El perimetro: "+perimetro);
     }
     
     public void dibujar (Ej04_Rectangulo rect){
         for (int i = 0; i < rect.getAltura(); i++) {
             for (int j = 0; j < rect.getBase(); j++) {
                 if (i==0 || j==0 || i==rect.getAltura()-1 || j==rect.getBase()-1) {
                     System.out.print("* ");                    
                 }else{
                     System.out.print("  ");
                 }
                 
                 
             }
             System.out.println("");
         }
         
     }
     
     
}

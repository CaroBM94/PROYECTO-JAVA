/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

//llamado a los atributos

import java.util.Scanner;
import mascotapp.entidades.Mascota;


/**
 *
 * @author carol
 */
public class MASCOTAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //PRIMER OBJETO
        // Se llama al constructor mediante los parentesis
        Mascota m1 = new Mascota("Donatello", leer.next(), "Perro");
        
//        //atributos
//        m1.apodo = "Doni";
//        m1.nombre = "Donatello";
//        m1.tipo= "Perro";
//        m1.edad= 5 ;
//        m1.raza= "none";
//        m1.cola= true;
//        m1.color= "tricolor";

        
    //    System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo +" " +m1.color);
        
         m1.setNombre("Trucho");
         System.out.println();
    
        
        

    }
        
        
    }
    


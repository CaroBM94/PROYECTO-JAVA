/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class PersonaService {

    public Persona crearPersona() {
        Persona persona2 = new Persona();
    Scanner leer = new Scanner(System.in);

    System.out.println ("Ingrese el nombre de la persona");
    
    persona2.setNombre (leer.next());
    
    return persona2;
    }
}

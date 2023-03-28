/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author carol
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciación utilizando el constructor con parametro
        Persona p1 = new Persona();
        p1.setNombre("Belen");
        p1.setDni(38563498);
        p1.setEdad(28);
        //System.out.println(p1.getNombre()+" "+p1.getEdad()+" "+p1.getDni());
        //System.out.println(p1.toString());
        PersonaService(p1);
    }
    
public static void PersonaService(Persona p1){
    System.out.println("nombre: " + p1.getNombre());
    System.out.println("dni: " + p1.getDni());
    System.out.println("edad: " + p1.getEdad());
}

}

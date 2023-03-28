/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

/**
 *
 * @author carol
 */
public class Usuario {

    //Atributos
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    
    //CONSTRUCTOR
    public Usuario(){
        
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

}

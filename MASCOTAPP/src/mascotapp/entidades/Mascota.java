/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author carol
 */
public class Mascota {

    //atributos
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Etc.
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    //CONSTRUCTOR
    public Mascota(){
        
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("Perro")|| tipo.equals("Gato")||tipo.equals("Loro"))
        this.tipo = tipo;
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    
    //el set nos permite inferir un atributo
    public void setNombre(String nombre){
       // this.nombre = nombre;
       if (nombre.length() > 0){
           this.nombre = nombre;
       }
    }
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //el get nos permite trar el atributo
    public String getNombre(){
        return nombre;
    }
    
}


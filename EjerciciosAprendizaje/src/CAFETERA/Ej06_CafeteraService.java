/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageService;

import PackageClass.Ej06_Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author carol
 */
public class Ej06_CafeteraService {
    Scanner leer = new Scanner(System.in);
          
    public Ej06_Cafetera valorCafetera(){
        Ej06_Cafetera llenarCafe = new Ej06_Cafetera();
        System.out.println("Ingrese la capacidad máxima de su cafetera: ");
        llenarCafe.setCapacidadMaxima(leer.nextInt());
        return llenarCafe;        
    }
     
    public Ej06_Cafetera llenarCafetera(Ej06_Cafetera llenarCafe){
        //se llena la cafetera
        llenarCafe.setCantidadActual(llenarCafe.getCapacidadMaxima());
        System.out.println("La cafetera esta llena");
        return llenarCafe;
        
    }

    public Ej06_Cafetera servirTaza(Ej06_Cafetera llenarCafe){
    int tamañoTaza;
        System.out.println("Ingrese el tamaño de la taza que desea llenar: ");
        tamañoTaza = leer.nextInt();
        System.out.println("Sirviendo el café. . . ");
        if (llenarCafe.getCantidadActual()>=tamañoTaza) {
            System.out.println("La taza se lleno correctamente");
            llenarCafe.setCantidadActual(llenarCafe.getCantidadActual()-tamañoTaza);
        }else{
            System.out.println("No se pudo llenar la taza");
            
            System.out.println("-------------------------");
            System.out.println("La cantidad acutal de la taza es: "+llenarCafe.getCantidadActual());
            
            llenarCafe.setCantidadActual(0);
        }
        return llenarCafe;
        }
    
    public Ej06_Cafetera vaciarCafetera(Ej06_Cafetera llenarCafe){
        llenarCafe.setCantidadActual(0);
        System.out.println("La cafetera quedó vacía, en su interior contiene : "+llenarCafe.getCantidadActual()+"ml de café");
        return llenarCafe;
  
    }
    
    public Ej06_Cafetera agregarCafe(Ej06_Cafetera llenarCafe){
        int agregarCafe;
        int capMax=llenarCafe.getCapacidadMaxima();
        int cantAct=llenarCafe.getCantidadActual();
        System.out.println("Ingrese la cantidad de café a agregar: ");
        agregarCafe = leer.nextInt();
        if ((cantAct + agregarCafe)> capMax ) {
            System.out.println("La cafetera está llena");
             llenarCafe.setCantidadActual(capMax);         
        }else{
            System.out.println("Agregando café. . .");
            llenarCafe.setCantidadActual(cantAct+agregarCafe);
            
        }
        return llenarCafe;
    } 
    
    }

     


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

import EJ4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;


/**Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 *
 * @author carol
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service pelicula = new Service();
        
        
        ArrayList<Pelicula> nuevaPelicula = pelicula.crearPelicula();        
        for (Pelicula pelicula1 : nuevaPelicula) {
            System.out.println(pelicula1.toString()); // mostramos lista de peliculas
            System.out.println("---------------------------------------------------");
        }
        pelicula.mostrarMayor(nuevaPelicula);
        System.out.println("---------------------------------------------------");
        
        Collections.sort(nuevaPelicula,Comparadores.ordenarMayorMenor);
        System.out.println("La duracion de menor a mayor sería: \n" + nuevaPelicula.toString());
        
        System.out.println("---------------------------------------------------");
        
        Collections.sort(nuevaPelicula, Comparadores.ordenarMayorMenor.reversed());
        System.out.println("La duracion de mayor a menor sería: \n" + nuevaPelicula.toString());
        
        System.out.println("---------------------------------------------------");
        
        Collections.sort(nuevaPelicula,Comparadores.ordenarTitulo);
        System.out.println("El orden de los Titulos alfabeticamente es : \n" + nuevaPelicula.toString());
        
        System.out.println("---------------------------------------------------");
        
        Collections.sort(nuevaPelicula,Comparadores.ordenarDirector);
        System.out.println("El orden por Director alfabeticamente es : \n" + nuevaPelicula.toString());
        
        
        
    }
    
}

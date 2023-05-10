/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones: 
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla
 * todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * •Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla
 *
 * @author carol
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> listaPelicula = new ArrayList();
        String aux = null;//"" = null
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la película: ");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director: ");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duración de la película: ");
            pelicula.setDuracion(leer.nextDouble());
            listaPelicula.add(pelicula); // 
            System.out.println("Desea agregar otra película? si/no");
            aux = leer.next();
            while ((!aux.equalsIgnoreCase("si")) && (!aux.equalsIgnoreCase("no"))) {
                System.out.println("Error! Ingrese nuevamente su respuesta.");
                System.out.println("Desea agregar otra pelicula?(si/no) ");
                aux = leer.next();
            }

        } while ("si".equals(aux));
        return listaPelicula;

    }

    public void mostrarMayor(ArrayList<Pelicula> listaPelicula) {
        boolean x = true;
        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getDuracion() > 1) {
                if (x) {
                    System.out.println("Las peliculas que duran más de 1 hs son: ");
                    System.out.println(pelicula.toString());
                    x = false;
                } else {
                    System.out.println(pelicula.toString());
                }

            }
        }
        if (x) {
            System.out.println("No hay peliculas de más de 1 hs");
            
        }
     

    }

    
    
}

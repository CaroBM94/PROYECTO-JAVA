/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: 
 * Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author carol
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumnos> crearAlumno() {
        ArrayList<Alumnos> listaAlumnos = new ArrayList();
        String aux;
        do {
            Alumnos alumno = new Alumnos();
            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.next());

            ArrayList<Integer> nota = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota del alumno: ");
                nota.add(leer.nextInt());

            }
            alumno.setListaNotas(nota);
            System.out.println("Desea agregar otro alumno?(si/no) ");
            aux = leer.next();
            listaAlumnos.add(alumno);
            while ((!aux.equalsIgnoreCase("si")) && (!aux.equalsIgnoreCase("no"))) {
                System.out.println("Error! Ingrese nuevamente su respuesta.");
                System.out.println("Desea agregar otro alumno?(si/no) ");
                aux = leer.next();
            }
            
            
        } while ("si".equals(aux));
        
        listaAlumnos.forEach((x)-> System.out.println("El nombre del alumno es : "+ x.getNombre()+" " + " Sus notas son: "+x.getListaNotas()));
        
       return listaAlumnos;
       
              

    }
    
//    public static boolean validacion(String respuesta){
//      respuesta = respuesta.toLowerCase();
//      while (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")){
//          System.out.println("Ingrese una respuesta válida (si/no)");
//          leer.next().toLowerCase();}
//      return respuesta.equals("si")
//      
//         public static boolean validarEntrada(String entrada) {
//             
//         }
////    entrada = entrada.toLowerCase();
////    
//    while (!entrada.equals("sí") && !entrada.equals("si") && !entrada.equals("no")) {
//        System.out.print("Por favor, ingrese una entrada válida (sí/no): ");
//        Scanner scanner = new Scanner(System.in);
//        entrada = scanner.nextLine().toLowerCase();
//    }
//    
//    return entrada.equals("sí") || entrada.equals("si"); 
    
    public double notaFinal(ArrayList<Integer>notasFinales){
        double suma = 0;
        
        for (Integer x : notasFinales) {
            suma += x;
        }
        
        return  suma/notasFinales.size();
        
//        System.out.println("Ingrese el nombre que desea buscar: ");
//        String nombreBuscado = leer.next();
//        
//        Iterator<Alumnos> it = alumno1.iterator();
//        while(it.hasNext()){
//            Alumnos aux = it.next();
//            int i = 0;     
//            if (nombreBuscado.equals(aux.getNombre())) {
//                System.out.println("La nota final es: " + ((aux.getListaNotas().get(i)/3)));
                
            }
            
        }
        
    



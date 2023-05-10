/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ13_CURSO;

import EJ13_CURSO.Ej13_Curso;
import EJ13_CURSO.Ej13_CursoService;

/**
 *
 * @author carol
 */
public class Ej13_CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println("*** CONTROL DE CURSOS ´EL QUE MAS APRENDE´ ***");
        System.out.println(" ");
        
        Ej13_CursoService cs = new Ej13_CursoService ();
       Ej13_Curso curso1 = cs.crearCurso();
        cs.calcularGananciaSemanal(curso1);
    }
    
}

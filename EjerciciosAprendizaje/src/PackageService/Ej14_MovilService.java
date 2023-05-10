/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageService;

import PackageClass.Ej14_Movil;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej14_MovilService {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Ej14_Movil cargarCelular(){
        Ej14_Movil celular = new Ej14_Movil();
        
        System.out.println("Ingrese la marca: ");
        celular.setMarca(leer.next());
        System.out.println("Ingrese el precio: ");
        celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo: ");
        celular.setModelo(leer.next());
        System.out.println("Ingrese la capacidad de memoria RAM en GB: ");
        celular.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento en GB: ");
        celular.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingresar codigo de 7 digitos: ");
        celular.setCodigo(ingresarCodigo(celular));

        System.out.println(celular.toString());
        
        return celular;
    }
    public int [] ingresarCodigo(Ej14_Movil celular){
        int [] codigo = new int [celular.getCodigo().length];
        String codigo1 = leer.next();
        while(codigo1.length() != 7){
            System.out.println("ERROR. El codigo debe ser de 7 digitos. Ingreselo nuevamente: ");
            codigo1 = leer.next();
        }

        for (int i = 0; i < celular.getCodigo().length; i++) {
           codigo[i] = Integer.parseInt(codigo1.substring(i, i+1));
        }
        
        return codigo;
    }
}

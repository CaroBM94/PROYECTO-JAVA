/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageMain;

import PackageClass.Ej05_Cuenta;
import PackageService.Ej05_CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ej05_CuentaMain {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Ej05_CuentaServicio servicio = new Ej05_CuentaServicio();
        Ej05_Cuenta cuenta1 = servicio.crearCuenta();
        
        int opcion;
        
        do {
            System.out.println("\n---------------------");
            System.out.println("MENU BANCARIO");
            System.out.println("1 - Ingresar dinero"); 
            System.out.println("2 - Retirar dinero"); 
            System.out.println("3 - Extraccion rapida"); 
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - SALIR"); 
            System.out.println("---------------------"); 
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    servicio.ingreso(cuenta1);
                    break;
                case 2:
                    servicio.retiro(cuenta1);
                    break;
                case 3:
                    servicio.extraccionRapida(cuenta1);
                    break;
                case 4:
                    servicio.consultarSaldo(cuenta1);
                    break;
                case 5:
                    servicio.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
    
}
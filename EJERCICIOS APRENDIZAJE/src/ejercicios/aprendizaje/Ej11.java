/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
* 
 *
 * @author carol
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int operandoA, operandoB, opcion = 0;
     
     do{
         switch(opcion){
             case 1:
                 break;
             case 2:
                 break;
             case 3:
                 break;
             case 4:
                 break;
             case 5:
                 break;
         }
     }
     
    }
    
}


/*Autor: Francisco
public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         int op=0,n1,n2;
         String letra = "n";
         
        do{
        System.out.println("Ingrese una opcion: 1 Suma, 2 Resta, 3 Multiplicación, 4 Division, 5 Salir");
        op = leer.nextInt();

        
        
        switch(op){
            
            case 1: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Suma(n1,n2));break;
            
            case 2: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Resta(n1,n2));break;
            
            case 3: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Multi(n1,n2));break;
            
            case 4: System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println(Divi(n1,n2));break;
            
            case 5: System.out.println("Desea salir del Menú?");
            letra = leer.next();
            break;
            
            
            default: System.out.println("Dato incorrecto S/N");break;
            
        }
        
    }while("n".equalsIgnoreCase(letra));
      System.out.println("Ha salido del Menú");     
    }
    
    
    public static int Suma(int n1, int n2){
        
        int resultado = n1 + n2;
return  resultado;
}
      public static int Resta(int n1, int n2){
        
        int resultado = n1 - n2;
return  resultado;
}
    
      public static int Multi(int n1, int n2){
        
        int resultado = n1 * n2;
return  resultado;
}
        public static int Divi(int n1, int n2){
        
        int resultado = n1 / n2;
return  resultado;
}
*/

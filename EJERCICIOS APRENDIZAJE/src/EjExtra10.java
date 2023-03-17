
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 *
 * @author carol
 */
public class EjExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = (int) (Math.random()* 11), num2 = (int) (Math.random()* 11), result = num1*num2, resp = 0;
        System.out.println(num1);
        System.out.println(num2);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el resultado de la multiplicacion: ");
        resp = leer.nextInt();
        while (resp != result){
            System.out.println("Error, ingrese un nuevo resultado: ");
            resp = leer.nextInt();
        }
        System.out.println("Has adivinado :)");
    }
    
}

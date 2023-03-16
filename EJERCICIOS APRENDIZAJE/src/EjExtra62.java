
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class EjExtra62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        double altura, sumAltura=0,sumAlturaBajo=0;
        int countAltura=0,countAlturaBajo=0;
        double promedioAltura;
        double promedioAlturaBajo;
        System.out.println(" Ingrese la cantidad de personas ");
        n = teclado.nextInt();
        
        for (int i = 0; i < n ; i++)
        {
            System.out.println("Ingrese la altura de la persona numero"+ i + ":");
            altura = teclado.nextDouble();
            
            sumAltura+= altura;
            countAltura++;
            {
                if(altura<1.60){
                    sumAlturaBajo += altura;
                    countAlturaBajo++;
                }
                    
            }
            
            if (countAltura>0){
                promedioAltura = sumAltura / countAltura;
                System.out.println("El promedio de alturas en GENERAL es: "+ promedioAltura);
            }
            if (countAlturaBajo>0){
                promedioAlturaBajo= sumAlturaBajo / countAlturaBajo;
                System.out.println("El promedio de estaturas por debajo de los 1.60 es:" + promedioAlturaBajo);
            }
            
            
        }


    }
}
    
    


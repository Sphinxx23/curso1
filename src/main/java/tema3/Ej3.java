/*Realizar un programa en Java que solicite al usuario dos números distintos y calcule y muestre
por pantalla cuál es el mayor.*/
package tema3;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
       //Variables
       Scanner sc = new Scanner(System.in);
       int numA, numB;
       
       //Datos al usuario
        System.out.println("Introduzca dos numeros");
        numA=sc.nextInt();
        numB=sc.nextInt();
        
        //Bifurcacion
        if (numA>numB) {
            System.out.println("El numero mayor es " + numA);
        } else {
            System.out.println("El numero mayor es " + numB);
        }
       
    }
    
}

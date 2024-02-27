/*Realizar un programa en Java que solicite al usuario dos números enteros e indique si son o no
iguales.*/
package tema3;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        //Variables
        int numa, numb;
        Scanner sc = new Scanner(System.in);
        
        //Datos al usuario
        System.out.println("Introduzca dos numeros, iguales o diferentes");
        numa=sc.nextInt();
        numb=sc.nextInt();
        
        //Bifurcacion
        if (numa==numb) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }
    }
    
}

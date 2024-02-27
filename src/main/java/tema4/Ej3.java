/*
 Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación
solicitará por teclado un número; si ese número está fuera del rango se volverá a solicitar otro
número, así constantemente mientras el usuario se equivoque. El programa acaba cuando el
usuario introduce un valor correcto.
 */
package tema4;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int min, max, num;
        
        //Datos al usuario
        System.out.println("Introduzca valor mínimo y valor máximo");
        min=sc.nextInt();
        max=sc.nextInt();       
        System.out.println("Introduzca un numero que se encuentre entre el rango de numeros anterior");
        num=sc.nextInt();
        
        //bucle
        while (num<min || num>max) {            
            System.out.println("Num introducido incorrecto");
            System.out.println("Introduzca un numero que se encuentre entre el rango de numeros anterior");
            num=sc.nextInt();
        }
        System.out.println("Muy bien :) ");
        //este ejercicio es mejor hacerlo con un do while, para no repetir codigo, asi tb funciona pero tiene mas lineas
    }
}

/*1. Realiza un programa en Java que solicite al usuario un número e indique si es par o impar.*/
package tema3;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
    //Variables
    int num;
    final int CONST_DIV = 2;
    Scanner sc = new Scanner(System.in);
    //Pedir numero al usuario
        System.out.println("Introduzca un numero cualquiera");
        num=sc.nextInt();
    //Bifurcacion
        if (num%CONST_DIV == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}

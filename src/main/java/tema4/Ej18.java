/*
 Realizar un programa en Java que pida dos números enteros positivos al usuario (n1 y n2) y
calcule y muestre por pantalla el resultado de n1*n2, sin utilizar el operador * (mediante
sumas).
 */
package tema4;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, acc=0;
        
        do {            
           System.out.println("Introduce dos numeros positivos");           
           num1=sc.nextInt();
           num2=sc.nextInt();
        } while (num1<0||num2<0);
        
        for (; num2!=0; num2--) {
            acc=acc + num1;
        }       
        System.out.println("EL resultado es " + acc );
    }
}

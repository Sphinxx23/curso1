/*
 Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
positivo y su cuadrado, en el caso que no sea alguna de estas cosas, no mostraremos ningún
mensaje. El proceso se repetirá hasta que el número introducido por teclado sea 0.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej5t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, cuad;
        
        do {            
            System.out.println("Introduce un numero");
            n=sc.nextInt();
            
            cuad=n*n;
            
            if (n>0 && n%2==0) {
                System.out.println("Positivo, par y su cuadrado es " + cuad);
            }else if(n>0){
                System.out.println("Positivo y su cuadrado es " + cuad);
            }else if(n<0 && n%2==0){
                System.out.println("Negativo, par y su cuadrado es " + cuad);
            }else if (n<0){
                System.out.println("Negativo y su cuadrado es " + cuad);
            }
            
        } while (n!=0);
        
        System.out.println("Introducido el 0, ha finalizado");
    }
}

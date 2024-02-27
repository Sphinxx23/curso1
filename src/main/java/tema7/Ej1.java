/*
 Diseñar un programa que solicite al usuario que introduzca por teclado cinco números decimales, 
los almacena en un vector y a continuación muestra los números en el mismo orden que se han introducido.
 */
package tema7;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float aux;
        float[]numeros=new float[5];
        
        for (int i = 0; i < numeros.length; i++) {
           
            System.out.println("Introduce el numero que quieras en la posicion numero " + i);
            aux=sc.nextFloat();
            numeros[i]=aux;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Lo que se encuentra en la direccion de memoria numero " + i + " es " + numeros[i]);
        }
        
    }
}

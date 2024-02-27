/*
 Escribir una aplicación que solicite al usuario cuantos números desea introducir.
A continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso al introducido.
 */
package tema7;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cantidad, auxx;
        int[] array;
        
        System.out.println("Introduce cuantos numeros quieres meter en el array");
        cantidad=sc.nextInt();
        
        array=new int[cantidad];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero para cada dir de memoria ");
            auxx=sc.nextInt();
            
            array[i]=auxx;
        }
        
        for (int i = array.length-1; i >=0; i--) {
            System.out.println("El numero de la direccion de memoria con numero "+ i + " es: " + array[i]);
        }
        
    }
}

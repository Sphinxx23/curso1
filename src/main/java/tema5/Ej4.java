/*
 Diseña una función cuyo cometido sea el mismo que el del ejercicio 1 pero esta vez, se
recibirán tres números y devolverá máximo de los tres.
 */
package tema5;

import Libreria.LibreriaMatematicas;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca 3 numeros separados por un espacio (Ejemplo: 5 7 6)");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        resultado= LibreriaMatematicas.numMayor(num1, num2, num3);
        System.out.println("El numero mayor de los 3 es " + resultado);
    }
}

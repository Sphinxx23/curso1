/*
Realizar un programa en Java que pida dos números enteros y los muestre por pantalla
ordenados de forma creciente (se debe utilizar el operador ternario)
 */
package practicaexamn;

import java.util.Scanner;

public class ej5t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, ternMayor, ternMenor;
        String ternario;
        
        System.out.println("Introduce dos numeros enteros separados por un espacio ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        
//        ternMayor=num1>num2?num1:num2;
//        ternMenor=num1>num2?num2:num1;
//        System.out.println("El mayor es " + ternMayor + " > " + ternMenor);

        ternario=(num1>num2)? num1 + " > " + num2: num2 + " > " + num1;
        System.out.println(ternario);
    }
}

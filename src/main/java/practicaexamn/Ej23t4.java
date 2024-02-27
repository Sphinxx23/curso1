/*
 Realizar un programa que muestre las tablas de multiplicar del 1-10, el numero de veces que diga el usuario
 */
package practicaexamn;

import java.util.Scanner;

public class Ej23t4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, acc;

        do {
            System.out.println("Introduce numero");
            num = sc.nextInt();
        } while (num <= 0);

        for (int i = 0; i < num; i++) {
            System.out.println("");
            for (int j = 1; j < 11; j++) {
                System.out.println("");
                for (int k = 1; k < 11; k++) {
                    acc = j * k;
                    System.out.println(j + "x" + k + "=" + acc);
                }
            }
        }

    }
}

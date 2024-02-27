/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

public class Ej24t4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, divN, aux1, cont = 1;

        do {
            System.out.println("Introduce num impar ");
            n = sc.nextInt();
        } while (n <= 0 || n % 2 == 0);

        divN = n / 2;
        aux1 = divN;

        for (int j = 0; j < divN + 1; j++) {
            for (int k = aux1; k > 0; k--) {
                System.out.print(" ");
            }
            aux1--;

            for (int i = 0; i < cont; i++) {
                System.out.print("*");
            }
            cont = cont + 2;

            System.out.println("");

        }
        
        cont = n - 2;
        aux1 = 1;
        
        for (int i = 0; i < divN; i++) {
            for (int j = aux1; j > 0; j--) {
                System.out.print(" ");
            }
            aux1++;
            for (int j = 0; j < cont; j++) {
                System.out.print("*");
            }
            cont = cont - 2;
            
            System.out.println("");

        }

    }
}

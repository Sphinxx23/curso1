/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;


public class Ej11b {

    public static void main(String[] args) {
        int num, acc=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un positivo");
            num = sc.nextInt();
        } while (num <= 0);
               
        for (int i = 1; i <= num; i++) {
                      
            if (num%i==0) {
                acc+=i;
            }
        }
        System.out.println("El resultado es " + acc);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

public class Ej30t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, divN;
        
        do {            
            System.out.println("Introduce num impar");
            n=sc.nextInt();
        } while (n<=0 || n%2==0);
        
        divN=n/2;
        
        
        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        
        for (int i = 0; i < divN; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
               
    }
 
}

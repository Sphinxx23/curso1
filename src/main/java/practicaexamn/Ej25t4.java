/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

public class Ej25t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {            
            System.out.println("Introduce un numero ");
            n=sc.nextInt();
        } while (n<=0);
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    
    
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

public class Ej4t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,cont=0;
        
        do {            
            System.out.println("Introduce un numero positivo");
            n1=sc.nextInt();
        } while (n1<0);
        
        while (cont<n1) {            
            System.out.print(cont+",");
            cont++;
        }
        System.out.println(cont + ".");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

public class Ej13 {

    
     public static String figura (int num){
        String miFigura="";
         for (int i = 1; i < num - 2; i++) {
            if (i % 2 == 0) {
                miFigura=miFigura + " ";               
            } 
                for (int j = 0; j < num; j++) {
                    miFigura= miFigura + "*";
                }
                miFigura=miFigura + "\n";
            
        }  
        return miFigura;
    }
    
    
    
    public static void main(String[] args) {
        int num;       
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un entero");
            num = sc.nextInt();
        } while (num <= 3);

        System.out.println(figura(num));

    }
}

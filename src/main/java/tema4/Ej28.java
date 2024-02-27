/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import java.util.Scanner;
public class Ej28 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont=1;
        
        do {            
            System.out.println("Introduce un numero positivo e impar ");
            num=sc.nextInt();
        } while (num<=0&&num%2!=0);
               
        for (int j= 0; j<num; j++) {                         
            
            if (cont==num) {
                for (int i = 0; i < cont-1; i++) {
                     System.out.print("*");
                }
            }else{
                for (int i = 0; i < cont-1; i++) {
                    System.out.print(" ");                
                }    
            }
            
            cont++;
            System.out.println("*");    
        }
                       
    }
       
}

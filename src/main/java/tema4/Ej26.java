/*
 26. Realiza un programa que dibuje un triángulo dependiendo del valor de n introducido por el
usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont=1;
        
        do {            
            System.out.println("Introduce un numero positivo e impar ");
            num=sc.nextInt();
        } while (num<=0&&num%2!=0);
                
        for (num=num; num>0; num--) {                         
            for (int i = 0; i < cont; i++) {
                System.out.print("*");                
            }
            cont++;
            System.out.println("");    
        }
                       
    }
       
}


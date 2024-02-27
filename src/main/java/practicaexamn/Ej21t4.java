/*
 21. Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos del
número que indique previamente el usuario.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej21t4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {            
            System.out.println("Introduce numero del 1-100");
            n=sc.nextInt();
        } while (n<1||n>100);
            
        for (int i = 1; i < 101; i++) {
            
            if (i%n==0) {
                System.out.print("---- ");
                continue;
            }
            System.out.print(i + " ");
        }
    }

}

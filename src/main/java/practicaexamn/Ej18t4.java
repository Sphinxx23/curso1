/*
 Realizar un programa en Java que pida dos números enteros positivos al usuario (n1 y n2) y
calcule y muestre por pantalla el resultado de n1*n2, sin utilizar el operador * (mediante
sumas).
 */
package practicaexamn;

import java.util.Scanner;

public class Ej18t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, acc=0;
        
        do {            
            System.out.println("Introduce n1 y n2");
            n1=sc.nextInt();
            n2=sc.nextInt();
        } while (n1<=0||n2<=0);
        
        for (int i = 0; i < n2; i++) {
            acc=acc+n1;
        }
        System.out.println(acc);
    }
}

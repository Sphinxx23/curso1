/*
 Realiza un programa que dibuje un cuadrado dependiendo del valor (n) introducido por el
usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;
import java.util.Scanner;
public class Ej25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        
        do {            
            System.out.println("Introduce un numerin impar");
            num=sc.nextInt();
        } while (num<=0&&num%2!=0);
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

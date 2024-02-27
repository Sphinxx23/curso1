
package tema4;
import java.util.Scanner;
public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, div1;
        
        do {            
            System.out.println("Introduce un numero positivo e impar ");
            num=sc.nextInt();
        } while (num<=0&&num%2!=0);
        
        div1=num/2;
        
        System.out.print(" ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
                
        for (int i = 0; i < div1; i++) {
            System.out.print("*");
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            } 
            System.out.println("*");
        }
                
        System.out.print(" ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        
    }
}


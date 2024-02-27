/*
 Modificar el anterior para que se pueda con negativos
 */
package tema4;
import java.util.Scanner;
public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, acc=0;
                         
        System.out.println("Introduce dos numeros ");           
        num1=sc.nextInt();
        num2=sc.nextInt();
               
        for (; num2!=0; num2--) {
            acc=acc + num1;
        }       
        System.out.println("EL resultado es " + acc );
    }
}


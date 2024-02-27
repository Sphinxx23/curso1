/*
 Realizar un programa en Java que pida un número al usuario y muestre la
tabla de multiplicar de ese número por pantalla siguiendo el formato siguiente:
 */
package tema4;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;
        int acc;
        
        do {                
            System.out.println("Introduce un numero para calcular su tabla de multiplicar"); 
            num=sc.nextByte();
        } while (num<0||num>9);
        
        for (byte c=0 ; c <= 10; c++) {
            acc=num*c;
            System.out.println(num + "x" + c + " = " + acc );
            
        }
    }
  
}

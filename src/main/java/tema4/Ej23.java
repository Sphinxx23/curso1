/*
 Realizar un programa que muestre las tablas de multiplicar del 1-10, el numero de veces que diga el usuario
 */
package tema4;
import java.util.Scanner;
public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num, d;
        int acc;
        
        do {                
            System.out.println("Introduce un numero para calcular todas las tablas ese numero de veces"); 
            num=sc.nextByte();
        } while (num<=0);
        
        for (int j=0 ; j !=num; j++) {  
            System.out.println("");
            for (int i = 1; i < 11; i++) {                          
                d=1;
                do {                
                    acc=i*d;
                    System.out.println(i + "x" + d + " = " + acc );
                    d++;
                } while (d<11);
            }
        }
    }
}

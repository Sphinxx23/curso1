/*
 Modifica el ejercicio de la tabla de multiplicar, para que el número introducido por pantalla esté acotado entre 1 y 10. 
Dependiendo del número que introduzca el usuario mostraremos todas las tablas de multiplicar desde el número 
introducido por el usuario hasta la tabla de 10 inclusive.
 */
package tema4;
import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num, d;
        int acc;
        
        do {                
            System.out.println("Introduce un numero para calcular su tabla de multiplicar"); 
            num=sc.nextByte();
        } while (num<1||num>10);
        
        for (; num < 11; num++) {           
            System.out.println("");
            d=1;
            do {                
                acc=num*d;
                System.out.println(num + "x" + d + " = " + acc );
                d++;
            } while (d<11);
            
        }
    }
}


            
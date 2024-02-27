/*
 Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando “*” para ello.
Ejemplo si n=5
****
***
**
*
 */
package tema4;
import java.util.Scanner;
public class Ej16 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner (System.in);
        
        do {            
            System.out.println("Introduzca un numero");
            n = sc.nextInt();
        } while (n<=0);
        
        
       /* do {   
            for (int cont = n; cont > 0; cont--) {
                System.out.print("*");
            }
            System.out.println("");
            n--; 
            
        } while (n>0);
        */
       
        for (; n > 0; n--) {
            for (int cont = n; cont > 0; cont--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/*
 Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando “*” para ello.
Ejemplo si n=5

****
***
**
*
 */
package practicaexamn;

import java.util.Scanner;

public class Ej16t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int nUsu;
       
        do {            
            System.out.println("Introduce un numero positivo");
            nUsu=sc.nextInt();
        } while (nUsu<=0);
        
        for (int i = nUsu; i>0; i--) {                      
            for (int j = nUsu; j>0; j--) {
                System.out.print("*");
            }
            nUsu--;
            System.out.println("");
        }
    }
}

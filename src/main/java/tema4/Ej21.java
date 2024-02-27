/*
 21. Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos del
número que indique previamente el usuario.
 */
package tema4;
import java.util.Scanner;
public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short numero;
        
        do {            
            System.out.println("Introduzca un numero del 1-100");
            numero=sc.nextShort();
        } while (numero<1||numero>100);
        
        for (int i = 1; i < 101; i++) {
            if (i%numero==0) {
                System.out.println(" ");
                continue;
            }
            System.out.println("numero" + i );
        }
    }
}

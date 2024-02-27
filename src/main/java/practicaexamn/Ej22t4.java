/*
 Realiza un programa en java que pida dos números enteros (base, exponente) y calcule base
elevado a exponente sin usar el operador * ni Math.pow, es decir se debe realizar mediante
sumas. Supondremos que la base y el exponente son positivos ambos.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej22t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente, suma, producto=0, equis;
        
        do {            
            System.out.println("Introduce la base y el eexponente");
            base=sc.nextInt();
            exponente=sc.nextInt();
        } while (base<=0||exponente<0);
        
        equis=1;
        for (int i = exponente; i > 0; i--) {
           producto=0;
            for (int j = base; j >0 ; j--) {
                producto=producto+equis;               
            }
            equis=producto;
        }
        
        System.out.println(equis);
    }
}

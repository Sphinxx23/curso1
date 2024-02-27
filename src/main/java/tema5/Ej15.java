/*
 Realizar una función recursiva en Java que pida un número entero positivo (n) 
y muestre por pantalla los números de n, n-1, n-2 …. 1.
 */
package tema5;

import Libreria.Leer;

public class Ej15 {
    public static void deNa0 (int n){       
        if (n==1) {
            System.out.print("1");
            
        }else{
            System.out.print(n);
            deNa0(n-1);
        }      
    }
    
    
 
    
    public static void main(String[] args) {
        int a;
        a=Leer.leerEnteroPositivo("Introduce un positivo");
        deNa0(a);
    }
}

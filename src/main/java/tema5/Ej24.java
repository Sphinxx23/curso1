/*
 Realizar una función recursiva en Java que pida un número entero positivo (n) y muestre por pantalla los números de 1,2, … n-1, n
 */
package tema5;

import Libreria.Leer;

public class Ej24 {
        
      public static void deUnoA (int n, int cont){       
        if (cont==n) {
            System.out.print(n);
            
        }else{
            System.out.print(cont + " ");
            deUnoA(n, cont+1);
        }      
    }

public static void main(String[] args) {
        int numUsu, cont=1;
               
        numUsu=Leer.leerEnteroPositivo("Introduce entero positivo ");
        
        deUnoA(numUsu, cont);
               
    }
}

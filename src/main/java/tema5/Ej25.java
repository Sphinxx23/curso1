/*
 Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci. En esta serie el n-ésimo valor se calcula sumando los dos valores anteriores. Es decir: Recursivo
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 0

 */
package tema5;

import Libreria.Leer;

public class Ej25 {
    
    public static int fibonacci(int nUs){
        if (nUs==0||nUs==1) {
            return nUs;
        }else{
            return fibonacci(nUs-1)+fibonacci(nUs-2);
        }
    }
    
    public static void main(String[] args) {
        int numUsu, result;
        
        numUsu=Leer.leerEnteroPositivo("Introduce un num positivo ");
        
       result=fibonacci(numUsu);
       
        System.out.println(result);
    }
}

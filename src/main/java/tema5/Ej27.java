/*
 Diseñar una función recursiva que dado un número N entero positivo,
muestra el número binario correspondiente a dicho número (en decimal) recibido (mediante divisiones por 2).
 */
package tema5;

import Libreria.Leer;

public class Ej27 {
    
    public static void numBinario (int num){
        
        if (num==1||num==0) {
            System.out.print(num);
            
        }else{
            numBinario(num/2);
            System.out.print(num%2);                  
        }      
    }
    
    public static void main(String[] args) {
        int numUsu;
        numUsu=Leer.leerEnteroPositivo("Introduce un numero positivo");
        numBinario(numUsu);
    }
}

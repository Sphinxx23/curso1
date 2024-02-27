//Escribir una función que retorne la suma de los divisores de un número. 
//El alumno deberá hacer dos versiones de funciones una que permita la reutilización de funciones anteriores y otra que no permita realizar internamente 
//ninguna llamada a ninguna otra función.
package tema5;

import static Libreria.Leer.leerEnteroPositivo;
import static Libreria.LibreriaMatematicas.esDivisor;


public class Ej11 {
   
    public static int sumaDivisores(int num){
        int acc=0;
        
        for (int i = 1; i <= num; i++) {
                      
            if (esDivisor(num, i)) {
                acc+=i;
            }
        }
        return acc;
    }
    public static void main(String[] args) {
        int num;
        num=leerEnteroPositivo("Introduce un numero entero");       
        
        System.out.println("EL RESULTADO ES "  + sumaDivisores(num));
    }
        
}

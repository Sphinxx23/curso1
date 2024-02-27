/*
 Realizar un programa que muestre por pantalla el fibonacci de los N primeros números enteros, empezando desde 0. 
Para ello hacer una función que reciba un número N y retorne el String final con los resultados. 
Se debe hacer uso de la función fibonacci ya realizada
 */
package tema5;

import Libreria.Leer;

public class Ej28 {
    public static String cadenaFibo (int nUs){
        String cadena="";
        for (int i = 0 ; i <= nUs; i++) {
            cadena=cadena+Ej25.fibonacci(i) + " ";
        }
        return cadena;
    }
    
    public static void main(String[] args) {
        int leer;
        leer = Leer.leerEnteroPositivo("Introduce un entero ");
        System.out.println(cadenaFibo(leer));
      
    }
}

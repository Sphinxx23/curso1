/*
 Realiza un programa en Java que muestre por pantalla los 500 primeros caracteres de la tabla
UNICODE, al ejecutarse se mostrará la lista de la siguiente forma:
0: xx
1: xx
…
499: xx
 */
package tema6;

import Libreria.Leer;

public class Ej1 {
    
    public static String unicode(int numInic, int numFin) {
        int contIndic=numInic;
        char unicode;
        String cadena="";

        for (int i = numInic; i < numFin; i++) {
            unicode= (char)contIndic;
            cadena=cadena + contIndic + ": " + unicode + "\n";
            contIndic++;
            
        }
        return cadena;
    }
    
    public static void main(String[] args) {
        int numUsu1, numUsu2;
        
        do {            
            numUsu1 = Leer.leerEnteroPositivo("Introduce entero posit");
            numUsu2 = Leer.leerEnteroPositivo("Introduce otro entero posit");
        } while (numUsu1>numUsu2);
        
        System.out.println(unicode(numUsu1, numUsu2));
    }
}

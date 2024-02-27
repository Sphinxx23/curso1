/*
 Introducir por teclado una frase y mostrar la frase separada por espacios en blanco, carácter a carácter.
El programa continúa hasta que se introduce la palabra “FIN” (da igual si está en mayúsculas o no debería funcionar del mismo modo).
 */
package tema6;

import java.util.Scanner;

public class Ej4 {

    public static String cadenaSeparada(String cadena) {
        char aux;
        int longit;
        String cadSep = "";

        longit = cadena.length();
        for (int i = 0; i < longit; i++) {
            aux = cadena.charAt(i);
            cadSep = cadSep + " " + aux;
        }
        return cadSep;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, result;

        do {
            System.out.println("Introduce la frase ");
            cadena = sc.nextLine();
            if (cadena.equalsIgnoreCase("fin")) {
                break;
            }
            result = cadenaSeparada(cadena);
            System.out.println(result);
        } while (true);        
    }
}

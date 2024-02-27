/*
Realizar un programa que haciendo uso de bucles anidados muestre por pantalla la siguiente secuencia de números. El programa recibirá un número entero y positivo.
Ejemplo: Para N=6
Ficha: |1:1|
Ficha: |2:1| |2:2|
Ficha: |3:1| |3:2| |3:3|
Ficha: |4:1| |4:2| |4:3| |4:4|
Ficha: |5:1| |5:2| |5:3| |5:4| |5:5|
Ficha: |6:1| |6:2| |6:3| |6:4| |6:5| |6:6|

 */
package tema5;

import Libreria.Leer;
import java.util.Scanner;

public class Ej23 {

    public static String secuencia(int numUsu) {

        String cadena = "";
        for (int i = 1; i <= numUsu; i++) {
            cadena = cadena + "Ficha: ";
            for (int j = 1; j <= i; j++) {
                cadena = cadena + "|" + i + ":" + j + "|";
            }
            cadena = cadena + "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        int numUsu;
        String resultado;
        Scanner sc = new Scanner(System.in);
        numUsu = Leer.leerEnteroPositivo("Introduce un entero positivo");
        resultado = secuencia(numUsu);
        System.out.println(resultado);

    }
}

/*
 Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro.
Deberás utilizar el máximo número de funciones.

 */
package tema5;

import java.util.Scanner;
import static tema5.Ej8.leerEntero;

public class Ej19 {

    public static boolean esDivisor(int a, int b) {
        return a % b == 0;
    }

    public static String primo(String cadenaDivisores) {
        int aux, cont;
        String cadenaFinal = " ";
        Scanner sc = new Scanner(cadenaDivisores);

        while (sc.hasNext()) {
            aux = Integer.parseInt(sc.next());
            cont=0;
            for (int i = 1; i <= aux; i++) {
                if (aux % i == 0) {
                    cont++;                   
                }
            }
            if (cont == 2) {
                cadenaFinal = cadenaFinal + aux + " ";
            }
        }
        return cadenaFinal;
    }

    public static void main(String[] args) {
        int num;
        String cadenaDivisores = " ";

        num = leerEntero("Introduce un entero positivo");

        for (int i = 1; i <= num; i++) {

            if (esDivisor(num, i)) {
                cadenaDivisores = cadenaDivisores + i + " ";
            }
        }
        System.out.println("Todos los divisores son: " + cadenaDivisores);
        
        System.out.println("Los divisores que son primos son: " + primo(cadenaDivisores));

    }
}

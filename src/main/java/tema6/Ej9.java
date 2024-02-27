/*
Haciendo uso de la clase StringBuilder vista en clase, crea una función que permita hacer más
compleja una contraseña. Para ello, crea una función de nombre ofuscaPass, que reciba un
String y devuelva un String con la cadena ofuscada. La ofuscación será básicamente cambiar las
vocales según esta estructura:
● ‘a’ y ‘A’ por ‘@’
● ‘e’ y ‘E’ por ‘3’
● ‘i’ e ‘I’ por ‘1’
● ‘o’ y ‘O’ por ‘0’
● ‘u’ y ‘U’ por ‘V’

Ejemplo: Entrada: contraseña -&gt; c0ntr@s3ñ@
 */
package tema6;

import java.util.Scanner;

public class Ej9 {

    public static StringBuilder contraCompleja(String contra) {
        StringBuilder sb = new StringBuilder(contra);
        int longit, e = 1;
        longit = contra.length();
        char aux;

        for (int i = 0; i < longit; i++) {
            aux = contra.charAt(i);

            switch (aux) {
                case 'a', 'A' -> sb.replace(i, e, "@");

                case 'e', 'E' -> sb.replace(i, e, "3");

                case 'i', 'I' -> sb.replace(i, e, "1");

                case 'o', 'O' -> sb.replace(i, e, "0");

                case 'u', 'U' -> sb.replace(i, e, "V");

            }
            e++;
        }

        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        String datUsu;

        System.out.println("Introduce tu contraseña simple ");
        datUsu = sc.nextLine();

        System.out.println("Tu nueva contraseña es: " + contraCompleja(datUsu));

    }
}

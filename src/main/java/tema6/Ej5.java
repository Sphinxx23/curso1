/*
Diseñar el juego de acierta la contraseña. 
Un usuario introduce una cadena y otro debe adivinarla. 
Cuando realice más de 3 intentos le daremos una pista (el número de caracteres), 
cuando lleve 3 más le daremos la otra pista (los dos últimos caracteres de la contraseña) a 
partir de aquí le mostraremos mayor o menor alfabéticamente.
 */
package tema6;

import java.util.Scanner;

public class Ej5 {

    public static String muestraPista1(String contra) {
        int aux;
        String aux2 = "";
        aux = contra.length();
        aux2 = aux2 + ("Pista 1: la longitud de la contraseña es de " + aux + " caracteres");
        return aux2;
    }

    public static String muestraPista2(String contra) {
        int n = 2;
        return contra.substring(contra.length() - n);
    }

    public static String compDicc(String contra, String intento) {
        String aux = "";

        if (contra.compareTo(intento) < 0) {
            aux = aux + "La contraseña aparece antes en el diccionario que el intento realizado";
        } else {
            aux = aux + "La contraseña aparece despues en el diccionario que el intento realizado";
        }
        return aux;
    }

    public static void juegoContraseña(String contra) {
        Scanner sc = new Scanner(System.in);
        String intento;

        for (int i = 1; true; i++) {

            System.out.println("Intenta adivinar la contraseña");
            intento = sc.nextLine().trim();
            if (intento.equals(contra)) {
                break;
            }

            if (i == 4) {
                System.out.println(muestraPista1(contra));
            }
            if (i == 7) {
                System.out.println("Pista 2: los dos dos ultimos caracteres son " + muestraPista2(contra));
            }
            if (i > 7) {
                System.out.println(compDicc(contra, intento));
            }

        }

        System.out.println("HAS ACERTADO!!!!!!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra;
       
        System.out.println("Introduce la contraseña ");
        contra = sc.nextLine().trim();
        
        juegoContraseña(contra);

    }
}

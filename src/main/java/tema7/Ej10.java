/*
 Realizar un programa que rellene una tabla (EED de 2 dimensiones), con caracteres introducidos por el usuario. 
Los caracteres se deben introducir con Scanner y haciendo uso de split.
El número de filas será 5, pero el número de columnas  de la tabla será irregular (como aparece en la imagen):
fila 0 -> sólo una columna, fila 1 -> sólo dos columnas … y posteriormente los muestre por pantalla. 
 */
package tema7;

import java.util.Scanner;

public class Ej10 {

    public static String pedirString(String msg) {
        Scanner sc = new Scanner(System.in);
        String auxCad;
        System.out.println(msg);
        auxCad = sc.nextLine();

        return auxCad;
    }

    public static String[] splitLenght(String msg1, String msg) {
        String[] arra;
        String cad;

        do {
            cad = pedirString(msg1);
            arra = cad.split(" ");
            if (arra.length != 15) {
                System.out.println(msg);
            }
        } while (arra.length != 15);

        return arra;
    }
//    public static String[] splitLenght(String msg1) {
//        String[] arra;
//        String cad;
//        
//        cad = pedirString(msg1);
//        arra = cad.split(" ");
//        return arra;
//    }

    public static char[][] introducirNumerosMatriz(char[][] tablaa, String[] aux) {
        int x = 0;
        for (int i = 0; i < tablaa.length; i++) {
            for (int j = 0; j < tablaa[i].length; j++) {

                tablaa[i][j] = aux[x++].charAt(0);

            }
        }
        return tablaa;
    }

    public static StringBuilder devuelveMatriz(char[][] array) {
        StringBuilder sb = new StringBuilder();
        char aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                aux = array[i][j];
                sb.append(aux).append(" ");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static void main(String[] args) {

        String[] vector;
        char[][] tabla = new char[5][];

        //Creacion de la tabla irregular 
        tabla[0] = new char[1];
        tabla[1] = new char[2];
        tabla[2] = new char[3];
        tabla[3] = new char[4];
        tabla[4] = new char[5];

        vector = splitLenght("Introduce 15 caracteres separados entre ellos por un espacio: Ej(@ ] * Ç)" , "Error, no tiene 15 caracteres");
        tabla = introducirNumerosMatriz(tabla, vector);
        System.out.println(devuelveMatriz(tabla));

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.Scanner;

/**
 * Diseñar un programa que pida al usuario letras de abecedario una a una
 * (mayúscula o minúscula), almacene en un tabla irregular y después muestre por
 * pantalla un triángulo como el que aparece en el ejemplo, el programa
 * finalizará cuando el usuario introduzca un ‘#’. Este es un ejemplo del tipo:
 * “casos de prueba acotados por caso de prueba especial” del PROGRAMAME”.
 */
public class Ej16T7 {

    public static char[][] rellenaTabla(char caractFinal) {
        char[][] tabla;
        int resta, cInic, cFin;
        char caracterInicial, aux;

        if (Character.isUpperCase(caractFinal)) {
            caracterInicial = 'A';
            
        } else {
            caracterInicial = 'a';
            
        }
        
        cFin=caractFinal;
        cInic=caracterInicial;
        

        resta = cFin - cInic+1;
        tabla = new char[resta][];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = new char[resta];
            aux = caracterInicial;
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = aux;
                aux++;
            }
            resta--;
        }

        return tabla;
    }

    public static String muestraMatriz(char[][] matriz) {
        StringBuilder sb = new StringBuilder();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int i = 0; i < matriz[fila].length; i++) {

                sb.append(matriz[fila][i] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracterUsu;
        char[][] tablaChar;

        do {
            System.out.println("Introduce una letra mayuscula, minuscula o # para finalizar");
            caracterUsu = sc.nextLine().charAt(0);

            if (Character.isLetter(caracterUsu)) {
                tablaChar = rellenaTabla(caracterUsu);
                
                System.out.println(muestraMatriz(tablaChar));               
            }

        } while (caracterUsu != '#');
        System.out.println("FIN");

    }
}

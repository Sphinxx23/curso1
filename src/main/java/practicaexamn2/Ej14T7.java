/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.Scanner;

/**
 *
 * @author PcBox
 */
public class Ej14T7 {

    public static void rellenaMatriz(int[][] matriz) {
        int xx = 1;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int i = 0; i < matriz[fila].length; i++) {
                if (xx == 4) {
                    xx = 1;
                }
                matriz[fila][i] = xx;
                xx++;
            }
        }

    }

    public static String muestraMatriz(int[][] matriz) {
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
        int[][] matriz;
        Scanner sc = new Scanner(System.in);
        int auxTam;

        int cant = sc.nextInt();
        for (int i = 0; i < cant; i++) {
            auxTam = sc.nextInt();
            matriz = new int[auxTam][auxTam];

            rellenaMatriz(matriz);
            System.out.println(muestraMatriz(matriz));
        }

        

    }
}

/*
 Realizar un programa que rellene con num aleatorios entre 1-100 de tamaño f y C pedidos al ususario, luego lo mostraremos por pantalla 

 */
package tema7;

import java.util.Scanner;

public class EjArray2D {

    public static int leerEnteroPositivo(String msg) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(msg);
            num = sc.nextInt();
        } while (num < 0);

        return num;
    }

    public static int[][] introducirNumerosMatriz(int n, int n2) {
        int auxx;
        int[][] arr = new int[n][n2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                auxx = (int) (Math.random() * (99) + 1);
                arr[i][j] = auxx;
            }

        }
        return arr;
    }

    public static StringBuilder devuelveMatriz(int[][] array) {
        StringBuilder sb = new StringBuilder();
        int aux;

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
        int f, c;
        int[][] arr;

        f = leerEnteroPositivo("Introduce las filas de la tabla");
        c = leerEnteroPositivo("Introduce las columnas de la tabla");
        arr = introducirNumerosMatriz(f, c);
        System.out.println(devuelveMatriz(arr));

    }
}

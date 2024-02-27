/*
 Idem al ej anterior pero la tabla irregular (siguiente ej)
 */
package tema7;

import Libreria.Leer;
import java.util.Scanner;

public class EjArray2Dirreg {
    public static int[][] introducirNumerosMatriz(int n, String msg) {
       Scanner sc = new Scanner (System.in);
        int auxx, c;
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(msg);
            c=sc.nextInt();
            arr[i]=new int[c];
                  
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
        int [][] arr2;
        int aux;
        
        aux=Leer.leerEnteroPositivo("Introduce el numero de filas ");
        
        
        
        arr2=introducirNumerosMatriz(aux, "Introduce el numero de columnas ");
        
        
        System.out.println(devuelveMatriz(arr2));
    }
    
}

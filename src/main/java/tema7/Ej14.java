/*
 Realiza un programa que contenga un método que rellene la matriz con números en secuencia 1,2,3,1 … 
de izquierda a derecha y de arriba a abajo. El método recibirá la matriz vacía y modificará su contenido. Posteriormente muestra la tabla por pantalla
      Ejemplo: si tamaño = 4

1 2 3 1
2 3 1 2 
3 1 2 3
1 2 3 1

 */
package tema7;

import java.util.Scanner;

public class Ej14 {

    public static void introducirNumerosMatriz(int[][] tabla) {
        int auxx = 1;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                if (auxx == 4) {
                    auxx = 1;
                }
                tabla[i][j] = auxx;
                auxx++;

            }

        }
       
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
        int iAux;
        int[][] matt;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño de la matriz ");
        iAux = sc.nextInt();

        matt = new int[iAux][iAux];
        introducirNumerosMatriz(matt);
        System.out.println(devuelveMatriz(matt));

    }
}

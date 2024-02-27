/*
Realizar un programa en Java que rellene una EED de 3 dimensiones (cubo) de tamaño 3 filas x 3 columnas x 3 de profundidad. 
Posteriormente mostrará el cubo “cortada por cortada”. La rellenaremos con números consecutivos y la mostraremos por pantalla.
1 2 3	10 11 12 	20 21 22	
4 5 6	13 14 15	23 24 25
7 8 9	16 17 18	26 27 28
 */
package tema7;

public class Ej12 {

    public static void rellenaCubo(int[][][] cubb) {
        int x = 1;
        for (int i = 0; i < cubb.length; i++) {
            for (int j = 0; j < cubb[i].length; j++) {
                for (int p = 0; p < cubb[i][j].length; p++) {
                    cubb[i][j][p] = x;
                    x++;
                }
            }
        }
    }

    public static String devuelveCUBO(int[][][] cubb) {
        StringBuilder sb = new StringBuilder();
        int aux;

        for (int i = 0; i < cubb.length; i++) {
            for (int j = 0; j < cubb[i].length; j++) {
                for (int p = 0; p < cubb[i][j].length; p++) {
                    aux = cubb[i][j][p];
                    sb.append(aux).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][][] cubo = new int[3][3][3];
        rellenaCubo(cubo);
        System.out.println(devuelveCUBO(cubo));
    }

}

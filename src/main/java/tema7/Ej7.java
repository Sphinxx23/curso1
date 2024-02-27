/*
 Implementar la función sinRepetidos() con el prototipo siguiente:

int[] sinRepetidos(int t[])

que construye y devuelve un vector del tamaño apropiado, con los elementos de t donde se han eliminado los datos repetidos. 

 */
package tema7;

public class Ej7 {

    public static int[] comprobarRepetidos(int[] array) {
        int aux, aux2, cont = 0, contArray = 0;
        int[] arrayFinal = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            cont = 0;
            for (int j = 0; j < array.length; j++) {
                aux2 = array[j];
                if (aux == aux2) {
                    cont++;
                }
            }

            if (cont < 2) {
                arrayFinal[contArray] = aux;
                contArray++;
            }

        }

        return arrayFinal;

    }

    public static StringBuilder devuelveVector(int[] array) {
        StringBuilder sb = new StringBuilder();
        int aux;
        for (int i = 0; i < array.length; i++) {

            aux = array[i];
            if (aux == 0) {
                continue;
            }

            sb.append(aux).append(" ");
        }
        return sb;
    }

    public static void main(String[] args) {
        int[] misFavs = {7, 22, 23, 28, 29, 36, 7, 23, 28, 4};
        int[] aux;

        aux = comprobarRepetidos(misFavs);
        System.out.println(devuelveVector(aux));
    }
}

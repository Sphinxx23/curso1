/*
 Leer una serie de 6 enteros que se almacenarán en un vector que hay que ordenar y mostrarlos por pantalla, 
a continuación, leer otra serie de 6 enteros, que también se guardarán en un vector y se mostrarán ordenados
(Para estas operaciones podéis utilizar los métodos de la clase Arrays).
Finalmente, fusionar los dos vectores en un tercero, de forma que los 12 números sigan ordenados (prohibido usar la clase Arrays para esto último). 
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {

    public static String pedirCadena(String msg) {
        Scanner sc = new Scanner(System.in);
        String cad;
        System.out.println(msg);
        cad = sc.nextLine();

        return cad;
    }

    public static int[] convertirStringToArray(StringBuilder sb, int cont) {
        String auxStr;
        int auxx;
        auxStr = sb.toString();
        int[] arrayInt = new int[cont];
        Scanner noTec = new Scanner(auxStr);

        for (int i = 0; i < arrayInt.length; i++) {
            if (noTec.hasNext()) {
                auxx = Integer.parseInt(noTec.next());
                arrayInt[i] = auxx;
            }

        }
        return arrayInt;
    }

    public static int[] juntarArray(int[] array1, int[] array2) {
        int[] arrayFinal;
        int aux, aux2;
        aux = (array1.length + array2.length);

        arrayFinal = new int[aux];

        for (int i = 0; i < array1.length; i++) {
            arrayFinal[i] = array1[i];
        }

        aux2 = array1.length;
        for (int i = 0; i < array2.length; i++) {
            arrayFinal[aux2] = array2[i];
            aux2++;
        }

        return arrayFinal;
    }

//    public static int[] ordenarArray(int[] arr) {
//        int[] arrayFin = new int[arr.length];
//        int arr1 = 0, arr2 = 1;
//
//        for (int arF = 0; arF < arrayFin.length; arF++) {
//
//            if (arr1 == arr.length && arr2 == arr.length) {
//                break;
//
//            } else if (arr2 == arr.length) {
//                if (arr[arr1] == arr[arr2]) {
//                    arrayFin[arF] = arr[arr1];
//                    arr1++;
//                } else if (arr[arr1] < arr[arr2]) {
//                    arrayFin[arF] = arr[arr1];
//                    arr1++;
//                } else {
//                    arrayFin[arF] = arr[arr2];
//
//                }
//
//            } else if (arr1 == arr.length) {
//                if (arr[arr1] == arr[arr2]) {
//                    arrayFin[arF] = arr[arr1];
//
//                } else if (arr[arr1] < arr[arr2]) {
//                    arrayFin[arF] = arr[arr1];
//
//                } else {
//                    arrayFin[arF] = arr[arr2];
//                    arr2++;
//                }
//            }
//
//        }
//
//        return arrayFin;
//    }

    public static void main(String[] args) {
        String cadAux, cadAux2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int[] arrayInt = new int[6];
        int[] arrayInt2 = new int[6];
        int[] arrayFin = new int[12];
        int[] arrayFin2 = new int[12];

        cadAux = pedirCadena("Introduce 6 enteros separados por un espacio ");
        sb.append(cadAux);
        arrayInt = convertirStringToArray(sb, 6);
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        cadAux2 = pedirCadena("Introduce 6 enteros separados por un espacio ");
        sb2.append(cadAux2);
        arrayInt2 = convertirStringToArray(sb2, 6);
        Arrays.sort(arrayInt2);
        System.out.println(Arrays.toString(arrayInt2));

        arrayFin = juntarArray(arrayInt, arrayInt2);
        Arrays.sort(arrayFin);
        System.out.println(Arrays.toString(arrayFin));
        

    }
}

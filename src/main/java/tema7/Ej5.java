/*
 Leer y almacenar n números enteros en un array. A partir de este se construirán otros dos
vectores con los elementos pares e impares del primer vector. Una vez finalizada la operación
mostraremos los dos arrays por pantalla.
 */
package tema7;

import java.util.Scanner;

public class Ej5 {

    public static int leerEntero(String msg) {
        int num;        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println(msg);
            num = sc.nextInt();
        } while (num <= 0);

        return num;
    }

    public static int[] introducirNumerosArray(int n, String msg) {
        Scanner sc = new Scanner(System.in);
        int auxx;
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(msg + i);
            auxx = sc.nextInt();
            arr[i] = auxx;
        }
        return arr;
    }

    public static int contadorPar(int[] array) {
        int cont = 0, aux;

        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux % 2 == 0 || aux == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int contadorImpar(int[] array) {
        int cont = 0, aux;

        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }

    public static StringBuilder stringPar(int[] array) {
        int aux;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux % 2 == 0 || aux == 0) {
                sb.append(aux).append(" ");

            }
        }
        return sb;
    }

    public static StringBuilder stringImpar(int[] array) {
        int aux;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux % 2 != 0) {
                sb.append(aux).append(" ");

            }
        }
        return sb;
    }

    public static String[] convertirStringToArray(StringBuilder sb, int cont) {
        String auxStr, auxx;
        auxStr = sb.toString();
        String[] arrayStr = new String[cont];
        Scanner noTec = new Scanner(auxStr);

        for (int i = 0; i < arrayStr.length; i++) {
            if (noTec.hasNext()) {
                auxx = noTec.next();
                arrayStr[i] = auxx;
            }

        }
        return arrayStr;
    }

    public static StringBuilder devuelveVector(String[] array) {
        StringBuilder sb = new StringBuilder();
        String aux;
        for (int i = 0; i < array.length; i++) {

            aux = array[i];

            sb.append(aux).append(" ");
        }
        return sb;
    }

    public static void main(String[] args) {
        int iAux, iPar, iImpar;
        int[] arrayAux;
        String[] arrayPar;
        String[] arrayImpar;
        StringBuilder par;
        StringBuilder impar;

        //Leer el lenght y meter los numeros en cada uno de los indices 
        iAux = leerEntero("Introduce el lenght del array ");
        arrayAux = introducirNumerosArray(iAux, "Introduce un valor para el indice numero: ");

        //Contador de pares o impares para usarlos luego en el lenght de cada vector
        iPar = contadorPar(arrayAux);
        iImpar =contadorImpar(arrayAux);

        //Crear string de pares y String de impares
        par = stringPar(arrayAux);
        impar = stringImpar(arrayAux);

        //Convertir cada string a un array 
        arrayPar = convertirStringToArray(par, iPar);
        arrayImpar = convertirStringToArray(impar, iImpar);

        //Salida de los dos arrays
        System.out.println(devuelveVector(arrayPar));
        System.out.println(devuelveVector(arrayImpar));

    }

}

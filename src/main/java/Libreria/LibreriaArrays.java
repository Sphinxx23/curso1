/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.List;
import java.util.Scanner;

public class LibreriaArrays {

   //Pasa un array a una lista (se puede usar array as list)
     public static void arrayToList(List<String> lista, String[] arrayy) {
        String aux;
        for (int i = 0; i < arrayy.length; i++) {
            aux = arrayy[i];
            lista.add(aux);
        }
    }
    
//Splitea una cadena 
    public static String[] separarCadenaIntroducida(String msg) {
        String[] arrayy;
        Scanner sc = new Scanner(System.in);
        String aux;
        
        System.out.println(msg);
        aux = sc.nextLine();

        arrayy = aux.split(" ");
        return arrayy;

    }
    
//Comprobar repetidos de un array y crear uno nuevo solo con los q no se repiten
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
    
    //Juntar dos arrays en uno solo
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
     
     //Introducir randoms en una matriz
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
      
      //Introduce numeros randoms en una matriz irregular, y te pide el num de filas y de columnas de cada fila
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

//Devuelve un array saltandose los 0s
    public static String devuelveVector(int[] array) {
        StringBuilder sb = new StringBuilder();
        int aux;
        for (int i = 0; i < array.length; i++) {

            aux = array[i];
            if (aux == 0) {
                continue;
            }

            sb.append(aux + " ");
        }
        return sb.toString();
    }

//Contar el numero de 0 en un array
    public static int contar0(int[] array) {
        int auxiliar, contador = 0;

        for (int i = 0; i < array.length; i++) {
            auxiliar = array[i];
            if (auxiliar == 0) {
                contador++;
            }
        }

        return contador;
    }

    //Contar los pares de un array
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

//Media de los numeros de un array
    public static float mediaNumArray(int[] arrayTotal) {
        float media;
        int acum = 0, auxiliar, contador = 0;

        for (int i = 0; i < arrayTotal.length; i++) {
            auxiliar = arrayTotal[i];

            acum = acum + auxiliar;
            contador++;

        }

        media = acum / contador;
        return media;
    }

//Introducir numeros a mano en un array
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

    //Cuenta las veces que hay una palabra en una frase(pasada a array)
    public static int contarPalabra(String cadena, String pal) {
        int count = 0;
        for (String c : cadena.split(" ")) {
            if (c.equalsIgnoreCase(pal)) {
                count++;
            }
        }
        return count;
    }

//Muestra el cubo (añadiendole un sout)
    public static String devuelveCubo(int[][][] cubb) {
        StringBuilder sb = new StringBuilder();
        int aux;

        for (int prof = 0; prof < cubb.length; prof++) {
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int columna = 0; columna < cubb[prof][fila].length; columna++) {
                    aux = cubb[prof][fila][columna];
                    sb.append(aux).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

//Rellenar cubo
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

//Devuelve la matriz
    public static String devuelveMatriz(char[][] array) {
        StringBuilder sb = new StringBuilder();
        char aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                aux = array[i][j];
                sb.append(aux).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

//Introduce lo que haya en un array en una matriz gracias al contador x (para los indices del array)
    public static char[][] introducirNumerosMatriz(char[][] tablaa, String[] aux) {
        int x = 0;
        for (int i = 0; i < tablaa.length; i++) {
            for (int j = 0; j < tablaa[i].length; j++) {

                tablaa[i][j] = aux[x++].charAt(0);

            }
        }
        return tablaa;
    }

    //Utilizado para el siguiente metodo
    public static String pedirString(String msg) {
        Scanner sc = new Scanner(System.in);
        String auxCad;

        System.out.println(msg);
        auxCad = sc.nextLine();

        return auxCad;
    }

    //Pide un string con un mensaje personalizado de una lenght concreta, si no tiene ese lenght vuelve a pedir
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

    //Split de cadena pero sin lenght determinado
    public static String[] splitLenghtCadena(String msggg) {
        String[] arraString;
        String cadena;
        cadena = pedirString(msggg);
        arraString = cadena.split(" ");

        return arraString;
    }

}

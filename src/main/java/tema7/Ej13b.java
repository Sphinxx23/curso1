/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej13b {

    public static void inicializaTabla(String[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            tabla[f][0] = null;
            tabla[f][1] = "0";
        }
    }

    public static String[] troceameLinea(String linea) {
        return linea.split(" ");
    }

    public static int damePosicionPalabra(String[][] tabla, String palabra) {
        for (int f = 0; f < tabla.length; f++) {
            if (tabla[f][0] != null && tabla[f][0].equalsIgnoreCase(palabra)) {
                return f;
            }
        }
        return -1; //NO ENCONTRADA
    }

    public static void aumentamosContador(String[][] tabla, int indice) {
        int aux;
        aux = Integer.parseInt(tabla[indice][1]) + 1;

        tabla[indice][1] = aux + "";
    }

    public static void añadirPalabraATabla(String[][] tabla, String palabra) {
        int indice;
        indice = damePosicionLibre(tabla);
        tabla[indice][0] = palabra;
        tabla[indice][1]="1";
    }

    public static int damePosicionLibre(String[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i][0] == null) {
                return i;
            }
        }
        return -1;
    }

    public static String devuelveMatriz(String[][] tabla) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tabla.length; i++) {

            sb.append(tabla[i][0] + "\t" + tabla[i][1] + "\n");

        }
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[][] tabla = new String[23000][2];
        BufferedReader br;
        String linea;
        String[] trozos;
        int indice;

        //Inicializar la tabla
        inicializaTabla(tabla);

        //Abrir fichero y leer linea a linea
        br = new BufferedReader(new FileReader("QuijoteDeLaMancha.txt"));
        linea = br.readLine();
        while (linea != null) { //El fichero no esta vacio
            //Por cada linea separarlo por palabra
            trozos = troceameLinea(linea);

            //Si la palabra no esta en la tabla -> Añadir palabra 
            for (String palabra : trozos) {
                indice = damePosicionPalabra(tabla, palabra);
                if (indice != -1) { //Si si que está aumentamos cntador
                    aumentamosContador(tabla, indice);
                } else { //Si no que está, la añadimos
                    añadirPalabraATabla(tabla, palabra);
                }
            }
            linea = br.readLine();
        }

        //Mostrar tabla
        System.out.println(devuelveMatriz(tabla));
        
    }

}

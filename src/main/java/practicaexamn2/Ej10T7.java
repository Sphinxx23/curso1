/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.Scanner;

/**
 * Realizar un programa que rellene una tabla (EED de 2 dimensiones), con
 * caracteres introducidos por el usuario. Los caracteres se deben introducir
 * con Scanner y haciendo uso de split. El número de filas será 5, pero el
 * número de columnas de la tabla será irregular (como aparece en la imagen):
 * fila 0 -> sólo una columna, fila 1 -> sólo dos columnas … y posteriormente
 * los muestre por pantalla.  *
 */
public class Ej10T7 {

    public static void rellenaTabla(char[][] tablaChar) {
        Scanner sc = new Scanner(System.in);
        String[] auxSplit;
        char auxChar;
        int i = 0;
        String auxSpl;
        
        do {            
            System.out.println("Introduce la cadena de 15 caracteres");
            auxSpl = sc.nextLine();
            
            auxSplit = auxSpl.split(" ");
        } while (auxSplit.length != 15);
        
       
        for (int j = 0; j < tablaChar.length; j++) {
            for (int k = 0; k < tablaChar[j].length; k++) {
                tablaChar[j][k] = auxSplit[i].charAt(0);
                i++;
            }
            
        }
        
    }
    
    public static String muestraTabla(char[][] tabla) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sb.append(tabla[i][j] + " ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        char[][] tablaIrr = new char[5][];
        tablaIrr[0] = new char[1];
        tablaIrr[1] = new char[2];
        tablaIrr[2] = new char[3];
        tablaIrr[3] = new char[4];
        tablaIrr[4] = new char[5];
        
        
        rellenaTabla(tablaIrr);
        
        System.out.println(muestraTabla(tablaIrr));
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Leer {

    //Recoge un caracter
    public static char pedirCaracter(String msg) {
        Scanner sc = new Scanner(System.in);
        char caract;
        System.out.println(msg);
        caract = sc.nextLine().charAt(0);

        return caract;
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

    //Leer una cadena
    public static String leerCadena(String msg) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println(msg);
        cadena = sc.nextLine();

        return cadena;
    }

    //Comprueba si son vocales
    public static boolean esVocal(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

//Lee una cadena de numeros hasta el -1
    public static String lecturaHastaMenosUno(String num) {
        int x;
        String numerosMenosFin = "";

        Scanner sc = new Scanner(num);

        while (sc.hasNext()) {

            x = Integer.parseInt(sc.next());

            if (x == -1) {
                break;

            } else {
                numerosMenosFin = numerosMenosFin + " " + x + " ";
            }

        }

        return numerosMenosFin;
    }

    //Leer un numero con mascara
    public static int leerConMascara(String msg, String mascara) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(msg);
            num = sc.nextInt();
        } while (!Pattern.matches(mascara, num + ""));
        return num;
    }

//Leer signo matematico
    public static char leerSigno(String msg) {
        char operador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(msg);
            operador = sc.nextLine().charAt(0);
        } while (operador != '+' && operador != '-' && operador != '*' && operador != '/');
        return operador;
    }

//Enteros positivos negativos y 0
    public static int leerEntero(String msg) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        num = sc.nextInt();
        return num;

    }

    //positivos incluyendo 0
    public static int leerEnteroPositivo(String msg) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(msg);
            num = sc.nextInt();
        } while (num < 0);

        return num;
    }

    //positivos incluyendo 0
    public static float leerRealPositivo(String msg) {
        float real;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(msg);
            real = sc.nextFloat();
        } while (real <= 0);

        return real;
    }

}

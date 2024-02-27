/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Scanner;

public class LibreriaString {

  //Para los ejercicios de secuencias y asi, para sacar exactamente el numero de tantos que tienes
    public static String secFinal(String cadena, int num){
        Scanner noTec=new Scanner (cadena);
        String aux="";
        while (num!=0) {            
            if (noTec.hasNext()) {
                aux=aux+" " + (noTec.next()) + " ";
            }
            num--;
        }
        return aux;
    }

//Contar las veces que aparece un determinado caracter en iuna cadena
     public static int contarCaracterEnCadena (String cadena, char caracter){
         int count = 0;
            for (char c : cadena.toCharArray()) {
                if (c == caracter) {
                    count++;
                }
            }
            return count;
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

//Cuenta las veces que hay un caracter determinado en una frase
    public static int contarCaracter(String cadena, char caracter) {
            int count = 0;
            for (char c : cadena.toCharArray()) {
                if (c == caracter) {
                    count++;
                }
            }
            return count;
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
    
//Cadena de simbolos unicode desde x hasta n
    public static String unicode(int numInic, int numFin) {
        int contIndic = numInic;
        char unicode;
        String cadena = "";

        for (int i = numInic; i < numFin; i++) {
            unicode = (char) contIndic;
            cadena = cadena + contIndic + ": " + unicode + "\n";
            contIndic++;

        }
        return cadena;
    }

    //Pide una cadena de letras y dos letras sueltas, comprueba que cada letra de la cadena esta entre las dos letras
    public static StringBuilder entreLetrasSiNo(String cadena, char letraA, char letraB) {
        StringBuilder sb = new StringBuilder("");
        int longi;
        char auxChar;

        longi = cadena.length();

        for (int i = 0; i < longi; i++) {
            auxChar = cadena.charAt(i);

            if (auxChar > letraA && auxChar < letraB) {
                sb.append(" SI ");
            } else if (Character.isWhitespace(auxChar)) {
                continue;
            } else {
                sb.append(" NO ");
            }

        }
        return sb;
    }

    //Separa una cadena introducida con espacios en blanco entre cada caracter
    public static String cadenaSeparada(String cadena) {
        char aux;
        int longit;
        String cadSep = "";

        longit = cadena.length();
        for (int i = 0; i < longit; i++) {
            aux = cadena.charAt(i);
            cadSep = cadSep + " " + aux;
        }
        return cadSep;
    }

    //Cuenta los espacios de una cadena introducida
    public static int contadorEspacios(String frase) {
        int cont = 0, longit;
        longit = frase.length();
        char aux;

        for (int i = 0; i < longit; i++) {
            aux = frase.charAt(i);
            if (Character.isWhitespace(aux)) {
                cont++;
            }
        }
        return cont;
    }
    
    //Comprueba si cada una de las letras de una cadena esta o no en la cadena introducida (como si fuera una mascara)
     public static boolean esComprobarVocal (char aux1, String cadenaComprobar){
        char cad2;
        int aux;
        aux = cadenaComprobar.length();
        
        for (int i = 0; i < aux; i++) {
            cad2=cadenaComprobar.charAt(i);
            if (aux1==cad2) {
                return true;
            }
        }
        
            return false;      
    }
     
     //Sustituye ciertas letras dde una cadena por otras
         public static StringBuilder contraCompleja(String contra) {
        StringBuilder sb = new StringBuilder(contra);
        int longit, e = 1;
        longit = contra.length();
        char aux;

        for (int i = 0; i < longit; i++) {
            aux = contra.charAt(i);

            switch (aux) {
                case 'a', 'A' -> sb.replace(i, e, "@");

                case 'e', 'E' -> sb.replace(i, e, "3");

                case 'i', 'I' -> sb.replace(i, e, "1");

                case 'o', 'O' -> sb.replace(i, e, "0");

                case 'u', 'U' -> sb.replace(i, e, "V");

            }
            e++;
        }

        return sb;
    }
}

/*
 Pedir el nombre y apellidos de una persona y realizar un función llamada sinVocales que reciba
estos dos parámetros y devuelva un String con dicha información sin ninguna vocal
(acentuadas o no).
 */
package tema6;

import java.util.Scanner;

public class Ej7 {
    
    
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
    
    public static String cadenaSinVocales (String cadena){
        char aux;
        String cadenaFinal="", vocales = "AEIOUaeiouáéíóúÁÉÍÓÚ";
        int total;
              
        total=cadena.length();
        for (int i = 0; i!=total; i++) {
            aux=cadena.charAt(i);
            
            if (esComprobarVocal(aux, vocales)) {
                continue;
            }
            
            cadenaFinal=cadenaFinal+ aux;
        }
        
        return cadenaFinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "ISO-8859-1");
        String cadena, aux;
        System.out.println("Introduce tu nombre y apellidos ");
        cadena=sc.nextLine();
        
        aux= cadenaSinVocales(cadena);
        System.out.println(aux);
    }
}

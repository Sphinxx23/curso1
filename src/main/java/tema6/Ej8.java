/*
 Realizar un programa en Java que compruebe si una persona está “mellada de forma
equilibrada”. Una persona lo está si en la parte izquierda de la dentadura faltan la misma
cantidad de dientes que en la parte derecha, en la misma posición. Suponemos el valor ‘1’
como tiene diente y el valor ‘0’ como que no lo tiene.
Ejemplo
Entrada: 1 1 1 1 1 0 0 1 1 1 1 1 ; MELLADO EQUILIBRADO
Entrada: 1 1 1 0 1 1 1 ; NO EQUILIBRADO (es impar)
Entrada: 1 1 0 0 0 0 1 1 ; MELLADO EQUILIBRADO
Entrada: 0 0 1 0 1 1 0 1 0 0 ; MELLADO EQUILIBRADO
 */
package tema6;

import java.util.Scanner;

public class Ej8 {
   
    public static String melladoSiNo(String cadena){
        int auxx;
        char caracter;
        String cadenaFin="", auxMalo=" NO EQUILIBRADO ", auxBueno="EQUILIBRADO";
        auxx=cadena.length();
      
        for (int i = auxx-1; i >=0 ; i--) {
            caracter=cadena.charAt(i);
            cadenaFin=cadenaFin+caracter;
        }
               
        if (auxx%2!=0) {
            return auxMalo;
        }else if (cadenaFin.equalsIgnoreCase(cadena)) {
            return auxBueno;
        }else{
            return auxMalo;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cadena;
                 
            System.out.println("Introduce los dientes formato [11100111]");
            cadena=sc.nextLine();
            
            System.out.println(melladoSiNo(cadena));
            
        
    }
}

/*
 Realizar un programa en Java que pida al usuario múltiples caracteres separados por un
espacio, posteriormente mostrará por pantalla qué caracteres están entre la ‘h’ y la ‘n’.
Ejemplo:
Entrada: k l i w q a c m 4 @ h &amp; &lt;
Salida: SI SI NO NO NO NO NO SI NO NO
 */
package tema6;

import java.util.Scanner;

public class Ej10 {
    public static StringBuilder entreLetrasSiNo(String cadena, char letraA, char letraB){
        StringBuilder sb= new StringBuilder ("");
        int longi;
        char auxChar;
        
        longi=cadena.length();
        
        for (int i = 0; i < longi; i++) {
            auxChar=cadena.charAt(i);
            
            if (auxChar>letraA && auxChar<letraB) {
                sb.append(" SI ");
            }else if (Character.isWhitespace(auxChar)){
                continue;
            }else{
                sb.append(" NO ");
            }
            
        }
        return sb;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "ISO-8859-1");
        String cadenaUsu;
        
        char letra1, letra2;
        
        System.out.println("Introduce la cadena de caracteres ");
        cadenaUsu=sc.nextLine().trim();
        
        System.out.println("Introduce las letras entre las cuales quieres saber si esta ");
        letra1=sc.nextLine().charAt(0);
        letra2=sc.nextLine().charAt(0);
        
        System.out.println(entreLetrasSiNo(cadenaUsu,letra1, letra2));
        
    }
}

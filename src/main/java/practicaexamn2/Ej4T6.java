/*
 Introducir por teclado una frase y mostrar la frase separada por espacios en blanco, carácter a carácter.
El programa continúa hasta que se introduce la palabra “FIN” (da igual si está en mayúsculas o no debería funcionar
del mismo modo).
*/
package practicaexamn2;

import java.util.Scanner;

public class Ej4T6 {
    public static String separarCadena(String cad){
        StringBuilder sb = new StringBuilder();
        char aux;  
        
        for (int i = 0; i < cad.length(); i++) {
            aux=cad.charAt(i);
            sb.append(aux + " ");
        }
        
    
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String auxStr;
        
        System.out.println("Introduce la frase");
        auxStr=sc.nextLine();
        
        System.out.println(separarCadena(auxStr));
       
    }
}

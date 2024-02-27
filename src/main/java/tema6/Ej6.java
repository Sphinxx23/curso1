/*
 Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique
cuántos espacios tiene. Para ello crearemos una función que se llame cuentaEspacios.
 */
package tema6;

import java.util.Scanner;

public class Ej6 {
    
    public static int contadorEspacios(String frase ){
       int cont=0, longit;
       longit=frase.length();
       char aux;
       
        for (int i = 0; i < longit; i++) {
            aux=frase.charAt(i);
            if (Character.isWhitespace(aux)) {
                cont++;
            }
        } 
        return cont;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase;
        int auxx;
        System.out.println("Introduce una frase ");
        frase=sc.nextLine();
        auxx=contadorEspacios(frase);
        System.out.println("La cantidad de espacios es " + auxx);
    }
}

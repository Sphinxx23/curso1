/*
 Realiza un programa que solicite un carácter al usuario de forma sucesiva hasta que el usuario
introduzca un ‘F’. El programa llamará a un función que mostrará todos los métodos de la clase
Character sobre el char introducido por el usuario.
 */
package tema6;

import java.util.Scanner;

public class Ej2 {
  
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        char carac;
        do {            
            System.out.println("Introduce cualquier caracter, introduce F para finalizar");
            carac=sc.nextLine().charAt(0);
         
            System.out.println(Character.isDigit(carac));
            System.out.println(Character.isLetter(carac));
            System.out.println(Character.isLetterOrDigit(carac));
            System.out.println(Character.isLowerCase(carac));
            System.out.println(Character.isUpperCase(carac));
            System.out.println(Character.isSpaceChar(carac));
            System.out.println(Character.isWhitespace(carac));
            System.out.println(Character.toLowerCase(carac));
            System.out.println(Character.toUpperCase(carac));
            System.out.println(Character.digit(carac, 10));
            System.out.println(Character.toString(carac));
            System.out.println(Character.toString(carac));
            System.out.println(Character.forDigit(8, 8));
            
        } while (carac!='F');
    }
}

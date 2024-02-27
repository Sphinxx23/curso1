/*
 Diseñar una función que reciba un número entero positivo y devuelva el factorial de ese
número. En caso de recibir un número negativo, mostrará un mensaje de error y la función
retornará -1. 
 */
package tema5;

import java.util.Scanner;
import Libreria.LibreriaMatematicas;

public class Ej3 {
    
    public static void main(String[] args) {       
        int numUsuario, result;
        Scanner sc = new Scanner(System.in);
               
        System.out.println("Introduce un numero positivo");
        numUsuario=sc.nextInt();
      
        result= LibreriaMatematicas.numFact(numUsuario);
            
        if (result==-1) {
            System.out.println("Error, el error sale como: " + result);
        }else{
            System.out.println("El resultado de " + numUsuario + "! es: " + result);
        }      
    }
}

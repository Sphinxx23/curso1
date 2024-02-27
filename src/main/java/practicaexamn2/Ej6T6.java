/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.Scanner;

public class Ej6T6 {
    public static int cuentaEspacios(String cadena){
        int cont=0;
        
        for (char c : cadena.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                cont++;
            }
        }
        return cont;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String auxStr;
        int cont;
        
        System.out.println("Introduce una frase con varios espacios en blanco medio");
        auxStr=sc.nextLine();
        
        cont=cuentaEspacios(auxStr);
        System.out.println("El total de espacios es  " + cont);
    }
}

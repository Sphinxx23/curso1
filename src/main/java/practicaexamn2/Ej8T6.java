/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.Scanner;

public class Ej8T6 {
    
    public static boolean comprobarMellado(String cadena){
        int auxx;
        char caracter;
        String cadenaFin="";
        auxx=cadena.length();
        
        for (int i = auxx-1; i >=0 ; i--) {
            caracter=cadena.charAt(i);
            cadenaFin=cadenaFin+caracter;
        }
       
        
        if (auxx%2!=0) {
            return false;
        }else{
            if (cadena.equals(cadenaFin)) {
                return true;
            }else{
                return false;
            }

        }
                
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in); 
      String aux;
       StringBuilder sb= new StringBuilder();
      boolean vFlag;

            aux=sc.nextLine();
           vFlag= comprobarMellado(aux);
           sb.append(vFlag==true ? "Mellado equilibrado \n" : "No equilibrado \n");
        
        System.out.println(sb);
    }
}

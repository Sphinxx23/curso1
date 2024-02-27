/*
 Realizar un programa que pida al usuario las calificaciones de 5 alumnos 
(comprobar entrada) y decir si hay algún suspenso, indicando la cantidad, 
en  caso de que no hubiera ningún suspenso mostraremos el mensaje “¡¡¡Qué gran trabajo el de este grupo!!!”.
 */
package tema4;
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num, cont=0;
        
        for (byte c=1; c<=5; c++) {
            do {            
               System.out.println("Introduzca nota del alumno " + c);
               num = sc.nextByte();           
            } while (num<0||num>10);
            
            if (num<5) {
                cont++;
            }       
        }
        if(cont==0){
            System.out.println("¡¡¡Qué gran trabajo el de este grupo!!!"); 
        }else{
            System.out.println("El numero de suspensos es " + cont);
        }       
    }
}


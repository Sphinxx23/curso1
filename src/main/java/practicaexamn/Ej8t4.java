/*
 Realizar un programa que pida al usuario las calificaciones de 5 alumnos 
(comprobar entrada) y decir si hay algún suspenso, indicando la cantidad, 
en  caso de que no hubiera ningún suspenso mostraremos el mensaje “¡¡¡Qué gran trabajo el de este grupo!!!”.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej8t4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte nota, cont = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            do {                
                System.out.println("Introduce la nota del alumno " + i);
                nota = sc.nextByte();
            } while (nota<0 || nota>10);
            
            if (nota < 5) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La cantidad de suspensos es " + cont);
        } else {
            System.out.println("Gran trabajo");
        }
    }
}

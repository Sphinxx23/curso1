/*
 Modifica el ejercicio de la tabla de multiplicar, para que el número introducido por pantalla esté acotado entre 1 y 10. 
Dependiendo del número que introduzca el usuario mostraremos todas las tablas de multiplicar desde el número 
introducido por el usuario hasta la tabla de 10 inclusive.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej12t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUs, acc=0;
        
        do {            
            System.out.println("Introduce un num 1-10");
            nUs=sc.nextInt();
        } while (nUs<1||nUs>10);
        
        for (int i = nUs; i < 11; i++) {
            System.out.println("");
            for (int j = 1; j < 11; j++) {
                acc=i*j;
                System.out.println(i + "x" + j + "=" + acc);
            }
        }
        
    }
}

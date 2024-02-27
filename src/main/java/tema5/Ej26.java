/*
 Realizar un programa en java que permita dibujar gráficos de barra (mediante texto). 
Para ello pediremos al usuario N números seguidos, hasta la introducción de un cero,y mostraremos la siguiente gráfica.
Ejemplo para entrada:
3 6 5 2 0
3. | ###
6. | ######
5. | #####
2. | ##

 */
package tema5;

import java.util.Scanner;

public class Ej26 {

    public static String leerCadena(String msg) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println(msg);
        cadena = sc.nextLine();
        
        return cadena;
    }

    public static void almohadillas(String cadena) {
        int aux;
        Scanner noTec = new Scanner(cadena);
        while (noTec.hasNext()) {
            aux = Integer.parseInt(noTec.next());
            if (aux==0) {
                break;
            }
            
            System.out.print(aux + ". " + " | ");
            
            for (int i = 0; i < aux; i++) {
                System.out.print("#");
            }
            System.out.println("");

        }
    
    }

    public static void main(String[] args) {
        String auxLeer;
        auxLeer = leerCadena("Introduce una cadena de numeros, para finalizarla iuntroduce un 0 ");
        almohadillas(auxLeer);
    }
}

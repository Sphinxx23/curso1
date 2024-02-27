/*
 Realizar un programa que simule la tirada de dos dados de poker, haciendo uso de números
aleatorios. Debe mostrar con texto el número obtenido: “AS”, “REY”, “REINA” … NOTA:
Deberás buscar cómo obtener números aleatorios en JAVA.
A (As), K (rey), Q (reina), J (jota), 10 y 9
 */
package practicaexamn;

import java.util.Scanner;

public class Ej9t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleat;

        System.out.println("Pulsa enter para jugar");
        sc.nextLine();
        
        for (int i = 0; i < 2; i++) {
            numAleat = (int)(Math.random() * 6 + 1);
            switch (numAleat) {
                case 1:
                    System.out.println("AS");
                    break;
                case 2:
                    System.out.println("REY");
                    break;
                case 3:
                    System.out.println("REINA");
                    break;
                case 4:
                    System.out.println("JOTA");
                    break;
                case 5:
                    System.out.println("10");
                    break;
                case 6:
                    System.out.println("9");
                    break;
            }
            System.out.println("");
        }

    }
}

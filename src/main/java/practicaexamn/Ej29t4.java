/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

/**
 *
 * @author PcBox
 */
public class Ej29t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario, cont1, cont2 = 0;

        do {
            System.out.println("Introduzca un numero impar");
            numeroUsuario = sc.nextInt();
        } while (numeroUsuario % 2 == 0);

        cont1 = numeroUsuario / 2 ;

        for (int i = 0; i < numeroUsuario; i++) {
            //System.out.print(" " + cont1 + " y " + cont2);

            for (int j = 0; j < cont1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            if (i==0) {
                System.out.println("");
                cont2++;
                cont1--;
                continue;
            }
            if (i==numeroUsuario-1) {
                System.out.println("");
            }
          
            if (i!=0&&i!=numeroUsuario-1) {
                for (int k = 0; k < cont2; k++) {
                System.out.print(" ");
                }
                System.out.println("*");
            }
            

            if (cont1 != 0 && i < numeroUsuario / 2 ) {
                cont1--;
                cont2 = cont2 + 2;
            } else {
                cont1++;
                cont2 = cont2 - 2;
            }

        }

    }
}


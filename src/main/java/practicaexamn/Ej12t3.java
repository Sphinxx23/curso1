/*
 12. Realizar un programa en Java que pida al usuario hora, minutos y segundos. Se mostrará por
pantalla la hora un segundo más tarde (en formato 12 horas).
 */
package practicaexamn;

import java.util.Scanner;

public class Ej12t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte hora, min, seg;

        System.out.println("Introduce hora, minuto, segundo");
        hora = sc.nextByte();
        min = sc.nextByte();
        seg = sc.nextByte();

        

        if (hora > 12) {
            System.out.println("Valores incorrectos");
        } else {
            seg++;
            if (seg >= 60) {
                min++;
                seg = 0;
            }
            if (min >= 60) {
                hora++;
                min = 0;
            }
            if (hora > 12) {
                hora = 1;
            }
            System.out.println(hora + " " + min + " " + seg);
        }
        

        

    }

}

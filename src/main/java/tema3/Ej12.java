/*
 12. Realizar un programa en Java que pida al usuario hora, minutos y segundos. Se mostrará por
pantalla la hora un segundo más tarde (en formato 12 horas).
 */
package tema3;
import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        //variables
        int hora, min, seg, seg2, min2, hora2;
        Scanner sc=new Scanner(System.in);
        
        //Datos usuario
        System.out.println("Introduzca horas, minutos y segundos");
        hora=sc.nextInt();
        min=sc.nextInt();
        seg=sc.nextInt();
        
        //Bifurcaciones
        seg2=seg+1;
        if (hora>12) {
            System.out.println("Entrada incorrecta");
        } else {      
            if (seg2==60) {
                seg2=0;
                min2=min+1;
                    if (min2==60) {
                        min2=0;
                        hora2=hora+1;                
                            if (hora2>12) {
                                hora2=1;
                                System.out.println(hora2 + " horas " + min2 + " minutos " + seg2 + " segundos "); 
                            } else {
                                System.out.println(hora2 + " horas " + min2 + " minutos " + seg2 + " segundos "); 
                            }
                    } else {
                        System.out.println(hora + " horas " + min2 + " minutos " + seg2 + " segundos ");
                    }  
            } else {
                System.out.println(hora + " horas " + min + " minutos "+ seg2 + " segundos ");
            }
        }
    }           
}

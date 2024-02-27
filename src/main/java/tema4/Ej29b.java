
package tema4;
import java.util.Scanner;
public class Ej29b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario, div1, hueco=1, div2, huecoMax, aux=0;
        
        do {            
            System.out.println("Introduzca un numero impar");
            numeroUsuario=sc.nextInt();
        } while (numeroUsuario%2==0);       
        
        div1=numeroUsuario/2;
        div2=numeroUsuario/2;
        huecoMax=numeroUsuario-2;
        
         
         
         for (int i = 0; i < numeroUsuario-2; i++) {
             if (i==0||i==numeroUsuario) {
                 for (int f = 0; f < div2; f++) {
                     System.out.print(" ");
                    }
                    System.out.println("*");
             }            
             if (div1>0&&aux==0) {
                div1--;
                for (int j = 0; j < div1; j++) {
                    System.out.print(" ");
                }              
                System.out.print("*");
                for (int k = 0; k < hueco; k++) {
                    System.out.print(" ");
                }
                hueco=hueco+2;
                System.out.println("*");
            }else{
                aux++;
                div1++;
                for (int j = 0; j < div1; j++) {
                    System.out.print(" ");
                }              
                System.out.print("*");
                huecoMax=huecoMax-2;
                for (int k = 0; k < huecoMax; k++) {
                    System.out.print(" ");
                }              
                System.out.println("*");
            }
        }
                 
    }      
}
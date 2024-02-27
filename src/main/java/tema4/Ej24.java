/*
 24. Realiza un programa que dibuje un rombo dependiendo del valor (n) introducido por el usuario
que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;
import java.util.Scanner;
public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario, cont1, cont2=1;
        
        do {            
            System.out.println("Introduzca un numero impar");
            numeroUsuario=sc.nextInt();
        } while (numeroUsuario%2==0);       
        
        cont1=numeroUsuario/2;
        
        for (int i = 0; i < numeroUsuario; i++) {
            //System.out.print(" " + cont1 + " y " + cont2);
           
            for (int j = 0; j < cont1; j++) {
                 System.out.print(" ");
            }
            for (int k = 0; k < cont2; k++) {
                 System.out.print("*");
            }
            System.out.println("");
            
        
            if (cont1!=0 && i<numeroUsuario/2) {
                cont1--;
                cont2=cont2+2;
            } else{
                 cont1++;
                 cont2=cont2-2;
            } 
               
        }
       
           
        }      
    }


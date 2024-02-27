/*
 Modifica el ejercicio 4 para que funcione también con números negativos.
Por ejemplo: Si n=-15 -&gt; mostraremos por pantalla: -15, -14 … -5, -4, -3, -2, -1, 0.
 */
package tema4;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        //variables
        int n, cont;
        Scanner sc = new Scanner(System.in);
                 
        System.out.println("Introduzca un numero entero ");
        n=sc.nextInt();

        if(n<=0){ // Numeros negativos y cero
            while (n<=0) {   
                if(n<0){
                    System.out.print(n + ","); 
                }else{
                    System.out.print(n + ".");
                }
                n++;
            }
        }else{       
            cont=1;
             while (cont<=n){                     
                if(cont<n){
                    System.out.print(cont + ","); 
                }else{
                    System.out.print(cont + ".");
                }
                cont++;
            }
        }             
    }
}



/*
 Modifica el ejercicio 2 para que los números aparezcan separados por una coma menos el
último que aparecerá un punto al final.
Por ejemplo: Si n=5 -&gt; mostraremos por pantalla 1,2,3,4,5.
 */
package tema4;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        //variables
        int n, cont;
        Scanner sc = new Scanner(System.in);
       
        do {            
            System.out.println("Introduzca un numero entero positivo");
            n=sc.nextInt();
        } while (n<=0);
        
        cont=1;
        while (cont<=n) {   
            if(cont!=n){
                System.out.print(cont + ","); 
            }else{
                System.out.print(cont + ".");
            }
            cont++;
        }
        System.out.println(" fin while");
        
        
        cont=1;
        do {                     
            if(cont!=n){
                System.out.print(cont + ","); 
            }else{
                System.out.print(cont + ".");
            }
            cont++;
        } while (cont<=n); 
        System.out.println(" fin do while");              
    }
}


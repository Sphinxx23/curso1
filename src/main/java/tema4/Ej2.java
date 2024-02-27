/*
 Escribir un programa para aprender a contar de forma que se pedirá al usuario un número N y
se debe mostrar por pantalla los números del 1 a N. Los debemos implementar con while y con
do-while.
 */
package tema4;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        //variables
        int n, cont;
        Scanner sc = new Scanner(System.in);
        
        //datos al usuario
        System.out.println("Introduzca un numero entero positivo");
        n=sc.nextInt();
        
        //bucle
        cont=1;
        while (cont<=n) {            
            System.out.println(cont);
            cont++;
        }
        cont=1;
        do {                     
            System.out.print(cont);
            cont++;
        } while (cont<=n);               
    }
}

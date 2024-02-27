/*
Realizar un programa en Java que pida dos números enteros y los muestre por pantalla
ordenados de forma creciente (se debe utilizar el operador ternario)
 */
package tema3;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int numA, numB;
        String tern;
        
        //Datos al usuario
        System.out.println("Introduzca dos numeros enteros");
        numA=sc.nextInt();
        numB=sc.nextInt();
        
        //Bifurcacion
        tern=(numA<numB)? numA + "<" + numB : numB + "<" + numA;
        
        //Salida en pantalla
        System.out.println(tern);
    }
    
}

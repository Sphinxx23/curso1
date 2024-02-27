/*
 Diseñar una función que reciba dos números a y b. 
  La función devolverá true o false indicando si b es un divisor de a.
 */
package tema5;
import static Libreria.LibreriaMatematicas.esDivisor;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean division;
        
        do {            
            System.out.println("Introduce dos numeros positivos ");
            num1=sc.nextInt();
            num2=sc.nextInt();
        } while (num1<0||num2<0);
          
        division = esDivisor(num1, num2);
        System.out.println(division);
    }
}

/*
 14. Idem al ejercicio 3 pero se pedirá tres números (sin el operador ternario).
 */
package tema3;
import java.util.Scanner;
public class Ej14 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner (System.in);
        int num1, num2, num3;
        
        //datos usuario
        System.out.println("Introduzca dos numeros diferentes ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        //calculos y bifurcaciones
        if (num1 > num2 && num1 > num3) { //caso 1 
            System.out.println(num1);
        }else if (num2 > num3 && num2 > num1){ //caso 2
            System.out.println(num2);  
        } else if(num3 > num1 && num3 > num2){//caso 3
            System.out.println(num3);
        }else{
            System.out.println("Numeros introducidos erroneos");
        }               
    }
}

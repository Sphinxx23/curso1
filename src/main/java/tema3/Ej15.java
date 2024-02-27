/*
 15. Realizar un programa en Java que pida tres números enteros (hay que comprobar que sean
distintos) y los muestre por pantalla ordenados de forma creciente (sin usar operadores
ternarios)
 */
package tema3;
import java.util.Scanner;
public class Ej15 {
    public static void main(String[] args) {
        //variables
        int num1, num2, num3;
        Scanner sc= new Scanner(System.in);
        
        //datos usuario
        System.out.println("Introduzca 3 numeros diferentes: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        //calculos
        if (num1 > num2 && num1> num3 && num2 > num3) { //caso 1 2 3 
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num2>num1 && num2>num3 && num1>num3) { //caso 2 1 3
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3>num1 && num3>num2 && num1>num2){//caso 3 1 2
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if(num1 > num2 && num1> num3 && num3 > num2){//caso 1 3 2
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if(num2>num1 && num2>num3 && num3>num1){//caso 2 3 1
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if(num3>num1 && num3>num2 && num2>num1){ //caso 3 2 1
            System.out.println(num3 + " " + num2 + " " + num1);
        } else{
            System.out.println("Has metido numeros erroneos ");
        }   
    }    
}

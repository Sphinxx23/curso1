/*
 Modifica el ejercicio anterior de tal modo que las condiciones no hagan uso de los operadores
lógicos &amp;&amp;, || y !. Es decir sólo usaremos un operador relacional por cada if.
 */
package tema3;
import java.util.Scanner;
public class Ej16 {
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
        if (num1==num2) {
            System.out.println("Error numeros");
        }else if(num1==num3){
            System.out.println("Error numeros");
        }else if (num2==num3){
            System.out.println("Error numeros");
        }else{       
            if (num1>num2) {          
                if(num2>num3) {//caso 1 2 3
                    System.out.print(num1 + " " + num2 + " " + num3);
                }
                if(num3>num2){
                   if(num1>num3){//caso 1 3 2
                      System.out.print(num1 + " " + num3 + " " + num2); 
                   }else if(num3>num1){//caso 3 1 2
                      System.out.print(num3 + " " + num1 + " " + num2);
                   }
                }
            }else if(num2>num1) {           
                if(num1>num3) { //caso 2 1 3
                    System.out.print(num2 + " " + num1 + " " + num3);
                }
                if (num3>num1){
                   if(num2>num3){// caso 2 3 1
                       System.out.print(num2 + " " + num3 + " " + num1);                      
                   }else if(num3>num2){//caso 3 2 1
                       System.out.print(num3 + " " + num2 + " " + num1);
                   }
                }           
            }
        }
    }
}

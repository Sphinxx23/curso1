/*
 15. Realizar un programa en Java que contabilice la cantidad de años bisiestos que hay entre dos
números (año1 y año2) introducidos por el usuario. Se usará el continue para saltarse los
cambios de siglo.
 */
package tema4;
import java.util.Scanner;
public class Ej15 {
    public static void main(String[] args) {
        int num1, num2, cont=0;
        Scanner sc= new Scanner (System.in);
        
        do{ // Comprobar entradas
            System.out.println("Introduzca dos años para calcular la cantidad de años bisiestos entre esa cantidad de años");
            num1=sc.nextInt();
            num2=sc.nextInt();
        }while(num1<0||num2<0);
        
        for (; num1<=num2; num1++) {          
            if (num1%4==0) {
                cont++;
            }
            if (num1%400==0) {
                cont++;
            }
            if (num1%100==0){
               cont--;     
            }               
        }           
        System.out.println(cont);    
    }
}
           
    


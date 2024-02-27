/*
 Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
positivo y su cuadrado, en el caso que no sea alguna de estas cosas, no mostraremos ningún
mensaje. El proceso se repetirá hasta que el número introducido por teclado sea 0.
 */
package tema4;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        //variables
        Scanner sc= new Scanner(System.in);
        int num;
        
        //datos al usuario
        System.out.println("Introduzca un numero");
        num=sc.nextInt();  
        
        //bucle
        while (num!=0) {            
            if(num>0 && num%2==0){
                System.out.print("Par, positivo y ");              
            }else if(num>0 && num%2!=0){
                System.out.print("Positivo y ");               
            }else if(num<0 && num%2==0){
                System.out.print("Par y ");        
            }
            System.out.println("su cuadrado es " + num*num);
            System.out.println("Introduzca otro numero");
            num=sc.nextInt();
        }
        System.out.println("Has introducido el 0, fin de programa");
    }
}

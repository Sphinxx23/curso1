/*
 Realizar un programa que solicite al usuario un número entre 1 y 99. El programa debe mostrarlo en texto por pantalla. (con switch).

 */
package tema3;
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        byte num;
        int d, u;
        
        //Datos al usuario 
        System.out.print("Introduzca un numero del 1-99");
        num = sc.nextByte();
        
        //Calculos
        d=num/10;
        u=num%10;
        
        
        //Bifurcacion
        
        if (num>=10 && num<=15) {
             switch (num) {
            case 10 :
               System.out.print("diez");
               break;
            case 11 :
               System.out.print("once");
               break;
            case 12 :
               System.out.print("doce");
               break;
            case 13 :
               System.out.print("trece");
               break;
            case 14 :
               System.out.print("catorce");
               break;
            case 15 :
               System.out.print("quince");
               break;
                
            }
        } else if (num<10 || num>15){
            switch (d) {
            case 1 :
                System.out.print("diez y");
                break;
            case 2 :
                System.out.print("veinte y");
                break;
            case 3 :
                System.out.print("treinta y");
                break;
            case 4 :
                System.out.print("cuarenta y");
                break;
            case 5 :
                System.out.print("cincuenta y");
                break;
            case 6 :
                System.out.print("sesenta y");
                break;
            case 7 :
                System.out.print("setenta y");
                break;
            case 8 :
                System.out.print("ochenta y");
                break;
            case 9 :
                System.out.print("noventa y");
                break;
        }
        
        switch  (u){
            
            case 1 :
                System.out.print(" uno");
                break;
            case 2 :
                System.out.print(" dos");
                break;
            case 3 :
                System.out.print(" tres");
                break;
            case 4 :
                System.out.print(" cuatro");
                break;
            case 5 :
                System.out.print(" cinco");
                break;
            case 6 :
                System.out.print(" seis");
                break;
            case 7 :
                System.out.print(" siete");
                break;
            case 8 :
                System.out.print(" ocho");
                break;
            case 9 :
                System.out.print(" nueve");
                break;
            }
        } else {
            
        }
                                       
    }
}


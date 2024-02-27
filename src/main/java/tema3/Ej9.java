/*
 Realizar un programa que simule la tirada de dos dados de poker, haciendo uso de números
aleatorios. Debe mostrar con texto el número obtenido: “AS”, “REY”, “REINA” … NOTA:
Deberás buscar cómo obtener números aleatorios en JAVA.
A (As), K (rey), Q (reina), J (jota), 10 y 9
 */
package tema3;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        //Variables
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        
        //Datos usuario
        System.out.println("Pulse para realizar la primera tirada ");
        sc.nextLine();
        
        //random1
        num1=(int)(Math.random()*6+9);
        
        //Bifurcacion
        switch (num1) {
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            case 11:
                System.out.println("Jota");
                break;
            case 12:
                System.out.println("Reina");
                break;
            case 13:
                System.out.println("Rey");
                break;  
            case 14:
                System.out.println("AS");
                break;
        }
        
        //Datos usuario
        System.out.println("Pulse para realizar la segunda tirada ");
        sc.nextLine();
        
        //random2
        num2=(int)(Math.random()*6+9);
        
        //Bifurcacion
        switch (num2) {
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            case 11:
                System.out.println("Jota");
                break;
            case 12:
                System.out.println("Reina");
                break;
            case 13:
                System.out.println("Rey");
                break;   
            case 14:
                System.out.println("AS");
                break;
        }
    }
}

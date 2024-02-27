/*
 13. Realiza como el ejercicio 7 pero al revés deberá pedir al usuario el nombre del mes y mostrará
el número de días.
 */
package tema3;
import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) {
        //variable
         String mes;
         Scanner sc=new Scanner(System.in);
         
        //Datos usuario
        System.out.println("Introduzca un mes (en mayusculas)");
        mes=sc.nextLine();
        
        //bifurcacion
        switch (mes) {
            case "ENERO" , "MARZO" , "MAYO" , "JULIO" , "AGOSTO" , "OCTUBRE" , "DICIEMBRE":
                System.out.println("31");
                break;
            case "FEBRERO" :
                System.out.println("28/29");
                break;
            case "ABRIL" , "JUNIO" , "SEPTIEMBRE" , "NOVIEMBRE" :
                System.out.println("30");
                break;           
            default:
                System.out.println("Entrada incorrecta");;
        }
    }   
}

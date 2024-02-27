/*
 Realizar un programa en Java que pida al usuario un número entero entre 1 y 7, y muestre por
pantalla el día de la semana correspondiente (1-&gt; Lunes, 2-&gt;Martes …).
 */
package tema3;
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        //Variables
        byte numU;
        Scanner sc= new Scanner(System.in);
        
        //Datos usuario
        System.out.println("Introduzca un numero del 1 al 7");
        numU=sc.nextByte();
        
        //Bifurcaciones
        if (numU==1) {
            System.out.println("Tu numero introducido correspone con el Lunes");
        } else if (numU==2){
            System.out.println("Tu numero introducido correspone con el  Martes");
        } else if(numU==3) {
            System.out.println("Tu numero introducido correspone con el Miercoles");
        } else if (numU==4) {
            System.out.println("Tu numero introducido correspone con el Jueves");
        } else if (numU==5) {
            System.out.println("Tu numero introducido correspone con el Viernes");
        } else if (numU==6){
            System.out.println("Tu numero introducido correspone con el Sabado ");
        } else if (numU==7){
            System.out.println("Tu numero introducido correspone con el Domingo");
        } else{
            System.out.println("El numero introducido no esta comprendido entre el 1-7");
        }
           
    }
}

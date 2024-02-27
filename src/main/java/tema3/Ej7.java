/*
Realiza un programa en Java que pide el día mayor de un mes y te muestre en texto los meses
que tienen ese número de días (por ejem. 31-&gt;Enero, Marzo, Mayo ..., 28 y 29-&gt;Febrero …)
 */
package tema3;
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        //Variable
        Scanner sc = new Scanner(System.in);
        byte numMes;
        
        //Datos al usuario
        System.out.println("Introduce el numero de dias que tiene un mes");
        numMes=sc.nextByte();
        
        //Bifurcacion
        if (numMes==31) {
            System.out.println("Los meses con 31 dias son: Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
        } else if (numMes==30) {
            System.out.println("Los meses con 30 dias son: Abril, Junio, Septiembre, Noviembre");
        }else if (numMes==28) {
            System.out.println("El unico mes con 28 dias es Febrero");
        }else if (numMes==29) {
            System.out.println("Febrero cuando es bisiesto");
        } else {
            System.out.println("El numero introducido no coincide con el numero de dias de ningun mes");
        }
   
    }
    
}

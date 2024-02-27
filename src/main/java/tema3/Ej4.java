/*Realizar un programa en Java que pida por teclado un número real indique si es un número
casi-cero, que son aquellos números positivos o negativos, que se acercan a 0 por menos de 1
unidad. Ejem. 0.3, -0,99, 0,9999 … son ejemplo de casi cero, pero no son casi ceros el -1, 1, 3, -
5 ...)*/
package tema3;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        float numU;
        
        //Datos usuariio
        System.out.println("Introduzca un numero real ");
        numU=sc.nextFloat();
        
        //Bifurcacion
        
        if (numU<1.0 && numU>0.0){
            System.out.println("El numero es casi 0");
        } else if (numU>-1.0 && numU<0.0) {
            System.out.println("El num es casi 0");
        } else if (numU==0){
            System.out.println("El numerito es 0");
        } else{
            System.out.println("El numero esta demasiado alejado de 0");
        }
    }
        
}


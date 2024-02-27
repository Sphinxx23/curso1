/*
 Diseñar una función que nos diga si un número es primo (un número primo es un número
natural mayor que 1 que tiene únicamente dos divisores él mismo y el 1)
 */
package tema5;
import java.util.Scanner;
public class Ej7 {
    
    /**
     *En este metodo puedes meter un mensaje personalizado, recoge un dato entero y comprueba que sea mayorque  0 
     * @param msg recoge un dato de tipo entero
     * @return devuelve un entero mayor a 0
     */
    public static int leerDato(){
        int num;
        Scanner sc = new Scanner (System.in);
        do {            
            System.out.println("Introduce un numero entero positivo ");
            num=sc.nextInt();
        } while (num<=0);
        return num;
    }
    
    /**
     *Este metodo comprueba si el dato que le pasamos, un entero, es un numero primo o no y lo saca por terminal
     */
    public static void primo(){
         int aux, cont=0;
        aux=leerDato();
        for (int i = 1; i <=aux; i++) {
            if (aux%i==0) {
                cont++;
            }
            
        }
        if (cont==2) {
                System.out.println("El numero " + aux + " es primo");
        }else{
                System.out.println("El numero " + aux + " no es primo");
        }
    }
       
    
    
    public static void main(String[] args) {
        
        primo();
        
    }
}

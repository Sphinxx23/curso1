/*
 Realizar una función recursiva en Java que pida un número ‘n’ y muestre la tabla de multiplicar del número ‘n’
 */
package tema5;

import Libreria.Leer;

/**
 *
 * @author Vespertino
 */
public class Ej16 {
    public static void tablaN (int n, int cont){
        int result;
        
        if (cont==0) {
            result=0;
            System.out.println(n+" x " + cont + " = " + result);
        }else{
            tablaN(n, cont-1);
            result=n*cont;
            System.out.println(n+" x " + cont + " = " + result);
            
        }
    }
    
    
    public static void main(String[] args) {
        int a, cont=10;
        a=Leer.leerEnteroPositivo("Introduce un entero");
        tablaN(a, cont);
        
    }
}


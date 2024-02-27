/*
 Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos, la media de los negativos y contar el número de ceros introducidos
 */
package tema7;

import java.util.Scanner;

public class Ej3 {
    public static int[] introducirNumerosArray (int n, String msg){
       Scanner sc = new Scanner (System.in);
        int auxx;
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(msg);
            auxx=sc.nextInt();
            arr[i]=auxx;
        }       
        return arr;
    }
    
    public static int pedirNumero(String msg){
        Scanner sc = new Scanner (System.in);
        int auxx;
        
        System.out.println(msg);
        auxx=sc.nextInt();
        
        return auxx;       
    }
    
    public static float mediaPositivos (int[] arrayTotal){
        float media;
        int acum=0, auxiliar, contador=0;
        
        for (int i = 0; i < arrayTotal.length; i++) {
           auxiliar=arrayTotal[i];
            if (auxiliar>0) {
                acum=acum+auxiliar;
                contador++;
            }
        }
        
        media=acum/contador;             
        return media;
    }
    
    public static float mediaNegativos (int[] arrayTotal){
        float media;
        int acum=0, auxiliar, contador=0;
        
        for (int i = 0; i < arrayTotal.length; i++) {
           auxiliar=arrayTotal[i];
            if (auxiliar<0) {
                acum=acum+auxiliar;
                contador++;
            }
        }
        
        media=acum/contador;             
        return media;
    }
    
    public static int contar0 (int[]array){       
        int auxiliar, contador=0;
        
        for (int i = 0; i < array.length; i++) {
           auxiliar=array[i];
            if (auxiliar==0)                
                contador++;
            }
        
        return contador;
        }
        
        
    public static void main(String[] args) {
       int aux1;
       int[]arrayAux;
       
       aux1=pedirNumero("Introduce el numero para la longitud del array");
        
       arrayAux=introducirNumerosArray(aux1,"Introduce cada numero para cada direccion de memoria del array");
       
       
       
        System.out.println( mediaPositivos(arrayAux));
        System.out.println(mediaNegativos(arrayAux));
        System.out.println(contar0(arrayAux));
       
        
        
        
    }
}

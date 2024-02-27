/*
 Implementar un programa que inicialice un array con nuestros números favoritos. A continuación, pedir al usuario el índice de un elemento que será eliminado del array.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no existan más elementos que borrar. 
Es imprescindible controlar que el índice corresponde a un dato válido. Mostraremos los números que no han sido borrados al final
 */
package tema7;

import java.util.Scanner;

public class Ej4 {

    public static int leerEntero(String msg) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(msg);
        num = sc.nextInt();
        
        return num;        
    }
    
    public static int posiNega(int auxx) {
        int nega = -1, posi = auxx;
        if (auxx < 0) {
            return nega;
        } else {
            return posi;
        }
    }    
    
    public static void eliminarIndices(int aux, int[] array, int posiNega) {
        
        if (posiNega >= array.length || posiNega < 0) {
            System.out.println("Error del indice introducido");            
        } else if (array[aux] == 0) {
            System.out.println("El valor de esta direccion ya ha sido borrada anteriormente");
        } else {
            System.out.println("Indice numero " + aux + " borrado");
            array[aux] = 0;
        }        
        
    }
    
    public static int contarNulos(int[] array) {
        int cont = 0, aux;
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            if (aux == 0) {
                cont++;
            }
        }
        return cont;
    }
    
    public static String devuelveVector(int[]array){
        StringBuilder sb = new StringBuilder();
        int aux;
        for (int i = 0; i < array.length; i++) {
           
            aux=array[i];
            if (aux==0) {
                continue;
            }
                      
            sb.append(aux + " ");
        }
        return sb.toString();
    }
      
    public static void main(String[] args) {
        int[] misFavs = {7, 22, 23, 28, 29, 36};
        int auxInt, auxCont, posiNeg;
        
        do {    
            System.out.println(devuelveVector(misFavs));
            auxInt = leerEntero("Introduce un indice para reemplazar");
            
            posiNeg = posiNega(auxInt);
            
            if (posiNeg >= 0) {
                eliminarIndices(auxInt, misFavs, posiNeg);

            }
             auxCont = contarNulos(misFavs);
             
        } while (auxCont != misFavs.length && posiNeg != -1);
        System.out.println(devuelveVector(misFavs));      
        System.out.println("Fin ");
        
    }
}

/*
Pedimos al usuario dos numeros, uno es la base y el otro exponentte, calcularlo usando la recursiva
 */
package tema5;

import Libreria.Leer;


public class Ej14 {
    public static int baseElevadoA(int a, int b){
        int resultado;
        
        if (b==0) {
            resultado=1;
        }else{
            resultado=a*baseElevadoA(a, b-1);
        }
          
        return resultado;
    }
    
    public static void main(String[] args) {
        
        int base, exponente;
        
        base=Leer.leerEnteroPositivo("Introduzca la base");
        
        exponente=Leer.leerEnteroPositivo("Introduce el exponente");
        
        System.out.println("El resultado es " + baseElevadoA(base, exponente));
    }
    
    
}

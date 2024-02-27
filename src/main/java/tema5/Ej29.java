/*
 Realizar un función que muestre por pantalla la secuencia de los primeros N 
números siguiendo esta secuencia. El número será introducido por el usuario.
1, 5, 3, 15, 5, 75, 7, …..

 */
package tema5;

import Libreria.Leer;
import java.util.Scanner;

public class Ej29 {
    public static String secuencia(int num){
       int num1=1, num2=5;
       String cadena="1 5 ";
     
       for (int i = 0; i < num; i++) {
            num1=num1+2;
            
            num2=num2*num1;
            
            cadena= cadena + num1 + " " +  num2 + " ";
        }
        return cadena;
    }
    
    public static String secFinal(String cadena, int num){
        Scanner noTec=new Scanner (cadena);
        String aux="";
        while (num!=0) {            
            if (noTec.hasNext()) {
                aux=aux+" " + (noTec.next()) + " ";
            }
            num--;
        }
        return aux;
    }
    
    public static void main(String[] args) {
        int nUs;
        String aux;
        nUs=Leer.leerEnteroPositivo("Introduce un entero positivo");
        aux=(secuencia(nUs));
        System.out.println(secFinal(aux, nUs));
    }
}

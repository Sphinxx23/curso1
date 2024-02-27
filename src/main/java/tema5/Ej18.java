/*
 Realizar una función iterativa en Java haciendo uso de 2 contadores que pida un número N 
y muestre por pantalla una pirámide según el valor de N.

 */
package tema5;

public class Ej18 {
   
    public static String figura(int n){
        int divN, contAst=1, contSp;
        String cadena="";
        
        contSp= n/2;
        divN = n/2 + 1;
       
        for (int i = 0; i < divN; i++) {
            for (int j = 0; j < contSp; j++) {
               cadena=cadena+" ";
            }
            contSp--;
            for (int j = 0; j < contAst; j++) {
                cadena=cadena+"*";
            }
            contAst=contAst+2;
            cadena=cadena+"\n";
        }
        return cadena;
    }
    
    
    public static void main(String[] args) {
        int n;
        n=Libreria.Leer.leerEnteroPositivo("Introduce un numero positivo");
        System.out.println(figura(n));
    }
}

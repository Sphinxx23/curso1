/*
 Realiza un programa que pida ‘x’ números enteros separados por espacios. Rellene y muestre
cubos de tamaño 3x3, cortada a cortada con números en serie 1,2,3,... n, siendo ‘n’ uno de los
casos de prueba. Las posiciones f,c de cada tabla tendrá el mismo número de secuencia. Este
es un ejemplo del tipo: “casos de prueba ilimitados” del PROGRAMAME.
 */
package tema7;

import java.util.Scanner;
import static tema7.Ej15.pedirCadena;

public class Ej17 {
    public static String pedirCadena(String msg) {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        cadena = sc.nextLine();

        return cadena;
    }
    
    public static int pedirEntero(String msg) {
        int entero;
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        entero = sc.nextInt();

        return entero;
    }
    
    public static String[] splitLenghtCadena(String msggg) {
        String[] arraString;
        String cadena;       
            cadena=pedirCadena(msggg);
            arraString = cadena.split(" ");
            
        return arraString;
    }
    
    public static int[][][] crearCuboNumerosConsecutivos (int num1, int numCubo){
        int[][][]cuboX=new int[num1][num1][num1];
        int contador=1;

        for (int prof = 0; prof < cuboX.length; prof++) { 
            contador=1;             
            for (int fila = 0; fila < cuboX[prof].length; fila++) {
                for (int columna = 0; columna < cuboX[prof][fila].length ; columna++) {
                    if (contador>numCubo) {
                        contador=1;
                    }
                    cuboX[prof][fila][columna]=contador;
                    contador++;
                }
            }
        }
        return cuboX;
    }
    
     public static String devuelveCubo(int[][][] cubb) {
        StringBuilder sb = new StringBuilder();
        int aux;

        for (int prof = 0; prof < cubb.length; prof++) {
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int columna = 0; columna < cubb[prof][fila].length ; columna++) {
                    aux = cubb[prof][fila][columna];
                    sb.append(aux).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
 
       
    public static void main(String[] args) {
        int tamaño, aux;
        String[]cadSplit;
       
        
        tamaño=pedirEntero("Elige el tamaño del cubo ");
       
        cadSplit=splitLenghtCadena("Introduce la cadena de numeros separados por espacios ");
        
        for (int i = 0; i < cadSplit.length; i++) {
          aux=Integer.parseInt(cadSplit[i]);            
       
          System.out.println(devuelveCubo(crearCuboNumerosConsecutivos(tamaño, aux)));
        }
        
    }
}

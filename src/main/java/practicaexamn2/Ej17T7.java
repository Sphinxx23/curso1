/*
  Realiza un programa que pida ‘x’ números enteros separados por espacios. Rellene y muestre
cubos de tamaño 3x3, cortada a cortada con números en serie 1,2,3,... n, siendo ‘n’ uno de los
casos de prueba. Las posiciones f,c de cada tabla tendrá el mismo número de secuencia. Este
es un ejemplo del tipo: “casos de prueba ilimitados” del PROGRAMAME.
 */
package practicaexamn2;

import java.util.*;

public class Ej17T7 {
   
    public static void cubos(int[][][] cubb, int auxF){
        int cont=1;
        
        for (int prof = 0; prof < cubb.length; prof++) {
            cont=1;
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int col = 0; col < cubb[prof][fila].length; col++) {
                    if (cont>auxF) {
                        cont=1;
                    }                   
                    cubb[prof][fila][col]=cont;
                    cont++;
                }
            }
        }
        
    }
    
    public static String devuelveCubo(int[][][] cubb) {
        int aux;
    StringBuilder sb=new StringBuilder();
        for (int prof = 0; prof < cubb.length; prof++) {
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int columna = 0; columna < cubb[prof][fila].length; columna++) {
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
       Scanner sc = new Scanner(System.in);
       int[][][] cubb;
       int auxxx;
       
       
        String auxx;
        
        System.out.println("Introduce la cadena de numeros");
        auxx=sc.nextLine();
        
        
        Scanner noTec = new Scanner(auxx);
        while (noTec.hasNext()) {
            cubb=new int[3][3][3];
            auxxx=Integer.parseInt(noTec.next());
            cubos(cubb, auxxx);
            
            System.out.println(devuelveCubo(cubb));
            
        }
        
        
    }
}

/*
 Realizar un programa que tenga una función que muestre cuál es el más grande de entre los números enteros positivo + 0, introducidos por teclado.
Los números se entregan al programa todos en una línea y la entrada de datos termina cuando el usuario introduce -1.
 */
package tema5;

import java.util.Scanner;

public class Ej17 {
 
    
    public static String lecturaHastaMenosUno(String num){
        int x;
        String  numerosMenosFin="";
        
        Scanner sc = new Scanner (num);
        
       while (sc.hasNext()) {
          
           
          x =Integer.parseInt(sc.next());
           
          if (x==-1) {
               break;
               
           }else{
               numerosMenosFin = numerosMenosFin + " " + x + " ";
           }
           
        
        }
        
        
        return numerosMenosFin;
    }
    
    
     public static int maximo(String numerosMenosFin){       
        int numFinal=0, x;
        Scanner sc = new Scanner(numerosMenosFin);
        
        
         while (sc.hasNext()) {
            x =Integer.parseInt(sc.next()); 
             if (x>numFinal) {
                 numFinal= x;
             }
             
         }
            
        
        return numFinal;
    }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String p, z;
        
        System.out.println("Introduce unos numeros separados por espacio ");
        p=sc.nextLine();
        
        z=lecturaHastaMenosUno(p);
        System.out.println(maximo(z));
        
       
    }
}

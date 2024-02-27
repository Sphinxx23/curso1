/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tema5;
import static Libreria.LibreriaMatematicas.numFact;
import java.util.Scanner;
public class Ej21 {
    public static int leerEnteroPositivo(String msg){
        int num;
        Scanner sc = new Scanner(System.in);
                
        do{
            System.out.println(msg);
            num=sc.nextInt();
        }while(num<0);
        
        return num;       
    }

    public static String numFactHasta(int num){      
       String r=" ";
        if (num==0) {
            r= r + "\n" + numFact(0) ;
        }else{           
            r=r + "\n" + numFact(num)+ numFactHasta(num-1);          
        }
        return r;
    }
    
    public static void main(String[] args) {
        int numUsu, cont;
        numUsu=leerEnteroPositivo("Introduce un numero entero");
        cont=numUsu;
        System.out.println(numFactHasta(numUsu));
        
                            
    }
}

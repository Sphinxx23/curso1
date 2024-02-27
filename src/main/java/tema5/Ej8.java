/*
 Escribir una función que retorne dado un número introducido por el usuario (n), todos los
números que son divisor de este número. ¿Podemos reutilizar algo realizado en temas
anteriores?
Ejemplo si n=24 -&gt; 1 2 3 4 6 8 12 24
 */
package tema5;
import java.util.Scanner;
public class Ej8 {
    
     /**
     *En este metodo puedes meter un mensaje personalizado, recoge un dato entero y comprueba que sea mayorque  0 
     * @param msg recoge un dato de tipo entero
     * @return devuelve un entero mayor a 0
     */    
   public static int leerEntero(String msg){
        int num;
        Scanner sc = new Scanner(System.in);
                
        do{
            System.out.println(msg);
            num=sc.nextInt();
        }while(num<=0);
        
        return num;       
    }
   
    /**
     * Este metodo coge dos enteros, a y b, y devuelve un true/false dependiendo de si b es divisor de a
     * @param a recoge un numero entero
     * @param b recoge otro numero entero
     * @return devuelve un boolean
     */
    public static boolean divisorDe (int a,int b){               
        return a%b==0;        
    }
    
    
    public static void main(String[] args) {
        int num;
        
        
        num=leerEntero("Introduce un numero positivo");
        
        for (int i = 1; i <= num; i++) {
            
            
            if (divisorDe(num, i)) {
                System.out.print(i + " ");
            }
            
        }
    }
}

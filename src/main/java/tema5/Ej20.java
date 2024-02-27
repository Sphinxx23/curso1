/*
 Realizar una función en Java que lea por teclado un número entero N no negativo y 
mostrar el factorial de todos los números desde 0 hasta N.

 */
package tema5;
import java.util.Scanner;
public class Ej20 {
   
    public static int leerEnteroPositivo(String msg){
        int num;
        Scanner sc = new Scanner(System.in);
                
        do{
            System.out.println(msg);
            num=sc.nextInt();
        }while(num<0);
        
        return num;       
    }

    public static int numFact(int num){
        int acc=1;
        if (num==0) {
            return 1;
        }else if(num<0){
            return -1;
        }else{
            for (int i = num; i >0; i--) {
                acc=acc*i;              
            }
            return acc;
        }
    }
    
    public static void main(String[] args) {
        int numUsu, factorial;
        numUsu=leerEnteroPositivo("Introduce un numero entero");
        for (int i = numUsu; i >=0; i--) {
            factorial=numFact(i);
            System.out.println("El factorial de " + i + " Es: " + factorial);
        }
        
    }
}

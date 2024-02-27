/*
 Realizar una nueva función que reciba un número entero positivo + 0 (n) y devuelva el
resultado de calcular: n!+(n-1)!+(n-2)!+ …+ 0!.
 */
package tema5;
import java.util.Scanner;
public class Ej9 {
    
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
     *Este metodo devuelve el factorial del entero que le pasamos
     * @param num recoge un numero entero
     * @return devuelve otro entero
     */
    public static int numFact(int num){
        int acc=1;
        if (num==0) {
            return 1;       
        }else{
            for (int i = num; i >0; i--) {
                acc=acc*i;              
            }
            return acc;
        }
    } 
     
     public static void main(String[] args) {
        int num, acc=0;
        
        num=leerEntero("introduce un entero positivo");
        
         for (int i = num; i >=0 ; i--) {
             
             acc+=numFact(i);
         }
         System.out.println("El total es " + acc);
    }
     
     
     
}

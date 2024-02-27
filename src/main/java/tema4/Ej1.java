/*
 Realiza un programa en java que muestre por pantalla los numeros del 0 al 9 incluidos, dos versiones, una con while y otra con do-while 
 */
package tema4;
public class Ej1 {
    public static void main(String[] args) {
        //variables
        byte num;
        
        //bucle
        num=0;
        while (num<10) {            
            System.out.println(num);
            num++;
        }
        
        num=0;
        do {            
            System.out.print(num);
            num++;
        } while (num<10);
    }
}

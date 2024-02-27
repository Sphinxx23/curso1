/*
 Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
 */
package tema6;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String prim, segund;
        
        System.out.println("Introduce primera palabra ");
        prim=sc.nextLine().trim();
        System.out.println("Introduce segunda palabra ");
        segund=sc.nextLine().trim();
        
        if (prim.length()<segund.length()) {
            System.out.println(prim);
        }else if(prim.length()>segund.length()) {
            System.out.println(segund);
        }else{
            System.out.println("null");
        }
    }
}

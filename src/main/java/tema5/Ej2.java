
package tema5;
import java.util.Scanner;
public class Ej2 {

    /**
     *Este metodo comprueba si es una vocal o no
     * @param c recoge el primer caracter
     * @return devuelve devuelve un boolean 
     */
    public static boolean esVocal(char c){
        if (c=='a'|| c=='A' || c=='e' || c=='E' || c=='I' || c=='i' || c=='o' || c=='O' || c=='u' || c=='U') {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        boolean b;
        
        System.out.println("Introduce un caracter ");
        ch = sc.nextLine().charAt(0);
        
        b=esVocal(ch);
        System.out.println("Es vocal? " + b);
            
    }
    
}

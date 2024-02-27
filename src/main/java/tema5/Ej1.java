/* Funcion que introduzca dos numeros y guarde el mayor de los dos, para posteriormente llamar a la funcion y sacar el mayor por pantalla*/

package tema5;
import java.util.Scanner;
public class Ej1 {

    /**
     *Este metodo compara dos numeros y devuelve el maximo de los dos
     * @param n1 recoge el primer numero
     * @param n2 recoge el segundo numero
     * @return retorna un entero
     */
    public static int numMayor(int n1, int n2){
        int aux;
        aux=n1>n2?n1:n2;
        return aux;       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, maxx;
        System.out.println("Introduce dos numero ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        maxx= numMayor(n1, n2);
        System.out.println("El num mayor es " + maxx);
    }
}

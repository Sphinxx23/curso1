/*
 Realiza un programa en java que pida dos números enteros (base, exponente) y calcule base
elevado a exponente sin usar el operador * ni Math.pow, es decir se debe realizar mediante
sumas. Supondremos que la base y el exponente son positivos ambos.
 */
package tema4;
import java.util.Scanner;
public class Ej22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int base, exponente, resultado, producto;
        
        do {            
            System.out.print("Ingrese la base (a): ");
            base = sc.nextInt();
            System.out.print("Ingrese el exponente (b): ");
            exponente = sc.nextInt();
        } while (base<0&&exponente<0);

        if (exponente==0) {
            System.out.println("Todo numero elevado a 0 es 1");
        }else{
            resultado = 1;
            for (int i = 0; i < exponente; i++) {
                producto = 0;
                for (int j = 0; j < base; j++) {
                    producto = producto + resultado;
                }
                resultado = producto;
            }
            System.out.println("El resultado es: " + resultado);
        }                              
    }
} //revisar bien

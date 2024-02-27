package tema5;
import java.util.Scanner;
public class EjPrueba {
    public static void muestraEco(int n1){
        for (int i = 0; i < n1; i++) {
            System.out.println("Eeeecoooo");
        }
    }
    
    public static void mostrarRango(int n1, int n2){
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
    public static int sumar(int n1, int n2){
        int suma;
        suma=n1+n2;
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1, n2;
        System.out.println("Introduce dos numeros separados por espacios");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        System.out.println("MuestrasEcos");
        muestraEco(n1);
        System.out.println("Rango ");
        mostrarRango(n1, n2);
        System.out.println("suma = " + sumar(n1, n2));
    }
}

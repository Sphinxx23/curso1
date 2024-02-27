/*
 Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar
las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros
vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */
package tema4;
import java.util.Scanner;
public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  codArt, cont600=0;
        float precLitro, multip, cantLitro, litTotal=0, cd1=0, factTotal=0;
        
        
        for (int i = 0; i < 5; i++) {                      
            
            do {                
                System.out.println("Introduce el codigo del articulo en formato [1]");
                codArt=sc.nextInt();
                System.out.println("Introduce la cantitat vendida en litros en formato [25]");
                cantLitro=sc.nextFloat();
                System.out.println("Introduce el precio del litro en formato [12,5]");
                precLitro=sc.nextFloat();
            } while (codArt<0 || cantLitro<0 || precLitro<0);
                      
            multip=cantLitro*precLitro;
            factTotal=factTotal+multip;
            litTotal=litTotal+cantLitro;
            
            if (multip>600) {
                cont600++;
            }
            if (codArt==1) {
                cd1=cantLitro;
            }
        }
        System.out.println("La facturacion total es " + factTotal);
        System.out.println("La cantidad de litros total es " + litTotal);
        System.out.println("La cantidad de facturas que pasan de 600 euros son " + cont600);
        System.out.println("La cantidad de litros del articulo 1 es " + cd1);
    }
}

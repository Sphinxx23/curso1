/*
 Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar
las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros
vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */
package practicaexamn;

import java.util.Scanner;

public class Ej17t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, cantLitros, aux1litros=0, cont=0;
        float precioLitro, factTtal=0, factIndiv;
        
        for (int i = 1; i < 6; i++) {
            do {                
                System.out.println("Introduce codigo, cantidad de litros y precio de cada litro separado por espacio de la factura numero " + i);
                codigo=sc.nextInt();
                cantLitros=sc.nextInt();
                precioLitro=sc.nextFloat();                
            } while (codigo<0||cantLitros<0 || precioLitro<0);
            
            factIndiv=cantLitros*precioLitro;
            factTtal=factTtal+factIndiv;
            if (factIndiv>600) {
                cont++;
            }
            if (codigo==1) {
                aux1litros=cantLitros;
            }
            
        }
        System.out.println("La facturacion total es " + factTtal + " €");
        System.out.println("El total de facturas que pasan los 600€ es " + cont);
        System.out.println("La cantidad de litros del articulo de codigo 1 es " + aux1litros + " litros");
        
    }
}

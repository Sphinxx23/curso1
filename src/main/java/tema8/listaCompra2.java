/*
 Modifica el ejercicio realizado para que también solicite la cantidad de cada artículo. 
En el listado resultante deberá aparecer dicha cantidad, el precio unitario y subtotal (cantidad * precio).
El total de la compra será la suma de todos los subtotales. Ejemplo:
TICKET DE COMPRA

Artículo   Cantidad	Precio	Subtotal
Tomates    3    	2,10 €	6,30 €
Lechuga    5             0,70	3,50 €
Lubina     1             12,50	12,50 €
…
Total compra 		 22,30 €

 */
package tema8;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class listaCompra2 {
    
    public static void rellenarMapa(Map<String, float[]> listaCompra) {
        Scanner sc = new Scanner(System.in);
        String auxStr, finn = "0";        
        float[] arra;
        
        float auxF1, auxF2, auxF3;
        
        do {
            arra = new float[3];
            System.out.println("Introduce el nombre del producto ");
            auxStr = sc.nextLine();
            
            System.out.println("Introducela cantidad ");
            auxF1 = sc.nextFloat();
            arra[0] = auxF1;
            
            System.out.println("Introducela el precio ");
            auxF2 = sc.nextFloat();
            arra[1] = auxF2;
            
            auxF3 = auxF1 * auxF2;
            arra[2] = auxF3;
            
            if (!(auxStr.equals(finn))) {
                listaCompra.put(auxStr, arra);
            }
            
            sc.nextLine();
        } while (!(auxStr.equals(finn)));
        
    }
    
    public static String mostrarMapa(Map<String, float[]> listaCompra) {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        Set<String> settt = new HashSet<String>();        
        String aux;
        float acum = 0;
        
        sb.append("LISTA DE LA COMPRA \nArtículo   Cantidad    Precio    Subtotal\n");
        
        settt = listaCompra.keySet();
        
        for (String auxKey : settt) {
            aux = Arrays.toString(listaCompra.get(auxKey));
            sb.append(auxKey + "  " + aux + "\n");
            acum = acum + (listaCompra.get(auxKey)[2]);
        }
        
        sb.append("Total compra:  " + df.format(acum) + " €");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Map<String, float[]> hsm = new HashMap<String, float[]>();
        
        rellenarMapa(hsm);
        
        System.out.println(mostrarMapa(hsm));
        
    }
}

/*
 Escribir un programa que cree la simulación de una cesta de la compra. El programa debe
preguntar el artículo y su precio (en la misma línea) y añadir el par al diccionario, hasta que
el usuario decida terminar (escribiendo 0 0). Después se debe mostrar por pantalla la lista
de la compra y el coste total, con el siguiente formato:

TICKET DE COMPRA
Artículo Precio
Tomates 2,49 €
Lechuga 0,76 €
Lubina 12,50 €
…
Total compra xxx,xx €
 */
package tema8;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra1 {
    
    public static String mostrarMapaYSum(Map<String, Float> listaCompra){
      DecimalFormat df= new DecimalFormat("#.##");
        float acum=0;
        StringBuilder sb = new StringBuilder();
        Set<String> settt= new HashSet<String>();
        sb.append("LISTA DE LA COMPRA \nArtículo \t Precio \n" );
        
        settt=listaCompra.keySet();
        
        for (String auxKey : settt) {
            sb.append(auxKey + " \t " + listaCompra.get(auxKey)+"\n");
            acum=acum+listaCompra.get(auxKey);
        }
        
        sb.append("Total compra:  " + df.format(acum) + " €");
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strAux, finall="0";
        float intgAux;
        
        Map<String, Float> hsm = new HashMap<String, Float>();
        
        do {            
            System.out.println("Introduce el producto");
            strAux = sc.nextLine();
            System.out.println("Introduce el precio");
            intgAux = sc.nextFloat();
            
            if (!(strAux.equals(finall))) {                
                hsm.put(strAux, intgAux);
            }
            sc.nextLine();
        } while (!(strAux.equals(finall)));
        
        
        System.out.println(mostrarMapaYSum(hsm));
        
        
    }
}

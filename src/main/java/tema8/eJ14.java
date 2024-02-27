/*
 cREAR NUEVO COMPARADOR DE sTRINGS QUE ORDENE POR NUMERO DE VOCALES DE MAYOR A MENOR, en caso de empate, aldabeticamente
 */
package tema8;

import java.util.*;

public class eJ14 {
    public static void main(String[] args) {
        List<String> coleccion= Arrays.asList("Unai", "Eugenio", "Nahuel", "Ivan");
                comparadorNumeroVocales cnv= new comparadorNumeroVocales();
                Collections.sort(coleccion, cnv);
                System.out.println("Ordenado");
                System.out.println(coleccion);
    }
}

/*
 Realiza un programa de ejemplo, haciendo uso de la clase Collections explicada en clase,  
donde pruebes como mínimo los métodos que aparecen a continuación (estudia el API antes de probarlo).

Ordenación (Sorting) -> sort
Barajado (Shuffling) -> shuffle
Manipulación de datos de rutina  -> reverse / swap / copy / addAll / fill
Búsqueda (Searching) -> binarySearch
Composición -> frequency / disjoint
Búsqueda de valores extremos -> max/min


 */
package tema8;

import java.util.ArrayList;
import java.util.Collections;

public class Ej12 {
    public static void main(String[] args) {
         ArrayList<Integer> listta1 = new ArrayList<Integer>();
        
        listta1.add(6);
        listta1.add(3);
        listta1.add(2);
        listta1.add(4);
        listta1.add(5);
        listta1.add(6);
        listta1.add(6);
        listta1.add(1);
        listta1.add(7);
        
        
        Collections.shuffle(listta1);
        System.out.println("Shuffle: " + listta1);
        
        Collections.sort(listta1);
        System.out.println("Sort: " + listta1);
        
        Collections.swap(listta1, 0, 3);
        System.out.println("Swap 0-9: " + listta1);
        
        
        System.out.println("BinarySearch num 5: " + Collections.binarySearch(listta1,5));
        System.out.println("Frequency num6: " + Collections.frequency(listta1, 6));
        System.out.println("Max: " + Collections.max(listta1));
        System.out.println("Max: " + Collections.min(listta1));
        
         ArrayList<Integer> listtaFin = new ArrayList<Integer>();
        
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        listtaFin.add(0);
        
        System.out.println("Lista 2 :" + listtaFin);
        
        Collections.copy(listtaFin, listta1);
        System.out.println("Lista1 copy en lista2 " + listtaFin);
        
        Collections.reverse(listtaFin);
        System.out.println( "Lista 2 reverse " + listtaFin);
    }
}

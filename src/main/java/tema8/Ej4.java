/*
Crea una colección de 20 números enteros aleatorios menores de 25 sin que existan
repetidos. Deberá obligatoriamente tener 20 números. Recorre dicha colección mostrando
aquellos números que sean menores de 10.
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ej4 {

    public static void rellenaConjunto(Set<Integer> col, int min, int max, int cantidad) {

        while(cantidad!=col.size()) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
           
        }

    }

    public static String muestraColeccionMenores(Collection<Integer> col, int valor) {
        StringBuilder sb = new StringBuilder();
        Iterator it;
        int aux;

        it = col.iterator();

        while (it.hasNext()) {

            aux = (int) it.next();

            if (aux < valor) {
                sb.append(aux + "<---->\n");
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        HashSet<Integer> t = new HashSet<Integer>();
        
        rellenaConjunto(t, 0, 250, 90);
        System.out.println(muestraColeccionMenores(t, 80));

    }
}

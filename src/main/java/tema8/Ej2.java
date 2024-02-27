/*
 Creaqr coleccionde 20 numeros aleatorios menores de 100 guardar en el orden que se vayan generando, sin duplicaods mostrar por pantalla sin importar el orden de como los muestra 
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ej2 {

    public static void rellenaConjunto(Collection<Integer> col, int min, int max, int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
        }

    }

    public static String muestraConjunto(Collection<Integer> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it;
        int cont = 1;

        it = col.iterator();

        while (it.hasNext()) {

            sb.append(it.next() + "<----> num: " + cont + "\n");
            cont++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        HashSet<Integer> c = new HashSet<Integer>();
        TreeSet<Integer> t = new TreeSet<Integer>();
        
        rellenaConjunto(c, 0, 99, 20);
        t.addAll(c);
        
        
        System.out.println(muestraConjunto(c));
        System.out.println(muestraConjunto(t));

    }
}

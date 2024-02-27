/*
 Realiza el mismo ejercicio pero en este caso se podrá repetir cada número aunque el
usuario introduzca múltiples veces el mismo. Mostrarlos por pantalla en el mismo orden en
que se introdujeron.
 */
package tema8;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Ej3 {
      public static void rellenaConjuntoUsuario(Collection<Integer> col, int cantidad) {
          Scanner sc = new Scanner(System.in);
          int aux;
          
        for (int i = 0; i < cantidad; i++) {
            aux=sc.nextInt();
            
            col.add(aux);
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
     
        LinkedList<Integer> t = new LinkedList<Integer>();
        
        rellenaConjuntoUsuario(t,20);
        
        
        
        
        System.out.println(muestraConjunto(t));

    }
}

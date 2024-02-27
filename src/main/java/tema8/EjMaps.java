/*
Realizar un programa en Java que solicite al usuario el DNI (String) y el nombre completo
de los alumnos de MULWEB1. El programa dejará de solicitar información cuando el usuario introduzca 
un “FIN” en el DNI. Rellena un mapa (a elegir por el usuario) con estas parejas. Posteriormente mostrará
un listado como el que aparece a continuación ordenado por el DNI.

Listado de Alumnos de MULWEB1

DNI		Nombre
20343243R	Juan Pérez
34243334A	Ana Sarabia
53243224T	Unai García
 
 */
package tema8;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EjMaps {

    public static void rellenaMapa(Map<String, String> mappa, String msg, String msg2) {
        Scanner sc = new Scanner(System.in);
        String auxKey, auxValor;

        do {
            System.out.println(msg);
            auxKey = sc.nextLine();
            
            if (!(auxKey.equalsIgnoreCase("FIN"))) {

                System.out.println(msg2);
                auxValor = sc.nextLine();

                mappa.put(auxKey, auxValor);
            }

        } while (!(auxKey.equalsIgnoreCase("FIN")));

    }

    public static void muestraMapa(Map<String, String> mappa) {
        String aux;
        Iterator it = mappa.keySet().iterator();

        while (it.hasNext()) {
            aux = it.next().toString();
            System.out.println("Clave: " + aux + " Valor: " + mappa.get(aux));

        }

    }

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();

        rellenaMapa(tm, "Introduce el DNI", "Intoduce el nombre del alumno ");
        muestraMapa(tm);

    }
}

/*
 Introduce por teclado, hasta que se introduzca "fin", una serie de nombres de alumnos, que se insertaran en una coleccion, 
de forma que se conserve el orden de insercion no pudiendo  repetirse (utiliza un conjunto ) Mostrar la lista por pantalla 
 */
package tema8;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        LinkedHashSet<String> conjAlumnos = new LinkedHashSet<String>();

        System.out.println("Introduzca los nombres de los alumnos separados por espacios");
        rellenaConjunto(conjAlumnos, "fin");
        System.out.println(muestraConjunto(conjAlumnos));

    }

    public static void rellenaConjunto(LinkedHashSet<String> conjAlumnos, String finalizacion) {
        Scanner sc = new Scanner(System.in);
        String nom;

        
        nom = sc.next();

        while (!nom.equals(finalizacion)) {
            conjAlumnos.add(nom);
            nom = sc.next();
        }
    }

    public static String muestraConjunto(LinkedHashSet<String> conjAlumnos) {
        StringBuilder sb = new StringBuilder();
        Iterator it;

        it = conjAlumnos.iterator();
        

        while (it.hasNext()) {
            sb.append(it.next() + "<---->\n");
        }

        return sb.toString();
    }
}

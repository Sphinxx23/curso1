/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ej15 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("banana", "manzana", "pera", "uva", "cereza");

        // Usando una clase anónima como comparador para ordenar al revés alfabéticamente
        Comparator<String> comparadorReverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2)*-1;
            }
        };

        Collections.sort(palabras, comparadorReverso);

        // Mostrar la lista ordenada
        System.out.println("Palabras ordenadas al revés alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}


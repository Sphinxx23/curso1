/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PcBox
 */
public class LibreriaSet {
    
    //Rellena un set con un numero especifico d numeros, por ejemplo 20, hasta que no tenga 20 nums no finaliza
    public static void rellenaConjunto(Set<Integer> col, int min, int max, int cantidad) {

        while(cantidad!=col.size()) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
           
        }

    }

//Rellena un set con nombres de alumnos hasta que llegue a una palabra de finalizacion asignada
    public static void rellenaConjunto(LinkedHashSet<String> conjAlumnos, String finalizacion) {
        Scanner sc = new Scanner(System.in);
        String nom;

        
        nom = sc.next();

        while (!nom.equals(finalizacion)) {
            conjAlumnos.add(nom);
            nom = sc.next();
        }
    }
    
    //Mostrar el conjunto usando iterator
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PcBox
 */
import java.util.*;

public class EjInvent3 {

    public static void rellenaMapa(Map<String, Integer> mappa, String cadena) {
        List<String> listta = new ArrayList<String>();
        String aux;
        int aux2;
        Scanner sc = new Scanner(cadena);

        while (sc.hasNext()) {
            aux = sc.next();
            listta.add(aux);

        }

        Comparator<String> comparadorReverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2) * -1;
            }
        };

        Collections.sort(listta, comparadorReverso);

        for (int i = 0; i < listta.size(); i++) {
            aux2 = Collections.frequency(listta, listta.get(i));
            mappa.put(listta.get(i), aux2);
        }

    }

    public static void listasRepsNoReps(Map<String, Integer> mappa, List<String> listta, List<String> listtaNo) {
        String aux;
        Iterator it = mappa.keySet().iterator();

        while (it.hasNext()) {
            aux = it.next().toString();

            if (mappa.get(aux) == 1) {
                listtaNo.add(aux);
            } else {
                listta.add(aux);
            }

        }
    }

    public static void main(String[] args) {
        String auxStr;
        Map<String, Integer> mappa = new LinkedHashMap<String, Integer>();
        List<String> listaReps = new ArrayList<String>();
        List<String> listaNoReps = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase");
        auxStr = sc.nextLine();

        rellenaMapa(mappa, auxStr);
        listasRepsNoReps(mappa, listaReps, listaNoReps);
        
        System.out.println("Lista de repetidos; " + listaReps);
        System.out.println("Lista de NO repetidos; " + listaNoReps);

    }
}

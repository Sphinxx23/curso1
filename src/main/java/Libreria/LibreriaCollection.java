/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author PcBox
 */
public class LibreriaCollection {
    //Rellena una coleccion con cosas que escribe el usuario u numero n de veces
    public static void rellenaConjuntoUsuario(Collection<Integer> col, int cantidad) {
          Scanner sc = new Scanner(System.in);
          int aux;
          
        for (int i = 0; i < cantidad; i++) {
            aux=sc.nextInt();
            
            col.add(aux);
        }

    }
    

//Rellena una coleccion de una cantidad determinada de numeros random entre el min y max indicado
    public static void rellenaColection(Collection<Integer> col, int min, int max, int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
        }

    }
    
    //Muestra la coleccion
    public static String muestraColection(Collection<Integer> col) {
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
}

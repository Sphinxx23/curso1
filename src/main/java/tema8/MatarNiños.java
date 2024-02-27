/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatarNiños {

    public static String matarNiños(int niños, int muerte) {
        ArrayList listaNiños = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int xx = 1;

        //Hacer coleccion de niños
        for (int i = 0; i < niños; i++) {
            listaNiños.add(xx);
            xx++;
        }

        //Eliminar niños hasta dejar 1
        while (listaNiños.size() != 1 && niños != 0) {
            Collections.rotate(listaNiños, -(muerte));
            listaNiños.remove(0);
        }

        sb.append(niños != 0 ? ("El niño que tiene que buscar a los demas es el: " + listaNiños.get(0) ) : "Fin de programa");

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int niños1, muerte1;

        do {
            System.out.println("Introduce el numero de niños y cada cuantos se elimnan");
            niños1 = sc.nextInt();
            muerte1 = sc.nextInt();
            System.out.println(matarNiños(niños1, muerte1));
        } while (niños1 != 0);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class PruebaFaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faker ff = new Faker();
        String pala;
        int aux;
        char hola, holaAux, comppp;
        char[] arr, arr2;

        pala = ff.pokemon().name();
        aux = pala.length();
        arr = new char[aux];

        arr2 = new char[aux];
        Arrays.fill(arr2, '_');

        for (int i = 0; i < aux; i++) {
            hola = pala.charAt(i);
            arr[i] = hola;
        }
        
        System.out.println(pala);

        for (int i = 7; i >= 0; i--) {
            System.out.println(" Usted tiene " + i + " vidas ");
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println(" introduce una letra para comprobar si esta ");
            holaAux = sc.nextLine().charAt(0);

            for (int j = 0; j < arr.length; j++) {
                comppp = arr[j];
                if (holaAux == comppp) {
                    arr2[j] = holaAux;
                    i++;

                }

            }

        }
    }
}

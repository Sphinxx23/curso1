/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Ej17 {

    public static void main(String[] args) {
        List<int[]> arrays = generarColeccionDeArrays(5);

        // Usando una clase anónima como comparador para ordenar según la suma de los arrays
        Comparator<int[]> comparadorSuma = new Comparator<int[]>() {
            @Override
            public int compare(int[] array1, int[] array2) {
               
                //Recorrer cada array con un for e ir sumando en un acumulador en vez de hacer esto
                int suma2 = 0;
                int suma1 = 0;
                for (int num1 : array1) {
                    suma1 += num1;
                }
                for (int num2 : array2) {
                    suma2 += num2;
                }
               
                /*
                int suma1 = Arrays.stream(array1).sum();
                int suma2 = Arrays.stream(array2).sum();
                */

                return Integer.compare(suma1, suma2);
            }
        };

        Collections.sort(arrays, comparadorSuma);

        // Mostrar la lista ordenada
        System.out.println("Arrays ordenados por suma:");
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    // Método para generar una colección de arrays de 3 números enteros aleatorios
    private static List<int[]> generarColeccionDeArrays(int cantidad) {
        List<int[]> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int[] array = {random.nextInt(10), random.nextInt(10), random.nextInt(10)};
            lista.add(array);
        }

        return lista;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ej16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(9, 2, 6, 4, 7, 12, 1, 5, 8);

        // Usando una clase anónima como comparador para ordenar según los criterios especificados
        Comparator<Integer> comparadorPersonalizado = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // Ordenar por múltiplos de 3 primero
                if (num1 % 3 == 0 && num2 % 3 == 0) {
                    return num1.compareTo(num2);
                } else if (num1 % 3 == 0) {
                    return -1; // num1 es múltiplo de 3 y debe ir antes
                } else if (num2 % 3 == 0) {
                    return 1; // num2 es múltiplo de 3 y debe ir antes
                } else {
                    return num1.compareTo(num2); // Ordenar el resto de números de menor a mayor
                }
            }
        };

        Collections.sort(numeros, comparadorPersonalizado);

        // Mostrar la lista ordenada
        System.out.println("Números ordenados según criterios especificados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}

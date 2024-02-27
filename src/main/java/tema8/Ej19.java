/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ej19 {

    public static void main(String[] args) {
        List<LocalTime> horas = generarListaDeHoras();

        // Usando una clase anónima como comparador para ordenar horas de manera ascendente
        Comparator<LocalTime> comparadorHoras = new Comparator<LocalTime>() {
            @Override
            public int compare(LocalTime hora1, LocalTime hora2) {
                return hora1.compareTo(hora2);
            }
        };

        Collections.sort(horas, comparadorHoras);

        // Mostrar la lista ordenada
        System.out.println("Horas ordenadas de manera ascendente:");
        for (LocalTime hora : horas) {
            System.out.println(hora);
        }
    }

    // Método para generar una lista de horas
    private static List<LocalTime> generarListaDeHoras() {
        List<LocalTime> lista = new ArrayList<>();
        lista.add(LocalTime.of(10, 30));
        lista.add(LocalTime.of(15, 45));
        lista.add(LocalTime.of(8, 0));
        lista.add(LocalTime.of(20, 15));
        return lista;
    }
}


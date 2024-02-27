/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ej18 {

    public static void main(String[] args) {
        List<LocalDate> fechas = generarListaDeFechas();

        // Usando una clase anónima como comparador para ordenar fechas de más actual a más antigua
        Comparator<LocalDate> comparadorFechas = new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate fecha1, LocalDate fecha2) {
                return fecha1.compareTo(fecha2)*-1;
            }
        };

        Collections.sort(fechas, comparadorFechas);

        // Mostrar la lista ordenada
        System.out.println("Fechas ordenadas de más actual a más antigua:");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }
    }

    // Método para generar una lista de fechas
    private static List<LocalDate> generarListaDeFechas() {
        List<LocalDate> lista = new ArrayList<>();
        lista.add(LocalDate.of(2022, 5, 15));
        lista.add(LocalDate.of(2023, 2, 28));
        lista.add(LocalDate.of(2021, 9, 10));
        lista.add(LocalDate.of(2024, 8, 5));
        return lista;
    }
}

